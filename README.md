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

applicationContext comes from Spring Framework: it manages the business/DAO beans.

spring-servlet comes from Spring MVC: it manages the web beans.


3
down vote
A Web application can have many servlets running at the same time, therefore:

spring-servlet.xml will hold beans only visible to a particular servlet.

You could have many different servlets running

spring-servlet2.xml
spring-servlet3.xml
messaging-servlet.xml 
etc.

applicationContext.xml will hold application wide beans. Therefore all the servlets running will have access to the beans defined in applicationContext.xml. However, this is a one way dependency, your servlets can access you applicationContext.xml beans but your applicationContext cannot access any of your servlet beans.

About SPRING MVC Whole Diagram View http://tutorialspointexamples.com/wp-content/uploads/2015/12/SpringMVCFlowDiagram.jpg
