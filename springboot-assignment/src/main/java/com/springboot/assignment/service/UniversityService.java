package com.springboot.assignment.service;

import com.springboot.assignment.DTO.UniversityDTO;
import com.springboot.assignment.entity.University;

import java.util.List;



public interface UniversityService {

    public List<University> findAll();

    public University findById(int theId);


    public void save(UniversityDTO universityDTO);

    public void deleteById(int theId);

}
