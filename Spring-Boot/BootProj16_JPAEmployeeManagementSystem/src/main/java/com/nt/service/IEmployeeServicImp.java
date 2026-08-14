package com.nt.service;

import java.util.Optional;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class IEmployeeServicImp implements IEmployeeService {

	@Autowired
	private IEmployeeRepository repository;

	@Override
	public String addSingleEmployee(Employee emp) {

		Employee em = repository.save(emp);

		return "Employee is saved with id:" + em.getEmployeeId();

	}

	@Override
	public String addMultipleEmployee(Iterable<Employee> emps) {
		Iterable<Employee> emp = repository.saveAll(emps);

		Long count = StreamSupport.stream(emp.spliterator(), false).count();

		return count + " Records are inserted:";
	}

	@Override
	public Optional<Employee> viewEmployeeById(Integer id) {
		Optional<Employee> emp = repository.findById(id);

		if (emp.isPresent()) {
			return emp;
		}

		return Optional.empty();
	}

	@Override
	public Iterable<Employee> viewAllEmployees() {

		Iterable<Employee> list = repository.findAll();
		return list;
	}

	@Override
	public boolean isEmployeeExist(Integer id) {

		if (repository.existsById(id)) {
			return true;
		}
		return false;
	}

	@Override
	public Long getCount() {
		Long count = repository.count();
		return count;
	}

	@Override
	public String updateEmployee(Employee emp) {
		Employee em = repository.save(emp);
		return em.getEmployeeId() + " Employee is Updated";
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void deleteEmployeeRecord(Employee emp) {
		repository.delete(emp);

	}

	@Override
	public void deleteMultipleEmployees(Iterable<Employee> emp) {
		repository.deleteAll(emp);

	}

	@Override
	public void deleteAllEmployees() {
		repository.deleteAll();

	}

	@Override
	public Iterable<Employee> findAllById(Iterable<Integer> id) {
		
		return repository.findAllById(id);
	}

}
