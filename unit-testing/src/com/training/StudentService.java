package com.training;

public class StudentService {

	
	public String assignGrade(double marks) {
		String grade = null;
		if(marks<60) {
			grade = "B";
		}else if(marks>=60 && marks<=85) {
			grade = "A";
		}else {
			grade = "A+";
		}
		return grade;
	}
}
