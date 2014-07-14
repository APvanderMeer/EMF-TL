EMF-TL
======
EMFTL is a type checker specification language, described in the PhD thesis "Domain Specific Languages and their Type Systems", by A.P. van der Meer. In this readme, only the basic installation and use of the language will be described. For more information, please refer to the aforementioned thesis. 
EMFTL is based on the Eclipse Modeling Framework and the ECLiPSe Constraint Language. In order to use it, both programs need to be installed. In addition, in order to use EMF-TL in Eclipse, a number of plugins needs to be added to it. It is strongly advised to use the EMF version of Eclipse, which contains a number of basic modelling plugins. In addition to those, you need to install from update sites:
* ATL
* MWE2
*Xtend2
*EMFText
Next, you need to install a number of plugins based on projects provided in this archive. This can be easily done by importing all provided projects into a workspace and using the export->install into host option for some of them. In particular, those are:
* Constraints
* Constraints.edit
* Constraints.editor
* Constraints.tests
* org.emftext.language.textAML3
* org.emftext.language.textAML3.resource.textAML3
* org.emftext.language.textAML3.resource.textAML3.ui
Installing the plugins enables the EMF-TL editor, which allows you to create EMF-TL type system documents. In order to use a type system, it needs to be compiled first. To compile a type system, first import the TypeCheckerGenerator2 project into a workspace. Then, apply the ecoreToMapping transformation to the type system and the ecore file of the metamodel it corresponds to. To do this, you have to create an appropriate run configuration. For the ECORE metamodels, you can simply check the “is metametamodel” checkbox. The source metamodel should be the textAML3 metamodel, taken from the EMF registry. The target metamodel should be the Mapping metamodel found in the project. The IN source model should be the metamodel of the input of the type checker, and the IN2 source model should be the output metamodel of the type checker. The RULES input model should be the document containing type system rules.
Second, apply the mappingToRule transformation to the output of the first transformation. Again, a run configuration needs to be created for this. As MAPPING metamodel, select the Mapping.ecore file. As input file, select the mapping file created in the previous step. This results in a text file containing an ATL transformation, which may take some time. This transformation is compiled automatically by the ATL system into an ASM file. Once this is done, all components of the type checker are complete.
The next step in constructing a type checker involves putting the components together. This is done using a so-called workflow. An example workflow is provided in “constraintgenExample.mwe2”. In order to use this workflow, it is best to create a new project, and add the plugins and jar files created before as dependecies. In addition, you need to add the Eclipse.jar found in the ECLiPSe installation directory, as well the following files:
* EclipseGenerator
* ResultMerger
* ATLMWE2WorkflowComponent
* ECLiPSeMWE2WorkflowComponent
The workflow handles the process of initializing and invoking the components in the right order. To configure this process, it contains a number of parameters in the form of variables listed at the start of the workflow. In general, all of these values should be customized to the specific properties of a language.
•	modelName: Name of the model to be typechecked
•	inputDir: Directory containing the input model, relative to the root directory.
•	tempDir: Directory where tempory files will be stored, relative to the root directory.
•	outputDir: Directory where ouput files will be stored, relative to the root directory.
•	typeSystem: Name of the type system
•	inputLanguage: Name of the input language
•	inputExtension: Extension of the input model
•	tempLanguage: Name of the language used for temporary files
•	tempLanguageURI: Namespace URI of the temparay language metamodel
•	tempExtension: Extension of temporary files
•	outputLanguageURI: Namespace URI of the output metamodel
•	outputExtension: Extension of the output file
•	scopingPath: Path to the scoping transformation, relative to the project root
•	typeCheckerPath: Path to the type checker transformation, relative to the project root.
Once all values have been customized, the type checker can be executed by invoking the Run command in the context menu of the workflow. Doing so will automatically create a new run configuration that will be used for future execution of the workflow. During the first execution, the workflow will almost certainly fail, because the ECLiPSe system requires an argument to be added in the run configuration. In the newly created run configuration, add the path to the ECLiPSe executable to complete configuration. The type checker workflow should now run succesfully when executed.
The result of execution is either a typed model, if the input model can be typed, or a list of error messages, indicating which elements could not be typed

