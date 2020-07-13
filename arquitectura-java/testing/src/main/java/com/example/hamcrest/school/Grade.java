package com.example.hamcrest.school;

import java.util.Objects;

public class Grade {

    private double value;

    private String course;

    private Student student;

    public Grade(double value, String course) {
        this.value = value;
        this.course = course;
    }

    public Grade(double value, String course, Student student) {
        this.value = value;
        this.course = course;
        this.student = student;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return course.equals(grade.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    public boolean isGreater(Grade gradeOtherMaths) {
        if(!this.equals(gradeOtherMaths)) {
            throw new RuntimeException("Both grades are the same.");
        }

        return this.getValue() > gradeOtherMaths.getValue();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
