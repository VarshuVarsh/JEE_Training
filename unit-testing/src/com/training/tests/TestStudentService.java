package com.training.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.StudentService;

public class TestStudentService {

	StudentService service;
	
	@BeforeEach
	public void setUp() {
		
		service = new StudentService();
	}
	@Test
	@DisplayName("Test to check the grades is not null when the marks is 90.00")
	public void testForNotNull() {
		
		String actual = service.assignGrade(90.00);
		
		assertNotNull(actual);
	}
	
	@Test
	public void testForGradeA() {
		
		
		String actual = service.assignGrade(60.00);
		
		assertEquals("A", actual);
	}
}
