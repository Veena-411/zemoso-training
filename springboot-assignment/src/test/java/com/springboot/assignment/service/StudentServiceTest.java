package com.springboot.assignment.service;

import com.springboot.assignment.dao.StudentRepository;
import com.springboot.assignment.DTO.StudentDTO;
import com.springboot.assignment.entity.Student;
import com.springboot.assignment.exception.StudentNotFoundException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {
    @Mock
    private StudentRepository studentRepository;
    @InjectMocks
    private StudentServiceImpl studentService;

    @BeforeEach
    public void setUp() throws Exception{
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindByUniversityId(){
        //Given
        List<Student> students = new ArrayList<>();
        students.add(new Student( "John", "Doe", "johndoe@example.com"));
        students.add(new Student( "Sarah", "Johnson", "sarah@example.com"));
        //when
        when(studentRepository.findByUniversityId(1)).thenReturn(students);
        List<Student> studentList = studentService.findByUniversityId(1);

        //then
        assertEquals(students,studentList);
    }

    @Test
    public void testFindAll(){
        //given
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", "johndoe@example.com"));
        students.add(new Student("Sarah", "Johnson", "sarah@example.com"));

        //when
        when(studentRepository.findAll()).thenReturn(students);

        // Call the method to be tested
        List<Student> result = studentService.findAll();

        // then
        assertEquals(2, result.size());
        assertEquals("John", result.get(0).getFirstName());
        assertEquals("Sarah", result.get(1).getFirstName());
    }
    @Test
    public void testFindById(){
        //given
        Student student = new Student("Sarah", "Johnson", "sarah@example.com");
        student.setId(1);
        //when
        when(studentRepository.findById(1)).thenReturn(Optional.of(student));
        Student student1 = studentService.findById(1);
        //then
        assertEquals(student,student1);
    }
    @Test(expected = RuntimeException.class)
    public void testFindByIdNotFound(){
        studentService.findById(1);
    }

    @Test
    public void testFindByIdNotFound2(){

        Throwable exception = assertThrows(StudentNotFoundException.class,()->{studentService.findById(1);});
        assertEquals(" Did not find the Student with id - "+1,exception.getMessage());
    }
    @Test
    public void testSave(){
        //given
        Student student = new Student("Sarah", "Johnson", "sarah@example.com");
        StudentDTO studentDTO = StudentDTO.convertEntityToDto(student);
        //when
        studentService.save(studentDTO);
        //then
        when(studentRepository.findById(1)).thenReturn(Optional.of(student));
        Student actualStudent = studentService.findById(1);
        Assert.assertEquals(student,actualStudent);
    }
    @Test
    public void testDelete(){
        //given
        Student student = new Student("Sarah", "Johnson", "sarah@example.com");
        student.setId(1);
        // when
        studentService.deleteById(1);
        //then
        verify(studentRepository,times(1)).deleteById(1);
    }
}
