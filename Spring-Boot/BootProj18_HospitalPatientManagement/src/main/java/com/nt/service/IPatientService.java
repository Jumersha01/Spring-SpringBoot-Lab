package com.nt.service;

import com.nt.entity.Patient;

public interface IPatientService {
  Iterable<Patient> getPatienByPage(int pageNO,int pageSize);
  Iterable<Patient> addMuliplePatinet(Iterable<Patient> patient);
	
}
