package com.nt.service;

import com.nt.entity.University;

public interface IUniversityService {
  public String saveUniversity(University university);
  Iterable<University> retriveUniversityDetails();
}
