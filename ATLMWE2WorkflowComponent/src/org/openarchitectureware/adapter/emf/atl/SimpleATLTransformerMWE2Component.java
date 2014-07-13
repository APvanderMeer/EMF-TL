/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Markus Voelter and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Markus Voelter - Initial API and implementation
 *
 * </copyright>
 */
package org.openarchitectureware.adapter.emf.atl;


import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.AbstractEMFWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.eclipse.m2m.atl.core.emf.*;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class SimpleATLTransformerMWE2Component extends AbstractEMFWorkflowComponent {
	
	private Map<String, String> inputMap = new HashMap<String, String>();
	private Map<String, String> outputMap = new HashMap<String, String>();
	private Map<String, String> modelPathMap = new HashMap<String, String>();
	private Map<String, String> metamodelPathMap = new HashMap<String, String>();
	
	private Map<String, IReferenceModel> metamodelMap = new HashMap<String, IReferenceModel>();
	
	private String asmFile;
	private String tempPath;
	private Boolean isRefining = false;
	
	ResourceSet resourceSet = new ResourceSetImpl();
	
	ILauncher myLauncher = null;
	ModelFactory myFactory = null;
	EMFInjector myInjector = null;
	
	public void setInputModelToMetamodelMap( String value ) {
		inputMap.put( firstPart(value), secondPart(value) );
		/*types.put(firstPart(value), ATLLaunchHelper.MODEL_INPUT);*/
	}
	
	public void setOutputModelToMetamodelMap( String value ) {
		outputMap.put( firstPart(value), secondPart(value) );
		/*types.put(firstPart(value), ATLLaunchHelper.MODEL_OUTPUT);*/
	}

	public void setModelPath( String value ) {
		modelPathMap.put( firstPart(value), secondPart(value) );
	}

	public void setMetamodelPath( String value ) {
		metamodelPathMap.put( firstPart(value), secondPart(value) );
/*		String modelName = firstPart(value);
		metamodelPathMap.put( modelName, secondPart(value) );
		handlers.put(modelName, "EMF");*/
		
/*		Resource resource = resourceSet.getResource(
				URI.createFileURI(secondPart(value)), true);
		EPackage model = (EPackage) resource.getContents().get(0);
		System.out.println(value + " " + model.getNsURI() + EPackage.Registry.INSTANCE.containsKey(model.getNsURI()));
    	if (!EPackage.Registry.INSTANCE.containsKey(model.getNsURI())) {
			EPackage.Registry.INSTANCE.put(model.getNsURI(), model);
			for (EPackage sub : model.getESubpackages()) {
				EPackage.Registry.INSTANCE.put(sub.getNsURI(), sub);
			}
		}*/
	}

	public void setAsmFile(String value) {
		asmFile = value;
	}
	
	public void setRefining(Boolean value) {
		isRefining = value;
	}
	
	public void setWorkDir( String value ) {
		tempPath = value;
		if ( !tempPath.endsWith("/") ) tempPath += "/";
	}

	@Override
	public void preInvoke() {
		CoreService.registerLauncher("EMF VM", EMFVMLauncher.class);	
		
		CoreService.registerFactory("EMF", EMFModelFactory.class);
		
		CoreService.registerInjector("EMF", EMFInjector.class);
		
	    CoreService.registerExtractor("EMF", EMFExtractor.class);
		
		
		try {
			myLauncher = CoreService.getLauncher("EMF VM");
			myLauncher.initialize(Collections.<String,Object>emptyMap());
			
			myFactory = CoreService.getModelFactory("EMF");
			myInjector = (EMFInjector)CoreService.getInjector("EMF");
		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void invoke(IWorkflowContext ctx) {
		try {
			for (String metamodelName : metamodelPathMap.keySet()) {
				IReferenceModel referenceModel = myFactory.newReferenceModel();
				myInjector.inject(referenceModel, metamodelPathMap.get(metamodelName));
				metamodelMap.put(metamodelName, referenceModel);
			}
			
			for (String inputName : inputMap.keySet()) {
				IModel model = myFactory.newModel(metamodelMap.get(inputMap.get(inputName)));
				EObject inputModel;
				if (EObject.class.isAssignableFrom(ctx.get(modelPathMap.get(inputName)).getClass())) {
					inputModel = (EObject)ctx.get(modelPathMap.get(inputName));
				}
				else {
					inputModel = ((java.util.ArrayList<EObject>)ctx.get(modelPathMap.get(inputName))).get(0);
				}
				myInjector.inject(model, inputModel.eResource());
				if (isRefining) {
					//((ASMModel)model).setCheckSameModel(false);
				    myLauncher.addInOutModel(model, inputName, inputMap.get(inputName));
				}
				else {
					myLauncher.addInModel(model, inputName, inputMap.get(inputName));
				}		
			}
			for (String outputName : outputMap.keySet()) {
				IModel model = myFactory.newModel(metamodelMap.get(outputMap.get(outputName)));
				//((ASMModel)model).setCheckSameModel(false);
				myLauncher.addOutModel(model, outputName, outputMap.get(outputName));
			}
			
			if (isRefining) {
				IReferenceModel refiningTraceMetamodel = myFactory.getBuiltInResource("RefiningTrace.ecore");
				IModel refiningTraceModel = myFactory.newModel(refiningTraceMetamodel);
				myLauncher.addOutModel(refiningTraceModel, "refiningTrace", "RefiningTrace");
			}

			Map<String,Object> options = new HashMap<String,Object>();
			options.put("allowInterModelReferences", "true");
			
			myLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(),  options, resourceSet.getURIConverter().createInputStream(URI.createPlatformResourceURI( asmFile ,true)));
			
			
			for (String outputName : outputMap.keySet()) {
				EMFModel model = (EMFModel)myLauncher.getModel(outputName);
				ctx.put(modelPathMap.get(outputName), model.getResource().getContents().get(0));
			}
		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*		writeSlotsToTempFiles(ctx);
		replaceOutSlots(ctx);
		transform();
		readSlotsFromTempFiles(ctx);*/ 
	}
	
	@Override
	public void postInvoke() {
		// TODO Auto-generated method stub
		
	}
	
/*	private void writeSlotsToTempFiles(IWorkflowContext ctx) {
		for (String modelName : inputMap.keySet()) {
			String path = modelPathMap.get(modelName);
			if ( path.startsWith("slot:")) {
				String slotName = path.substring(5);
				String slotFileName = tempPath+slotName+".xmi";
				writeModelToFile(slotName, slotFileName, ctx);
				modelPathMap.put( modelName, slotFileName );
				if (isRefining) {
					slotMap.put( slotFileName, slotName );
				}
			}
		}
	}*/

/*	private void replaceOutSlots(IWorkflowContext ctx) {
		for (String modelName : outputMap.keySet()) {
			String path = modelPathMap.get(modelName);
			if ( path.startsWith("slot:")) {
				String slotName = path.substring(5);
				String slotFileName = tempPath+slotName+".xmi";
				modelPathMap.put( modelName, slotFileName );
				slotMap.put( slotFileName, slotName );
			}
		}
	}*/

/*	private void readSlotsFromTempFiles(IWorkflowContext ctx) {
		for (String slotFileName : slotMap.keySet()) {
			String slotName = slotMap.get(slotFileName);
			readModelFromFile(slotName, slotFileName, ctx);
		}
	}*/

/*	private void transform() {
		Map<String, String> allPathsMap = new HashMap<String, String>();
		allPathsMap.putAll( modelPathMap );
		allPathsMap.putAll( metamodelPathMap );
		ATLLaunchHelper.runAtlLauncher( resourceSet, asmFile, isRefining, new HashMap<String,String>(), inputMap, outputMap,
				allPathsMap, "RUN", false );
		System.out.println("Transformation Completed.");
	}
*/
/*	private void writeModelToFile(String slotName, String slotFileName, IWorkflowContext ctx) {
		Writer w = new Writer();
		w.setModelSlot( slotName );
		w.setUri( slotFileName );
		//w.setCloneSlotContents(true);
		w.invoke( ctx);
	}

	private void readModelFromFile(String slotName, String slotFileName, IWorkflowContext ctx) {
		Reader r = new Reader();
		r.setModelSlot( slotName );
		r.setUri( slotFileName );
		r.invoke( ctx);
	}
*/
	private String firstPart(String value) {
		int p = value.indexOf("->");

		String part = value.substring(0,p).trim();
		return part;
	}

	private String secondPart(String value) {
		int p = value.indexOf("->");
		String part = value.substring(p+2).trim();
		return part;
	}

	@Override
	protected void invokeInternal(WorkflowContext arg0, ProgressMonitor arg1,
			Issues arg2) {
		
	}
	
}