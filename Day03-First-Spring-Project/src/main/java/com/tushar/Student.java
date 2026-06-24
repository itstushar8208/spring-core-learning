package com.tushar;

public class Student {

    private String name;
    private Course course;

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Course Name : " + course.getCourseName());
    }
}