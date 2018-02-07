# SpringIO
About dispatcher-servlet.xml ---> here - https://docs.spring.io/spring/docs/3.0.x/spring-framework-reference/html/mvc.html#mvc-servlet

About applicationContext.xml :----->

Why do we need applicationContext.xml in Spring?

In the early days of Spring framework, Application context i.e the various weave and settings necessary to bootstrap, 
coordinate and control all objects, where done using XML file. Although one can break various settings and dependency 
injection into several context files, this process has been made easier In Spring 2.5 and later by annotation-driven settings.

What is the difference between applicationContext.xml and spring-servlet.xml?

In a MVC based project, again if you're not using annotation-driven weaving mechanism for your project, 
all your endpoint servlets can be setup in the spring-servlet.xml. Note that the name of the file is always self chosen.

About SPRING MVC Whole Diagram View http://tutorialspointexamples.com/wp-content/uploads/2015/12/SpringMVCFlowDiagram.jpg
