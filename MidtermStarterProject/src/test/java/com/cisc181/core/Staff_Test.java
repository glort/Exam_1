package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSalaries() {
		ArrayList<Staff> staff = new ArrayList<Staff>();
		Staff s1 = new Staff(eTitle.JANITOR);
		s1.setSalary(20000);
		staff.add(s1);
		Staff s2 = new Staff(eTitle.JANITOR);
		s2.setSalary(30000);
		staff.add(s2);
		Staff s3 = new Staff(eTitle.JANITOR);
		s3.setSalary(40000);
		staff.add(s3);
		Staff s4 = new Staff(eTitle.JANITOR);
		s4.setSalary(50000);
		staff.add(s4);
		Staff s5 = new Staff(eTitle.JANITOR);
		s5.setSalary(60000);
		staff.add(s5);
		
		double average = (s1.getSalary() + s2.getSalary() + s3.getSalary() + s4.getSalary() + s5.getSalary())/5;
		
		assertEquals(40000, average, .00001);
		
	}
	
	@Test
	public void testDateException(){
		boolean exceptionCalled = false;
		try {
			Staff s1 = new Staff(eTitle.JANITOR);
			s1.setPhone("123");

			try {
				SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY");
				s1.setDOB(formatter.parse("01/01/1800"));
			}

			catch (ParseException e){}
		}
		catch (PersonException e){
			exceptionCalled = true;

		}
		
		assertTrue(exceptionCalled);
	}
	
	@Test
	public void testPhoneException(){
		boolean exceptionCalled = false;
		try {
			Staff s1 = new Staff(eTitle.JANITOR);
			s1.setPhone("123");

		}
		catch (PersonException e){
			exceptionCalled = true;
		}
		
		assertTrue(exceptionCalled);
	}
	
	

}
