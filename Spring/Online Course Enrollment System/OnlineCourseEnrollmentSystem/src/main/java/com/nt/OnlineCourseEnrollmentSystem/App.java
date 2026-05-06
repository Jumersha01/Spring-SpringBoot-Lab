package com.nt.OnlineCourseEnrollmentSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Course;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
        	Course course = ctx.getBean("courses",Course.class);
        	course.calculateDiscountedFee(10);
        	course.showCourseDetails();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
