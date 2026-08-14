package com.nt.service;

import java.util.List;

import com.nt.entity.Student;

public interface IStudentService {
   Student addStudent(Student student);
   List<Student> getAllStudent();
   String deleteStudent(Long id);
   
}
