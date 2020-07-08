package com.example.hamcrest.school;

import static org.junit.jupiter.api.Assertions.*;

import com.example.introduction.school.Grade;
import org.junit.jupiter.api.Test;

class GradeTest {

    @Test
    void equals() {
        com.example.introduction.school.Grade gradeMaths = new com.example.introduction.school.Grade(5, "Maths");
        com.example.introduction.school.Grade gradeGeo = new com.example.introduction.school.Grade(10, "Geo");

        boolean isEqualGrade = gradeMaths.equals(gradeGeo);

        assertFalse(isEqualGrade);

    }

    @Test
    void isGreater() {
        com.example.introduction.school.Grade gradeMaths = new com.example.introduction.school.Grade(5, "Maths");
        com.example.introduction.school.Grade gradeOtherMaths = new Grade(8, "Maths");

        boolean isEqualGrade = gradeMaths.isGreater(gradeOtherMaths);

        assertFalse(isEqualGrade);
    }

}