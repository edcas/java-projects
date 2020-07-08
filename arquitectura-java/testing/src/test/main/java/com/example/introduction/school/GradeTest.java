package com.example.introduction.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    @Test
    void equals() {
        Grade gradeMaths = new Grade(5, "Maths");
        Grade gradeGeo = new Grade(10, "Geo");

        boolean isEqualGrade  = gradeMaths.equals(gradeGeo);

        assertFalse(isEqualGrade);

    }

    @Test
    void isGreater() {
        Grade gradeMaths = new Grade(5, "Maths");
        Grade gradeOtherMaths = new Grade(8, "Maths");

        boolean isEqualGrade  = gradeMaths.isGreater(gradeOtherMaths);

        assertFalse(isEqualGrade);
    }

}