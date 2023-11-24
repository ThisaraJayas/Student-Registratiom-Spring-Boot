package com.student.reg.model;

public class Student {
    private String id;
    private int age;
    private String name;

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String course;
}
