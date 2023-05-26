package com.springboot.assignment.service;

import com.springboot.assignment.DTO.StudentDTO;
import com.springboot.assignment.entity.Student;

import java.util.List;


public interface StudentService {

    public List<Student> findByUniversityId(int id);
    public List<Student> findAll();

    public Student findById(int theId);

    public void save(StudentDTO studentDTO);

    public void deleteById(int theId);
}
