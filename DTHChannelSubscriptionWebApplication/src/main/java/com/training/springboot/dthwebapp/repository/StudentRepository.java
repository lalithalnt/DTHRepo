package com.training.springboot.dthwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.training.springboot.dthwebapp.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
