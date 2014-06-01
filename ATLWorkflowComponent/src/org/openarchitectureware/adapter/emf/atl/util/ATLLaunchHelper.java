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
package org.openarchitectureware.adapter.emf.atl.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//import org.eclipse.m2m.atl.adt.launching.ModelChoiceTab;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.eclipse.m2m.atl.core.service.LauncherService;
import org.eclipse.m2m.atl.core.emf.*;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;



/**
 * @author Markus Voelter
 * This class is adapted from ATL's AtlLaunchConfigurationDelegate, 
 * written by Freddy Allilaire
 * 
 */
public class ATLLaunchHelper  {
	
    public static String MODEL_INPUT = "MODEL_INPUT";
    public static String MODEL_OUTPUT = "MODEL_OUTPUT";
	
	/**
	 * 
	 * @param filePath		: path of the ATL Transformation
	 * @param isRefining    : mode 
	 * @param input			: Map {model_input --> metamodel_input}
	 * @param output		: Map {model_output --> metamodel_output}
	 * @param path			: Map {model_name --> URI}
	 * @param mode			: mode (DEBUG or RUN)
	 * @param checkSameModel TODO
	 * @param libsFromConfig: Map {lib_name --> URI}
	 * @return
	 */	
	@SuppressWarnings("unchecked")
	public static Map<ASMModel, ASMModel> runAtlLauncher(ResourceSet resourceSet, String filePath, boolean isRefining, Map<String,String> libsFromConfig, Map<String,String> input, Map<String,String> output, Map<String,String> path, String mode, boolean checkSameModel) {
		Map<ASMModel, ASMModel> toReturn = new HashMap<ASMModel, ASMModel>();
		
		try {			
			URI asmURI = URI.createPlatformResourceURI( filePath ,true);
			
			CoreService.registerLauncher("EMF VM", EMFVMLauncher.class);	
			
			CoreService.registerFactory("EMF", EMFModelFactory.class);
			
			CoreService.registerInjector("EMF", EMFInjector.class);
			
		    CoreService.registerExtractor("EMF", EMFExtractor.class);
			
			Map<String,Object> launcherOptions = Collections.EMPTY_MAP;
			
			ILauncher myLauncher = CoreService.getLauncher("EMF VM");
			ModelFactory myFactory = CoreService.getModelFactory("EMF");
			IInjector myInjector = CoreService.getInjector("EMF");
			myLauncher.initialize(launcherOptions);
			
			Map<String,Object> serviceOptions = new HashMap<String,Object>();
			if (isRefining) {
			    serviceOptions.put("isRefiningTraceMode", isRefining);
			}
			
			
			Map<String,IReferenceModel> metamodelMap = new HashMap<String,IReferenceModel>();
			for (String metamodelName:input.values()) {
				IReferenceModel referenceModel = myFactory.newReferenceModel();
				myInjector.inject(referenceModel, path.get(metamodelName));
			}
			
/*			for (String inputModel:input.keySet()) {
				IModel model = myFactory.newModel(metamodelMap.get(input.get(inputModel)));
				myInjector.inject(model, source, Collections.<String, Object> emptyMap());
				myLauncher.addInModel(model, inputModel, input.get(inputModel));
			}*/
			
			if (isRefining) {
				
			}
			
/*			if (isRefining) {
			    LauncherService.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), myLauncher, Collections.EMPTY_MAP, input, output, path, serviceOptions, Collections.EMPTY_MAP, resourceSet.getURIConverter().createInputStream(asmURI));
				for(String inputModel: input.keySet()) {
					System.out.println("writing " + inputModel + " to " + path.get(inputModel));
					IModel model = myLauncher.getModel(inputModel);
					writeTargetModel(model,path.get(inputModel));
				}
			}
			else {
				LauncherService.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), myLauncher, input, Collections.EMPTY_MAP, output, path, serviceOptions, Collections.EMPTY_MAP, resourceSet.getURIConverter().createInputStream(asmURI));
			}*/
			
			for(String outputModel: output.keySet()) {
				IModel model = myLauncher.getModel(outputModel);
				writeTargetModel(model,path.get(outputModel));
			}
		} catch (ATLCoreException e3) {
			e3.printStackTrace();
		}
		return toReturn;
	}
    
    private static void writeTargetModel(IModel model, String path) throws ATLCoreException {
    	CoreService.getExtractor("EMF").extract(model, path);
    }
	
}

