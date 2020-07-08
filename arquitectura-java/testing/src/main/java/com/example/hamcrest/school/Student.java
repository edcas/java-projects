package com.example.hamcrest.school;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;

    private List<Grade> grades = new ArrayList<Grade>();

    public Student(String name, List<Grade> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public void addNote(Grade grade) {
        this.grades.add(grade);
    }

    public void removeNote(Grade grade) {
        this.grades.remove(grade);
    }
    
}
