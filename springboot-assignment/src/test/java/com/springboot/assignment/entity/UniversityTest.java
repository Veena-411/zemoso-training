package com.springboot.assignment.entity;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


 class UniversityTest {
    private University university;
    private List<Student> studentList;

    @Test
     void testEmptyConstructor(){
        university = new University();
        assertNotNull(university);
    }

    @Test
     void testArgsConstructor(){
        university = new University("Princeton University", "www.princeton.edu");
        assertEquals("Princeton University",university.getName());
        assertEquals("www.princeton.edu",university.getWebsite());
    }
    @Test
     void testId() {
        university=new University("Princeton University", "www.princeton.edu");
        university.setId(1);
        assertEquals(1, university.getId());
    }
    @Test
     void testGetName() {
        university=new University("Princeton University", "www.princeton.edu");
        assertEquals("Princeton University", university.getName());
    }

    @Test
     void testGetWebsite() {
        university=new University("Princeton University", "www.princeton.edu");
        assertEquals("www.princeton.edu", university.getWebsite());
    }

    @Test
     void testSetName() {
        university=new University();
        university.setName("Princeton University");
        assertEquals("Princeton University", university.getName());
    }

    @Test
     void testSetWebsite() {
        university=new University();
        university.setWebsite("www.princeton.edu");
        assertEquals("www.princeton.edu", university.getWebsite());
    }



    @Test
     void testGetStudents(){
        university=new University("Princeton University", "www.princeton.edu");
        studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", "johndoe@example.com"));
        studentList.add(new Student("John2", "Doe2", "johndoe2@example.com"));
        university.setStudentList(studentList);

        assertEquals(studentList,university.getStudentList());
    }

    @Test
     void testAdd(){
        university=new University("Princeton University", "www.princeton.edu");
        Student student = new Student("John","Doe","johndoe@example.com");
        university.add(student);
        assertEquals(student,university.getStudentList().get(0));

    }
    @Test
     void testToString() {
        university=new University("Princeton University", "www.princeton.edu");
        String result = university.toString();
        assertEquals("University{id=0, Name=Princeton University, website=www.princeton.edu}",result);
    }
}
