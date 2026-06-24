package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Course;
import com.nt.entity.University;
import com.nt.service.IUniversityService;
@Component
public class UniversiyRunnerTest implements CommandLineRunner {

	@Autowired
	private IUniversityService service;
	@Override
	public void run(String... args) throws Exception {
//		Course c1 = new Course("Java", "3 Months");
//		c1.setCourseId(101L);
//		c1.setFee(5000.0);
//
//		Course c2 = new Course("Spring Boot", "2 Months");
//		c2.setCourseId(102L);
//		c2.setFee(7000.0);
//
//		Course c3 = new Course("Hibernate", "45 Days");
//		c3.setCourseId(103L);
//		c3.setFee(6000.0);
//
//		Course c4 = new Course("Microservices", "2 Months");
//		c4.setCourseId(104L);
//		c4.setFee(8000.0);
//
//		Course c5 = new Course("React JS", "3 Months");
//		c5.setCourseId(105L);
//		c5.setFee(6500.0);
//		List<Course> courses=Arrays.asList(c1,c2,c3,c4,c5);
//	    
//		University university = new University(1L,"Kavyayatri Bahinabai North Maharashtra University","Jalgaon",courses);
		//String message = service.saveUniversity(university);
		 
		Iterable<University> list = service.retriveUniversityDetails();
		list.forEach(e->{
			System.out.println(e);
		});
	}

}
