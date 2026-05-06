package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("courses")
public class Course {
    @Value("${course.id}")
	private int courseId;
	
	@Value("${course.name}")
	private String courseName;
	
	@Value("${course.trainer}")
	private String  trainerName;
	
	@Value("${course.duration}")
	private double duration;
	
	@Value("${course.fee}")
	private double courseFee;
	
	@Value("${course.certificate}")
	private boolean certificateAvaible;
	
	public void showCourseDetails() {
		System.out.println("Course Details: \nCourse id:"+this.courseId+"\nCourse name: "+this.courseName+"\nTrainer name: "+this.trainerName+"\nCourse Duration: "+this.duration+"\nCourse Fee: "+this.courseFee+"\nCourse Certificate: "+this.certificateAvaible);
	}
	
	public void calculateDiscountedFee(double discount) {
		System.out.println("Your fee after Discount ("+discount +"%) is : "+((this.courseFee-(this.courseFee/100)*discount)));
	}
}
