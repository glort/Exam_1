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

import com.cisc181.eNums.eMajor;

public class Student_Test {

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
	public void testGPA() {
		ArrayList<Course> courses = new ArrayList<Course>();
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		ArrayList<Section> sections = new ArrayList<Section>();
		ArrayList<Student> students = new ArrayList<Student>();
		
		Course course1 = new Course();
		courses.add(course1);
		Course course2 = new Course();
		courses.add(course2);
		Course course3 = new Course();
		courses.add(course3);
		
		Semester semester1 = new Semester();
		semesters.add(semester1);
		Semester semester2 = new Semester();
		semesters.add(semester2);
		
		//Course 1
		Section section1 = new Section();
		sections.add(section1);
		Section section2 = new Section();
		sections.add(section2);
		//Course 2
		Section section3 = new Section();
		sections.add(section3);
		Section section4 = new Section();
		sections.add(section4);
		//Course 3
		Section section5 = new Section();
		sections.add(section5);
		Section section6 = new Section();
		sections.add(section6);
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY");
		try{
			Student student1 = new Student("Adam","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student1);
			Student student2 = new Student("Ben","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student2);
			Student student3 = new Student("Caleb","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student3);
			Student student4 = new Student("Dan","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student4);
			Student student5 = new Student("Ephriam","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student5);
			Student student6 = new Student("Frank","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student6);
			Student student7 = new Student("Gabe","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student7);
			Student student8 = new Student("Hank","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student8);
			Student student9 = new Student("Ike","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student9);
			Student student10 = new Student("James","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student10);
			
			Enrollment e11 = new Enrollment(student1.getStudentID(), section1.getSectionID());
			e11.setGrade(4.0);
			Enrollment e12 = new Enrollment(student1.getStudentID(), section2.getSectionID());
			e12.setGrade(4.0);
			Enrollment e13 = new Enrollment(student1.getStudentID(), section3.getSectionID());
			e13.setGrade(4.0);
			Enrollment e14 = new Enrollment(student1.getStudentID(), section4.getSectionID());
			e14.setGrade(4.0);
			Enrollment e15 = new Enrollment(student1.getStudentID(), section5.getSectionID());
			e15.setGrade(4.0);
			Enrollment e16 = new Enrollment(student1.getStudentID(), section6.getSectionID());
			e16.setGrade(4.0);
			Enrollment e21 = new Enrollment(student2.getStudentID(), section1.getSectionID());
			e21.setGrade(3.0);
			Enrollment e22 = new Enrollment(student2.getStudentID(), section2.getSectionID());
			e22.setGrade(3.0);
			Enrollment e23 = new Enrollment(student2.getStudentID(), section3.getSectionID());
			e23.setGrade(3.0);
			Enrollment e24 = new Enrollment(student2.getStudentID(), section4.getSectionID());
			e24.setGrade(3.0);
			Enrollment e25 = new Enrollment(student2.getStudentID(), section5.getSectionID());
			e25.setGrade(3.0);
			Enrollment e26 = new Enrollment(student2.getStudentID(), section6.getSectionID());
			e26.setGrade(3.0);
			Enrollment e31 = new Enrollment(student3.getStudentID(), section1.getSectionID());
			e31.setGrade(2.0);
			Enrollment e32 = new Enrollment(student3.getStudentID(), section2.getSectionID());
			e32.setGrade(2.0);
			Enrollment e33 = new Enrollment(student3.getStudentID(), section3.getSectionID());
			e33.setGrade(2.0);
			Enrollment e34 = new Enrollment(student3.getStudentID(), section4.getSectionID());
			e34.setGrade(2.0);
			Enrollment e35 = new Enrollment(student3.getStudentID(), section5.getSectionID());
			e35.setGrade(2.0);
			Enrollment e36 = new Enrollment(student3.getStudentID(), section6.getSectionID());
			e36.setGrade(2.0);
			Enrollment e41 = new Enrollment(student4.getStudentID(), section1.getSectionID());
			e41.setGrade(1.0);
			Enrollment e42 = new Enrollment(student4.getStudentID(), section2.getSectionID());
			e42.setGrade(1);
			Enrollment e43 = new Enrollment(student4.getStudentID(), section3.getSectionID());
			e43.setGrade(1);
			Enrollment e44 = new Enrollment(student4.getStudentID(), section4.getSectionID());
			e44.setGrade(1);
			Enrollment e45 = new Enrollment(student4.getStudentID(), section5.getSectionID());
			e45.setGrade(1);
			Enrollment e46 = new Enrollment(student4.getStudentID(), section6.getSectionID());
			e46.setGrade(1);
			Enrollment e51 = new Enrollment(student5.getStudentID(), section1.getSectionID());
			e51.setGrade(0);
			Enrollment e52 = new Enrollment(student5.getStudentID(), section2.getSectionID());
			e52.setGrade(0);
			Enrollment e53 = new Enrollment(student5.getStudentID(), section3.getSectionID());
			e53.setGrade(0);
			Enrollment e54 = new Enrollment(student5.getStudentID(), section4.getSectionID());
			e54.setGrade(0);
			Enrollment e55 = new Enrollment(student5.getStudentID(), section5.getSectionID());
			e55.setGrade(0);
			Enrollment e56 = new Enrollment(student5.getStudentID(), section6.getSectionID());
			e56.setGrade(0);
			Enrollment e61 = new Enrollment(student6.getStudentID(), section1.getSectionID());
			e61.setGrade(1);
			Enrollment e62 = new Enrollment(student6.getStudentID(), section2.getSectionID());
			e62.setGrade(1);
			Enrollment e63 = new Enrollment(student6.getStudentID(), section3.getSectionID());
			e63.setGrade(2);
			Enrollment e64 = new Enrollment(student6.getStudentID(), section4.getSectionID());
			e64.setGrade(2);
			Enrollment e65 = new Enrollment(student6.getStudentID(), section5.getSectionID());
			e65.setGrade(3);
			Enrollment e66 = new Enrollment(student6.getStudentID(), section6.getSectionID());
			e66.setGrade(3);
			Enrollment e71 = new Enrollment(student7.getStudentID(), section1.getSectionID());
			e71.setGrade(3);
			Enrollment e72 = new Enrollment(student7.getStudentID(), section2.getSectionID());
			e72.setGrade(3);
			Enrollment e73 = new Enrollment(student7.getStudentID(), section3.getSectionID());
			e73.setGrade(2);
			Enrollment e74 = new Enrollment(student7.getStudentID(), section4.getSectionID());
			e74.setGrade(2);
			Enrollment e75 = new Enrollment(student7.getStudentID(), section5.getSectionID());
			e75.setGrade(1);
			Enrollment e76 = new Enrollment(student7.getStudentID(), section6.getSectionID());
			e76.setGrade(1);
			Enrollment e81 = new Enrollment(student8.getStudentID(), section1.getSectionID());
			e81.setGrade(3);
			Enrollment e82 = new Enrollment(student8.getStudentID(), section2.getSectionID());
			e82.setGrade(3);
			Enrollment e83 = new Enrollment(student8.getStudentID(), section3.getSectionID());
			e83.setGrade(3);
			Enrollment e84 = new Enrollment(student8.getStudentID(), section4.getSectionID());
			e84.setGrade(3);
			Enrollment e85 = new Enrollment(student8.getStudentID(), section5.getSectionID());
			e85.setGrade(3);
			Enrollment e86 = new Enrollment(student8.getStudentID(), section6.getSectionID());
			e86.setGrade(3);
			Enrollment e91 = new Enrollment(student9.getStudentID(), section1.getSectionID());
			e91.setGrade(2);
			Enrollment e92 = new Enrollment(student9.getStudentID(), section2.getSectionID());
			e92.setGrade(2);
			Enrollment e93 = new Enrollment(student9.getStudentID(), section3.getSectionID());
			e93.setGrade(2);
			Enrollment e94 = new Enrollment(student9.getStudentID(), section4.getSectionID());
			e94.setGrade(2);
			Enrollment e95 = new Enrollment(student9.getStudentID(), section5.getSectionID());
			e95.setGrade(2);
			Enrollment e96 = new Enrollment(student9.getStudentID(), section6.getSectionID());
			e96.setGrade(2);
			Enrollment e101 = new Enrollment(student10.getStudentID(), section1.getSectionID());
			e101.setGrade(1);
			Enrollment e102 = new Enrollment(student10.getStudentID(), section2.getSectionID());
			e102.setGrade(1);
			Enrollment e103 = new Enrollment(student10.getStudentID(), section3.getSectionID());
			e103.setGrade(1);
			Enrollment e104 = new Enrollment(student10.getStudentID(), section4.getSectionID());
			e104.setGrade(1);
			Enrollment e105 = new Enrollment(student10.getStudentID(), section5.getSectionID());
			e105.setGrade(1);
			Enrollment e106 = new Enrollment(student10.getStudentID(), section6.getSectionID());
			e106.setGrade(1);
			
			//Student1
			double average = (e11.getGrade() + e12.getGrade() +e13.getGrade() +e14.getGrade() +e15.getGrade() +e16.getGrade())/6;
			assertEquals(4.0, average, .00001);
			
			//Student2
			average = (e21.getGrade() + e22.getGrade() +e23.getGrade() +e24.getGrade() +e25.getGrade() +e26.getGrade())/6;
			assertEquals(3.0, average, .00001);
			
			//Student3
			average = (e31.getGrade() + e32.getGrade() +e33.getGrade() +e34.getGrade() +e35.getGrade() +e36.getGrade())/6;
			assertEquals(2.0, average, .00001);
			
			//Student4
			average = (e41.getGrade() + e42.getGrade() +e43.getGrade() +e44.getGrade() +e45.getGrade() +e46.getGrade())/6;
			assertEquals(1.0, average, .00001);
			
			//Student5
			average = (e51.getGrade() + e52.getGrade() +e53.getGrade() +e54.getGrade() +e55.getGrade() +e56.getGrade())/6;
			assertEquals(0.0, average, .00001);
			
			//Student6
			average = (e61.getGrade() + e62.getGrade() +e63.getGrade() +e64.getGrade() +e65.getGrade() +e66.getGrade())/6;
			assertEquals(2.0, average, .00001);
			
			//Student7
			average = (e71.getGrade() + e72.getGrade() +e73.getGrade() +e74.getGrade() +e75.getGrade() +e76.getGrade())/6;
			assertEquals(2.0, average, .00001);
			
			//Student8
			average = (e81.getGrade() + e82.getGrade() +e83.getGrade() +e84.getGrade() +e85.getGrade() +e86.getGrade())/6;
			assertEquals(3.0, average, .00001);
			
			//Student9
			average = (e91.getGrade() + e92.getGrade() +e93.getGrade() +e94.getGrade() +e95.getGrade() +e96.getGrade())/6;
			assertEquals(2.0, average, .00001);
			
			//Student10
			average = (e101.getGrade() + e102.getGrade() +e103.getGrade() +e104.getGrade() +e105.getGrade() +e106.getGrade())/6;
			assertEquals(1.0, average, .00001);
			
			
		}
		catch(ParseException e){
			System.out.println("Parse Exception: Date");
		}
		catch (PersonException e){
			System.out.println("Person Exception");
		}
		
	}
	
	@Test
	public void testAverageGrade(){
		ArrayList<Course> courses = new ArrayList<Course>();
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		ArrayList<Section> sections = new ArrayList<Section>();
		ArrayList<Student> students = new ArrayList<Student>();
		
		Course course1 = new Course();
		courses.add(course1);
		Course course2 = new Course();
		courses.add(course2);
		Course course3 = new Course();
		courses.add(course3);
		
		Semester semester1 = new Semester();
		semesters.add(semester1);
		Semester semester2 = new Semester();
		semesters.add(semester2);
		
		//Course 1
		Section section1 = new Section();
		sections.add(section1);
		Section section2 = new Section();
		sections.add(section2);
		//Course 2
		Section section3 = new Section();
		sections.add(section3);
		Section section4 = new Section();
		sections.add(section4);
		//Course 3
		Section section5 = new Section();
		sections.add(section5);
		Section section6 = new Section();
		sections.add(section6);
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY");
		try{
			Student student1 = new Student("Adam","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student1);
			Student student2 = new Student("Ben","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student2);
			Student student3 = new Student("Caleb","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student3);
			Student student4 = new Student("Dan","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student4);
			Student student5 = new Student("Ephriam","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student5);
			Student student6 = new Student("Frank","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student6);
			Student student7 = new Student("Gabe","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student7);
			Student student8 = new Student("Hank","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student8);
			Student student9 = new Student("Ike","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student9);
			Student student10 = new Student("James","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student10);
			
			Enrollment e11 = new Enrollment(student1.getStudentID(), section1.getSectionID());
			e11.setGrade(4.0);
			Enrollment e12 = new Enrollment(student1.getStudentID(), section2.getSectionID());
			e12.setGrade(4.0);
			Enrollment e13 = new Enrollment(student1.getStudentID(), section3.getSectionID());
			e13.setGrade(4.0);
			Enrollment e14 = new Enrollment(student1.getStudentID(), section4.getSectionID());
			e14.setGrade(4.0);
			Enrollment e15 = new Enrollment(student1.getStudentID(), section5.getSectionID());
			e15.setGrade(4.0);
			Enrollment e16 = new Enrollment(student1.getStudentID(), section6.getSectionID());
			e16.setGrade(4.0);
			Enrollment e21 = new Enrollment(student2.getStudentID(), section1.getSectionID());
			e21.setGrade(3.0);
			Enrollment e22 = new Enrollment(student2.getStudentID(), section2.getSectionID());
			e22.setGrade(3.0);
			Enrollment e23 = new Enrollment(student2.getStudentID(), section3.getSectionID());
			e23.setGrade(3.0);
			Enrollment e24 = new Enrollment(student2.getStudentID(), section4.getSectionID());
			e24.setGrade(3.0);
			Enrollment e25 = new Enrollment(student2.getStudentID(), section5.getSectionID());
			e25.setGrade(3.0);
			Enrollment e26 = new Enrollment(student2.getStudentID(), section6.getSectionID());
			e26.setGrade(3.0);
			Enrollment e31 = new Enrollment(student3.getStudentID(), section1.getSectionID());
			e31.setGrade(2.0);
			Enrollment e32 = new Enrollment(student3.getStudentID(), section2.getSectionID());
			e32.setGrade(2.0);
			Enrollment e33 = new Enrollment(student3.getStudentID(), section3.getSectionID());
			e33.setGrade(2.0);
			Enrollment e34 = new Enrollment(student3.getStudentID(), section4.getSectionID());
			e34.setGrade(2.0);
			Enrollment e35 = new Enrollment(student3.getStudentID(), section5.getSectionID());
			e35.setGrade(2.0);
			Enrollment e36 = new Enrollment(student3.getStudentID(), section6.getSectionID());
			e36.setGrade(2.0);
			Enrollment e41 = new Enrollment(student4.getStudentID(), section1.getSectionID());
			e41.setGrade(1.0);
			Enrollment e42 = new Enrollment(student4.getStudentID(), section2.getSectionID());
			e42.setGrade(1);
			Enrollment e43 = new Enrollment(student4.getStudentID(), section3.getSectionID());
			e43.setGrade(1);
			Enrollment e44 = new Enrollment(student4.getStudentID(), section4.getSectionID());
			e44.setGrade(1);
			Enrollment e45 = new Enrollment(student4.getStudentID(), section5.getSectionID());
			e45.setGrade(1);
			Enrollment e46 = new Enrollment(student4.getStudentID(), section6.getSectionID());
			e46.setGrade(1);
			Enrollment e51 = new Enrollment(student5.getStudentID(), section1.getSectionID());
			e51.setGrade(0);
			Enrollment e52 = new Enrollment(student5.getStudentID(), section2.getSectionID());
			e52.setGrade(0);
			Enrollment e53 = new Enrollment(student5.getStudentID(), section3.getSectionID());
			e53.setGrade(0);
			Enrollment e54 = new Enrollment(student5.getStudentID(), section4.getSectionID());
			e54.setGrade(0);
			Enrollment e55 = new Enrollment(student5.getStudentID(), section5.getSectionID());
			e55.setGrade(0);
			Enrollment e56 = new Enrollment(student5.getStudentID(), section6.getSectionID());
			e56.setGrade(0);
			Enrollment e61 = new Enrollment(student6.getStudentID(), section1.getSectionID());
			e61.setGrade(1);
			Enrollment e62 = new Enrollment(student6.getStudentID(), section2.getSectionID());
			e62.setGrade(1);
			Enrollment e63 = new Enrollment(student6.getStudentID(), section3.getSectionID());
			e63.setGrade(2);
			Enrollment e64 = new Enrollment(student6.getStudentID(), section4.getSectionID());
			e64.setGrade(2);
			Enrollment e65 = new Enrollment(student6.getStudentID(), section5.getSectionID());
			e65.setGrade(3);
			Enrollment e66 = new Enrollment(student6.getStudentID(), section6.getSectionID());
			e66.setGrade(3);
			Enrollment e71 = new Enrollment(student7.getStudentID(), section1.getSectionID());
			e71.setGrade(3);
			Enrollment e72 = new Enrollment(student7.getStudentID(), section2.getSectionID());
			e72.setGrade(3);
			Enrollment e73 = new Enrollment(student7.getStudentID(), section3.getSectionID());
			e73.setGrade(2);
			Enrollment e74 = new Enrollment(student7.getStudentID(), section4.getSectionID());
			e74.setGrade(2);
			Enrollment e75 = new Enrollment(student7.getStudentID(), section5.getSectionID());
			e75.setGrade(1);
			Enrollment e76 = new Enrollment(student7.getStudentID(), section6.getSectionID());
			e76.setGrade(1);
			Enrollment e81 = new Enrollment(student8.getStudentID(), section1.getSectionID());
			e81.setGrade(3);
			Enrollment e82 = new Enrollment(student8.getStudentID(), section2.getSectionID());
			e82.setGrade(3);
			Enrollment e83 = new Enrollment(student8.getStudentID(), section3.getSectionID());
			e83.setGrade(3);
			Enrollment e84 = new Enrollment(student8.getStudentID(), section4.getSectionID());
			e84.setGrade(3);
			Enrollment e85 = new Enrollment(student8.getStudentID(), section5.getSectionID());
			e85.setGrade(3);
			Enrollment e86 = new Enrollment(student8.getStudentID(), section6.getSectionID());
			e86.setGrade(3);
			Enrollment e91 = new Enrollment(student9.getStudentID(), section1.getSectionID());
			e91.setGrade(2);
			Enrollment e92 = new Enrollment(student9.getStudentID(), section2.getSectionID());
			e92.setGrade(2);
			Enrollment e93 = new Enrollment(student9.getStudentID(), section3.getSectionID());
			e93.setGrade(2);
			Enrollment e94 = new Enrollment(student9.getStudentID(), section4.getSectionID());
			e94.setGrade(2);
			Enrollment e95 = new Enrollment(student9.getStudentID(), section5.getSectionID());
			e95.setGrade(2);
			Enrollment e96 = new Enrollment(student9.getStudentID(), section6.getSectionID());
			e96.setGrade(2);
			Enrollment e101 = new Enrollment(student10.getStudentID(), section1.getSectionID());
			e101.setGrade(1);
			Enrollment e102 = new Enrollment(student10.getStudentID(), section2.getSectionID());
			e102.setGrade(1);
			Enrollment e103 = new Enrollment(student10.getStudentID(), section3.getSectionID());
			e103.setGrade(1);
			Enrollment e104 = new Enrollment(student10.getStudentID(), section4.getSectionID());
			e104.setGrade(1);
			Enrollment e105 = new Enrollment(student10.getStudentID(), section5.getSectionID());
			e105.setGrade(1);
			Enrollment e106 = new Enrollment(student10.getStudentID(), section6.getSectionID());
			e106.setGrade(1);
			
			//Course1 - both sections
			double average = 0;
			average = (e11.getGrade() + e21.getGrade() + e31.getGrade() + e41.getGrade() + e51.getGrade()
			+ e61.getGrade() + e71.getGrade() + e81.getGrade() + e91.getGrade() + e101.getGrade() +
			e12.getGrade() + e22.getGrade() + e32.getGrade() + e42.getGrade() + e52.getGrade()
			+ e62.getGrade() + e72.getGrade() + e82.getGrade() + e92.getGrade() + e102.getGrade() )/20;
			
			assertEquals(2.0, average, .0001);
			
			//Course2 - both sections
			average = (e13.getGrade() + e23.getGrade() + e33.getGrade() + e43.getGrade() + e53.getGrade()
			+ e63.getGrade() + e73.getGrade() + e83.getGrade() + e93.getGrade() + e103.getGrade() +
			e14.getGrade() + e24.getGrade() + e34.getGrade() + e44.getGrade() + e54.getGrade()
			+ e64.getGrade() + e74.getGrade() + e84.getGrade() + e94.getGrade() + e104.getGrade() )/20;
			
			assertEquals(2.0, average, .0001);
			
			//Course3 - both sections
			average = (e15.getGrade() + e25.getGrade() + e35.getGrade() + e45.getGrade() + e55.getGrade()
			+ e65.getGrade() + e75.getGrade() + e85.getGrade() + e95.getGrade() + e105.getGrade() +
			e16.getGrade() + e26.getGrade() + e36.getGrade() + e46.getGrade() + e56.getGrade()
			+ e66.getGrade() + e76.getGrade() + e86.getGrade() + e96.getGrade() + e106.getGrade() )/20;
			
			assertEquals(2.0, average, .0001);
		}
		catch(ParseException e){
			System.out.println("Parse Exception: Date");
		}
		catch (PersonException e){
			System.out.println("Person Exception");
		}
	}
	
	@Test
	public void testMajor(){
		ArrayList<Course> courses = new ArrayList<Course>();
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		ArrayList<Section> sections = new ArrayList<Section>();
		ArrayList<Student> students = new ArrayList<Student>();
		
		Course course1 = new Course();
		courses.add(course1);
		Course course2 = new Course();
		courses.add(course2);
		Course course3 = new Course();
		courses.add(course3);
		
		Semester semester1 = new Semester();
		semesters.add(semester1);
		Semester semester2 = new Semester();
		semesters.add(semester2);
		
		//Course 1
		Section section1 = new Section();
		sections.add(section1);
		Section section2 = new Section();
		sections.add(section2);
		//Course 2
		Section section3 = new Section();
		sections.add(section3);
		Section section4 = new Section();
		sections.add(section4);
		//Course 3
		Section section5 = new Section();
		sections.add(section5);
		Section section6 = new Section();
		sections.add(section6);
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY");
		try{
			Student student1 = new Student("Adam","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student1);
			Student student2 = new Student("Ben","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student2);
			Student student3 = new Student("Caleb","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student3);
			Student student4 = new Student("Dan","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student4);
			Student student5 = new Student("Ephriam","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student5);
			Student student6 = new Student("Frank","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student6);
			Student student7 = new Student("Gabe","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student7);
			Student student8 = new Student("Hank","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student8);
			Student student9 = new Student("Ike","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student9);
			Student student10 = new Student("James","a","A",formatter.parse("01/01/2000"), eMajor.CHEM, "5","3025555555","t@t");
			students.add(student10);
			
			student1.setMajor(eMajor.PHYSICS);
			assertTrue(student1.getMajor() == "Physics");
		}
		catch(ParseException e){
			System.out.println("Parse Exception: Date");
		}
		catch (PersonException e){
			System.out.println("Person Exception");
		}
	}

}
