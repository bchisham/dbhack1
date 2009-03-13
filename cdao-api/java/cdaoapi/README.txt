Required Java libraries
=======================

1. Pellet (Manually installation required)

Logical reasoner for OWL data.
The latest version of the Pellet reasoner should be manually downloaded from the following link http://clarkparsia.com/pellet/download/.
Then, All jar files in the <Pellet installation directory>/lib folder should be in the classpath before running
the application.

The maven repositories only contains older version of Pellet Version 1.5.

2. Jena

Semantic web API.
This library should be automatically downloaded from the Maven repository.

3. Jastor

For converting the CDAO.owl schema to Java files.
It is already there in the src/main/local-lib folder of the cdaoapi project.


Eclipse Instruction:
===================

1. Importing the cdaoapi project to Eclipse

Open eclipse -> File -> import-> click Existing project into Workspace and then click on the next button.
Enter the location of the cdaoapi project home folder (where the .classpath and .project files are located ) and 
select the 'cdaoapi' project and then click on finish button to open it in the eclipse.

2. Adding M2_REPO variable location in Eclipse

In Eclipse (3.4v), in the menu bar click ..

> Project -> Properties -> Java Build path in the left panel -> libraries Tab -> Add Variable button -> Configure 
and then add M2_REPO variable and its location in your computer. The default location is ~/.m2/repository.

Note: to reset the eclipse setting type 'mvn eclipse:eclipse' in the folder where the pom.xml file is located to regenerate
all the eclipse settings.
