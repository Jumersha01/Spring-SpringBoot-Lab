package com.nt.main.StudentExaminationResultSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
        	Student std = ctx.getBean("std",Student.class);
        	std.calculateResult();
        	std.showStudentInfo();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
