# SpringIO

This is all about how to create a simple Hello Spring WEB Project using Maven.

First create a Maven Java Web Project.
To add Spring to your project add following property and dependency at you pom.xml

<properties>
  <org.springframework.version>4.0.1.RELEASE</org.springframework.version>
</properties>

This dependency will add spring

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>${org.springframework.version}</version>
            <scope>runtime</scope>
        </dependency>

This following 2 dependency will add spring MVC pattern :

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-web</artifactId>
            <version>${org.springframework.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>${org.springframework.version}</version>
        </dependency>

Then just create WEB-INF folder just like this project and add those files inside it. 
BE CAREFUL ABOUT THE VERSION OF SPRING CONTEXT IN applicationContext.xml USE  3.0 XSD FOR SPRING 4.01 
