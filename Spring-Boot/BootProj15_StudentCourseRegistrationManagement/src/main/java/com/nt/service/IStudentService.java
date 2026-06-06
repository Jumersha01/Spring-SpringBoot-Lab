package com.nt.service;

import java.util.Optional;

import com.nt.entity.Student;

public interface IStudentService {
	String registerStudent(Student s);

	Iterable<Student> getAllStudent();

	Optional<Student> getStudentById(Integer id);

	String updateStudent(Student s);

	void deleteStudent(Student s);

	long countStudents();

}
