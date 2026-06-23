package com.nt.service;

import java.util.Optional;

import com.nt.entity.EmployeeResume;

public interface IEmployeeResumeService {
 String saveEmployeeResume(EmployeeResume empResume);
 Optional<EmployeeResume> viewEmployeeResumt(int id);
 Iterable<EmployeeResume> viewAllEmployeeResume();
 void deleteEmployeeResume();
}
