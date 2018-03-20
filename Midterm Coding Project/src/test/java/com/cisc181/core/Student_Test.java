package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	static Student student1;
	static Student student2;
	static Student student3;
	static Student student4;
	static Student student5;
	static Student student6;
	static Student student7;
	static Student student8;
	static Student student9;
	static Student student10;
	
	static Course course1;
	static Course course2;
	static Course course3;
	
	static Section c1section1;
	static Section c1section2;
	static Section c2section1;
	static Section c2section2;
	static Section c3section1;
	static Section c3section2;

	@BeforeClass
	public static void setup() throws PersonException {		
		ArrayList<Student> studentList = new ArrayList<Student>(10);
		Student student1 = new Student("John" , "Brad", "Johnson", new Date(1998, 01, 01), eMajor.COMPSI.toString(), "123 Academy Street", "302-123-4567", "email.udel.edu");
		studentList.add(student1);
		Student student2 = new Student("Brad" , "William", "Johnson", new Date(1998, 01, 01), eMajor.COMPSI.toString(), "123 Academy Street", "302-123-4567", "email.udel.edu");
		studentList.add(student2);
		Student student3 = new Student("Bradford" , "William", "Johnson", new Date(1998, 01, 01), eMajor.COMPSI.toString(), "123 Academy Street", "302-123-4567", "email.udel.edu");
		studentList.add(student3);
		Student student4 = new Student("Bradley" , "William", "Johnson", new Date(1998, 01, 01), eMajor.COMPSI.toString(), "123 Academy Street", "302-123-4567", "email.udel.edu");
		studentList.add(student4);
		Student student5 = new Student("Bardford" , "William", "Johnson", new Date(1998, 01, 01), eMajor.COMPSI.toString(), "123 Academy Street", "302-123-4567", "email.udel.edu");
		studentList.add(student5);
		Student student6 = new Student("Bradeline" , "William", "Johnson", new Date(1998, 01, 01), eMajor.COMPSI.toString(), "123 Academy Street", "302-123-4567", "email.udel.edu");
		studentList.add(student6);
		Student student7 = new Student("Bradelie" , "William", "Johnson", new Date(1998, 01, 01), eMajor.COMPSI.toString(), "123 Academy Street", "302-123-4567", "email.udel.edu");
		studentList.add(student7);
		Student student8 = new Student("Bradkenzie" , "William", "Johnson", new Date(1998, 01, 01), eMajor.COMPSI.toString(), "123 Academy Street", "302-123-4567", "email.udel.edu");
		studentList.add(student8);
		Student student9 = new Student("Bradder" , "William", "Johnson", new Date(1998, 01, 01), eMajor.COMPSI.toString(), "123 Academy Street", "302-123-4567", "email.udel.edu");
		studentList.add(student9);
		Student student10 = new Student("Bread" , "William", "Johnson", new Date(1998, 01, 01), eMajor.COMPSI.toString(), "123 Academy Street", "302-123-4567", "email.udel.edu");
		studentList.add(student10);
		
		ArrayList<Course> courseList = new ArrayList<Course>(3);
		Course course1 = new Course(UUID.randomUUID(), "Gerrymandering", 12, eMajor.NURSING);
		courseList.add(course1);
		Course course2 = new Course(UUID.randomUUID(), "Thinking out Loud", 17, eMajor.COMPSI);
		courseList.add(course2);
		Course course3 = new Course(UUID.randomUUID(), "Green the Green", 7, eMajor.NURSING);
		courseList.add(course3);
		
		ArrayList<Semester> semesterList = new ArrayList<Semester>(2);
		Semester fall = new Semester(UUID.randomUUID(), new Date(1967, 02, 12), new Date(1967, 02, 13));
		Semester spring = new Semester(UUID.randomUUID(), new Date(1987, 03, 17), new Date(1987, 03, 18));
		
		ArrayList<Section> sectionList = new ArrayList<Section>(6);
		Section c1section1 = new Section(course1.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 010);
		sectionList.add(c1section1);
		Section c1section2 = new Section(course1.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 011);
		sectionList.add(c1section2);
		Section c2section1 = new Section(course2.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 010);
		sectionList.add(c2section1);
		Section c2section2 = new Section(course2.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 011);
		sectionList.add(c2section2);
		Section c3section1 = new Section(course3.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 010);
		sectionList.add(c3section1);
		Section c3section2 = new Section(course3.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 011);
		sectionList.add(c3section2);
	}

	@BeforeClass
	public static void enrollStudents(){
		Enrollment enroll1c1s1 = new Enrollment(student1.getStudentID(), c1section1.getSectionID());
		enroll1c1s1.setGrade(90);
		Enrollment enroll1c1s2 = new Enrollment(student1.getStudentID(), c1section2.getSectionID());
		enroll1c1s2.setGrade(90);
		Enrollment enroll1c2s1 = new Enrollment(student1.getStudentID(), c2section1.getSectionID());
		enroll1c2s1.setGrade(90);
		Enrollment enroll1c2s2 = new Enrollment(student1.getStudentID(), c2section2.getSectionID());
		enroll1c2s2.setGrade(90);
		Enrollment enroll1c3s1 = new Enrollment(student1.getStudentID(), c3section1.getSectionID());
		enroll1c3s1.setGrade(90);
		Enrollment enroll1c3s2 = new Enrollment(student1.getStudentID(), c3section2.getSectionID());
		enroll1c3s2.setGrade(90);
		
		Enrollment enroll2c1s1 = new Enrollment(student2.getStudentID(), c1section1.getSectionID());
		Enrollment enroll2c1s2 = new Enrollment(student2.getStudentID(), c1section2.getSectionID());
		Enrollment enroll2c2s1 = new Enrollment(student2.getStudentID(), c2section1.getSectionID());
		Enrollment enroll2c2s2 = new Enrollment(student2.getStudentID(), c2section2.getSectionID());
		Enrollment enroll2c3s1 = new Enrollment(student2.getStudentID(), c3section1.getSectionID());
		Enrollment enroll2c3s2 = new Enrollment(student2.getStudentID(), c3section2.getSectionID());
		
		Enrollment enroll3c1s1 = new Enrollment(student3.getStudentID(), c1section1.getSectionID());
		Enrollment enroll3c1s2 = new Enrollment(student3.getStudentID(), c1section2.getSectionID());
		Enrollment enroll3c2s1 = new Enrollment(student3.getStudentID(), c2section1.getSectionID());
		Enrollment enroll3c2s2 = new Enrollment(student3.getStudentID(), c2section2.getSectionID());
		Enrollment enroll3c3s1 = new Enrollment(student3.getStudentID(), c3section1.getSectionID());
		Enrollment enroll3c3s2 = new Enrollment(student3.getStudentID(), c3section2.getSectionID());
		
		Enrollment enroll4c1s1 = new Enrollment(student4.getStudentID(), c1section1.getSectionID());
		Enrollment enroll4c1s2 = new Enrollment(student4.getStudentID(), c1section2.getSectionID());
		Enrollment enroll4c2s1 = new Enrollment(student4.getStudentID(), c2section1.getSectionID());
		Enrollment enroll4c2s2 = new Enrollment(student4.getStudentID(), c2section2.getSectionID());
		Enrollment enroll4c3s1 = new Enrollment(student4.getStudentID(), c3section1.getSectionID());
		Enrollment enroll4c3s2 = new Enrollment(student4.getStudentID(), c3section2.getSectionID());
		
		Enrollment enroll5c1s1 = new Enrollment(student5.getStudentID(), c1section1.getSectionID());
		Enrollment enroll5c1s2 = new Enrollment(student5.getStudentID(), c1section2.getSectionID());
		Enrollment enroll5c2s1 = new Enrollment(student5.getStudentID(), c2section1.getSectionID());
		Enrollment enroll5c2s2 = new Enrollment(student5.getStudentID(), c2section2.getSectionID());
		Enrollment enroll5c3s1 = new Enrollment(student5.getStudentID(), c3section1.getSectionID());
		Enrollment enroll5c3s2 = new Enrollment(student5.getStudentID(), c3section2.getSectionID());
		
		Enrollment enroll6c1s1 = new Enrollment(student6.getStudentID(), c1section1.getSectionID());
		Enrollment enroll6c1s2 = new Enrollment(student6.getStudentID(), c1section2.getSectionID());
		Enrollment enroll6c2s1 = new Enrollment(student6.getStudentID(), c2section1.getSectionID());
		Enrollment enroll6c2s2 = new Enrollment(student6.getStudentID(), c2section2.getSectionID());
		Enrollment enroll6c3s1 = new Enrollment(student6.getStudentID(), c3section1.getSectionID());
		Enrollment enroll6c3s2 = new Enrollment(student6.getStudentID(), c3section2.getSectionID());
		
		Enrollment enroll7c1s1 = new Enrollment(student7.getStudentID(), c1section1.getSectionID());
		Enrollment enroll7c1s2 = new Enrollment(student7.getStudentID(), c1section2.getSectionID());
		Enrollment enroll7c2s1 = new Enrollment(student7.getStudentID(), c2section1.getSectionID());
		Enrollment enroll7c2s2 = new Enrollment(student7.getStudentID(), c2section2.getSectionID());
		Enrollment enroll7c3s1 = new Enrollment(student7.getStudentID(), c3section1.getSectionID());
		Enrollment enroll7c3s2 = new Enrollment(student7.getStudentID(), c3section2.getSectionID());
		
		Enrollment enroll8c1s1 = new Enrollment(student8.getStudentID(), c1section1.getSectionID());
		Enrollment enroll8c1s2 = new Enrollment(student8.getStudentID(), c1section2.getSectionID());
		Enrollment enroll8c2s1 = new Enrollment(student8.getStudentID(), c2section1.getSectionID());
		Enrollment enroll8c2s2 = new Enrollment(student8.getStudentID(), c2section2.getSectionID());
		Enrollment enroll8c3s1 = new Enrollment(student8.getStudentID(), c3section1.getSectionID());
		Enrollment enroll8c3s2 = new Enrollment(student8.getStudentID(), c3section2.getSectionID());
		
		Enrollment enroll9c1s1 = new Enrollment(student9.getStudentID(), c1section1.getSectionID());
		Enrollment enroll9c1s2 = new Enrollment(student9.getStudentID(), c1section2.getSectionID());
		Enrollment enroll9c2s1 = new Enrollment(student9.getStudentID(), c2section1.getSectionID());
		Enrollment enroll9c2s2 = new Enrollment(student9.getStudentID(), c2section2.getSectionID());
		Enrollment enroll9c3s1 = new Enrollment(student9.getStudentID(), c3section1.getSectionID());
		Enrollment enroll9c3s2 = new Enrollment(student9.getStudentID(), c3section2.getSectionID());
		
		Enrollment enroll10c1s1 = new Enrollment(student10.getStudentID(), c1section1.getSectionID());
		Enrollment enroll10c1s2 = new Enrollment(student10.getStudentID(), c1section2.getSectionID());
		Enrollment enroll10c2s1 = new Enrollment(student10.getStudentID(), c2section1.getSectionID());
		Enrollment enroll10c2s2 = new Enrollment(student10.getStudentID(), c2section2.getSectionID());
		Enrollment enroll10c3s1 = new Enrollment(student10.getStudentID(), c3section1.getSectionID());
		Enrollment enroll10c3s2 = new Enrollment(student10.getStudentID(), c3section2.getSectionID());
	}
	@Test
	public void test() {
		assertEquals(1, 1);
	}
}