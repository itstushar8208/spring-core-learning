# Day 3 - First Spring Project

## Topics Learned

* Maven Introduction
* pom.xml
* Dependencies
* Spring Context
* Spring Bean
* ApplicationContext
* XML Configuration

## Spring Dependency

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.2.8</version>
</dependency>
```

## Bean Configuration

```xml
<bean id="student"
      class="com.tushar.Student"/>
```

## Output

Student is studying Spring Framework

## Main Concept:

Instead of creating objects manually using:

```java
Student student = new Student();
```

Spring creates and manages objects using the IoC Container.
