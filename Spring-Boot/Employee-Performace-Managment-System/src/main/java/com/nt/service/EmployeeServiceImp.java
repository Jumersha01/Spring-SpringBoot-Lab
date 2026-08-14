package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public String addEmployee(Employee emp) {

		Long id = repo.save(emp).getId();

		return "Employee with id " + id + " saved";
	}

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> all = repo.findAll();

		return all;

	}

	@Override
	public Employee getEmployeeById(Long id) {

		Optional<Employee> opt = repo.findById(id);

		if (opt.isPresent())
			return opt.get();
		else
			return null;
	}

	@Override
	public String updateEmployee(Long id, Employee emp) {
		
		Optional<Employee> opt = repo.findById(id);
           Employee em = null;
           String message = null;
		if (opt.isPresent()) {
			  em=opt.get();
			  em.setName(emp.getName());
			  em.setDepartment(emp.getDepartment());
			  em.setDesignation(emp.getDesignation());
			  em.setSalary(emp.getSalary());
			  repo.save(em);
			  message = "Employe is updated";
		}

		return message;
	}

	@Override
	public String DeleteEmployee(Long id) {
        String message = null;
		if(this.getEmployeeById(id)!=null) {
			repo.delete(repo.findById(id).get());
			message = "Employee with id: "+id+" is Deleted";
		}
		return message;
	}

}
