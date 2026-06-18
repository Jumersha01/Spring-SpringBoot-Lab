package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Course;
import com.nt.repository.CourseRepository;

@Service
public class CourseService {
@Autowired
private CourseRepository repo;

 List<Course> findByCategory(String category){
	return repo.findByCategory(category);
 }
 
 List<Course> getByInstructor(String name){
	 return repo.findByInstructorName(name);
 }
 
 List<Course> findByLessPrice(Double price){
	 return repo.findByPriceLessThan(price);
 }
 
 List<Course> findByGreaterPrice(Double price){
	 return repo.findByPriceGreaterThan(price);
 }
 
 List<Course> findByHourseGreater(Integer hour){
	 return repo.findByDurationInHoursGreaterThan(hour);
 }
 
 List<Course> findByRating(Double rating){
	 return repo.findByRatingGreaterThanEqual(rating);
 }
 
 List<Course> findByLanguage(String language){
	 return repo.findByLanguage(language);
 }
  
 List<Course> findByCourseTitle(String keyword){
	 return repo.findByCourseTitleContaining(keyword);
 }
   
}
