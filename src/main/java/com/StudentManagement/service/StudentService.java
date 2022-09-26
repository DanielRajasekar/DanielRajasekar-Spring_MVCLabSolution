package com.StudentManagement.service;

import java.util.List;

import com.StudentManagement.entity.Student;

public interface StudentService {

	public void save(Student theStudent);

	public Student findById(int id);

	public List<Student> findAll();

	public void deleteById(int theId);


}
