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



---

# Day 4 - Setter Dependency Injection

## Topics Learned

* Setter Dependency Injection
* Bean Reference
* property tag
* value attribute
* ref attribute

## Course Bean

```xml
<bean id="course"
      class="com.tushar.Course">

    <property name="courseName"
              value="Spring Framework"/>

</bean>
```

## Student Bean

```xml
<bean id="student"
      class="com.tushar.Student">

    <property name="name"
              value="Tushar"/>

    <property name="course"
              ref="course"/>

</bean>
```

## Output

Student Name : Tushar

Course Name : Spring Framework

## Main Concept

Spring injects dependent objects using setter methods.

Example:

```java
student.setCourse(course);
```

This is called Setter Dependency Injection.

