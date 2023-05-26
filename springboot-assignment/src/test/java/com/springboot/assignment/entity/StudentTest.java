package com.springboot.assignment.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


 class StudentTest {
    private Student student;
    private University university;


    @Test
     void testNoArgsConstructor(){
        student=new Student();
        assertNotNull(student);
    }

    @Test
     void testArgsConstructor(){
        student = new Student("Sarah","Johnson","sarah@gmail.com");
        assertEquals("Sarah",student.getFirstName());
        assertEquals("Johnson",student.getLastName());
        assertEquals("sarah@gmail.com",student.getEmail());

    }
    @Test
     void testId(){
        student = new Student("Sarah","Johnson","sarah@gmail.com");
        student.setId(1);
        assertEquals(1,student.getId());
    }
    @Test
     void testFirstName(){
        student = new Student("Sarah","Johnson","sarah@gmail.com");
        assertEquals("Sarah",student.getFirstName());
    }
    @Test
     void testLastName(){
        student = new Student("Sarah","Johnson","sarah@gmail.com");
        assertEquals("Johnson",student.getLastName());
    }
    @Test
     void testEmail(){
        student = new Student("Sarah","Johnson","sarah@gmail.com");
        assertEquals("sarah@gmail.com",student.getEmail());
    }

    @Test
     void testSetFirstName(){
        student = new Student();
        student.setFirstName("Sarah");
        assertEquals("Sarah",student.getFirstName());

    }
    @Test
     void testSetLastName(){
        student = new Student();
        student.setLastName("Johnson");
        assertEquals("Johnson",student.getLastName());
    }
    @Test
     void testSetEmail(){
        student = new Student();
        student.setEmail("sarah@gmail.com");
        assertEquals("sarah@gmail.com",student.getEmail());
    }



    @Test
     void testUniversity(){
        student=new Student("Sarah","Johnson","sarah@gmail.com");
        university=new University("Arizona State University","www.arizona.edu");
        student.setUniversity(university);
        assertEquals(university,student.getUniversity());
    }
    @Test
     void testToString(){
        student = new Student("Sarah","Johnson","sarah@gmail.com");
        String result = student.toString();
        assertEquals("Student{id=0, firstName=Sarah, lastName=Johnson, email=sarah@gmail.com}",result);
    }
}
