package com.springboot.assignment.service;

import com.springboot.assignment.dao.StudentRepository;
import com.springboot.assignment.DTO.StudentDTO;
import com.springboot.assignment.entity.Student;
import com.springboot.assignment.exception.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;


    @Override
    @Transactional
    public List<Student> findByUniversityId(int id) {
        return studentRepository.findByUniversityId(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int theId) {
        Optional<Student> result = studentRepository.findById(theId);

        Student student = null;

        if(result.isPresent()){
            student=result.get();
        }
        else {
            throw new StudentNotFoundException(" Did not find the Student with id - "+theId);
        }
        return student;
    }

    @Override
    @Transactional
    public void save(StudentDTO studentDTO) {
        studentRepository.save(StudentDTO.convertDtoToEntity(studentDTO));
    }

    @Override
    public void deleteById(int theId) {
        studentRepository.deleteById(theId);
    }
}
