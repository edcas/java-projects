package com.example.hamcrest.school;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Grade math;
    Grade geo;
    Grade english;
    List<Grade> grades = new ArrayList<Grade>();

    @BeforeEach
    void setUp() {
        math = new Grade(7, "Math");
        geo = new Grade(8, "Geo");
        english = new Grade(10, "English");
    }

    @AfterEach
    void tearDown() {
        grades = null;
    }

    @Test
    @DisplayName("Add a grade to a student")
    void addGrades() {
        // Give
        grades.add(math);
        grades.add(geo);
        Student student = new Student("John Doe", grades);

        // When
        student.addNote(english);

        //Then
        assertEquals(3, student.getGrades().size());

        // Hamcrest
        assertThat(3, equalTo(student.getGrades().size()));
        assertThat(student.getGrades(), hasItem(english));
    }

    @Test
    @DisplayName("Remove a grade to a student")
    void removeGrades() {
        grades.add(math);
        grades.add(geo);

        Student student = new Student("John Doe", grades);
        student.removeNote(geo);

        assertEquals(1, student.getGrades().size());

        // Hamcrest
        assertThat(1, equalTo(student.getGrades().size()));
        assertThat(student.getGrades(), not(hasItem(geo)));
    }
}