package com.nt.service;

import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.data.autoconfigure.web.DataWebProperties.Sort;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployRepository;
@Service
public class IEmployeeServiceIMp implements IEmployeeService {
	
	@Autowired
	private IEmployRepository repo;

	@Override
	public Iterable<Employee> getEmployeByPage(int pagNO, int pageSize) {
		PageRequest pageable = PageRequest.of(pagNO, pageSize);
		return  repo.findAll(pageable);
	}

	@Override
	public Iterable<Employee> getEmployeeSortedBySalary() {
	  Sort sort = Sort.by(Sort.Direction.ASC, "salary");
		return  repo.findAll(sort);
	}

	@Override
	public Iterable<Employee> getEmployeeSortedByName() {
		
		  Sort sort = Sort.by(Sort.Direction.ASC, "empName");
			return  repo.findAll(sort);
	
		
	}

	@Override
	public String addMultipleEmployee(Iterable<Employee> emps) {
		Iterable<Employee> emp = repo.saveAll(emps);

		Long count = StreamSupport.stream(emp.spliterator(), false).count();

		return count + " Records are inserted:";
	}

}
