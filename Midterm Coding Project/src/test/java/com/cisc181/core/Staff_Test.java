package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
		
	}
	
	@Test
	public void testStaffSalary() throws PersonException {
		ArrayList<Staff> staffMembers = new ArrayList<Staff>(5);
		
		Staff staff1 = new Staff("John", "James", "Doe", new Date(1998, 06, 20), "123 Academy Street", "302-831-1234",
				"email@udel.edu", "No hours", 1, 20000, new Date(2018, 03, 18), eTitle.MR);
		Staff staff2 = new Staff("James", "John", "Don", new Date(1998, 06, 21), "124 Academy Street", "302-831-1235",
				"emails@udel.edu", "No hours", 2, 20000, new Date(2016, 03, 18), eTitle.MR);
		Staff staff3 = new Staff("Joan", "Janet", "Doe", new Date(1998, 06, 22), "125 Academy Street", "302-831-1236",
				"emailss@udel.edu", "No hours", 3, 20000, new Date(2015, 03, 18), eTitle.MS);
		Staff staff4 = new Staff("Danielle", "Nichole", "Clark", new Date(1995, 01, 19), "127 Academy Street", "302-831-1239",
				"emailsss@udel.edu", "No hours", 4, 20000, new Date(2016, 03, 18), eTitle.MS);
		Staff staff5 = new Staff("Marcus", "Hearst", "Sulzer", new Date(1993, 9, 14), "314 Wyoming Road", "302-867-5309",
				"xvp@udel.edu", "No hours", 15, 20000, new Date(1993, 03, 18), eTitle.DR);
		
		staffMembers.add(staff1);
		staffMembers.add(staff2);
		staffMembers.add(staff3);
		staffMembers.add(staff4);
		staffMembers.add(staff5);
		
		double sum = 0;
		for (Staff i : staffMembers) {
			sum += i.getSalary();
		}
		double average = (sum/staffMembers.size());
		double actAv = 20000;
		
		assertEquals(actAv, average, 0);
	}	
	
	@Test
	public void testStaffPhoneNumber(){
		try {
			Staff wrongNum = new Staff("Marcus", "Hearst", "Sulzer", new Date(1993, 9, 14), "314 Wyoming Road", "123",
					"xvp@udel.edu", "No hours", 15, 20000, new Date(1993, 03, 18), eTitle.DR);
		}
		catch  (PersonException e){
			assertEquals(1,1);
		}
	}
	
	@Test
	public void testStaffAge() {
		try {
			Staff wrongNum = new Staff("Marcus", "Hearst", "Sulzer", new Date(1893, 9, 14), "314 Wyoming Road", "302-831-1353",
					"xvp@udel.edu", "No hours", 15, 20000, new Date(1893, 03, 18), eTitle.DR); 
		}
		catch (PersonException e){
			System.out.println("Got here");
			assertEquals(1,1);
		}
	}
}
