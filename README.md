# Spring-using-Java-annotation
Spring configuration using Java annotation

What are java annotations?
1. Special labels and markers added to the java classes
2. Provide the metadata about the class
3. Java annotations can Proceed at the compile time or run time for special processing

The @Override is a example of annotation.

Why use apring annotation
1. Xml configuration can be verbose
2. Configure spring beans with annotations
3. Annotation minimize the XML configuration

The spring will scan your java class for special anotaion
It will automatically register the bean in the spring container

Development process for using annotation in the spring
1. Enable component scanning in the spring config file.
2. Add the @Component annotation to your java class
3. Retrieve the bean from the spring container.
