package testMyHealthCareSystem;


/*		@(#)BirthDate_Test.java	Jan. 31, 2024
*
*/


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import myHealthCareSystem.*;


/**
* Test class for testing the BirthDate class
* Uses JUnit version 5
* @author Jawaa Chen
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - BirthDate")
@TestMethodOrder(OrderAnnotation.class)
public class BirthDate_Test {
	BirthDate TestBirthDate;
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
		TestBirthDate = new BirthDate(1998,3,14);
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	TODO: Undo what was setup for each test before the test was run
		 */
		TestBirthDate = null;
	}

	/*		Methods to test
	 * 
		+BirthDate(day:int, month:int, year:int)
		+toString():String
		+formattedBirthDate():String
		+getDay():int
		+getMonth():int
		+getYear():int
	 */

	
	@Nested	@DisplayName("BirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class BirthDateTest {
		@Test @Order(1) @DisplayName("BirthDate() test with Null arguments")
		final void testBirthDateWithNullArguments() {
			BirthDate result = new BirthDate(0,0,0);
			assertNotNull(result);
		}
		
		/*
		 * TODO: Add code with assertion to test overloaded constructors as you see fit
		 */
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			/*
			 * TODO: Add code with assertion to test
			 */
			TestBirthDate = new BirthDate(1980,2,29);
			System.out.println(TestBirthDate.toString());
			String expectedValue = String.format("%s[year=%d, month=%d, day=%d]", 
					TestBirthDate.getClass().getName(),TestBirthDate.getYear(),
					TestBirthDate.getMonth(),TestBirthDate.getDay());
			assertEquals(expectedValue, TestBirthDate.toString(),
					"BirthDate.toString() does not match expectations");
		}
	}
	
	@Nested	@DisplayName("formattedBirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedBirthDate {
		@Test @Order(1) @DisplayName("formattedBirthDate()")
		final void testFormattedBirthDate() {
			/*
			 * TODO: Add code with assertion to test
			 */
			TestBirthDate = new BirthDate(1980,2,29);
			System.out.println(TestBirthDate.formattedBirthDate());
			assertEquals("1980/02/29",TestBirthDate.formattedBirthDate(),
					"BirthDate.formattedBirthDate() does not match expectations");
		}
		
	}

	@Nested	@DisplayName("getDay() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetDayTest {
		@Test @Order(1) @DisplayName("getDay()")
		final void testGetDay() {
			/*
			 * TODO: Add code with assertion to test
			 */
			assertEquals(14, TestBirthDate.getDay(),
					" BirthDate.getDay() does not match expectations");
		}	
	}
	
	@Nested	@DisplayName("getMonth() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetMonthTest {
		@Test @Order(1) @DisplayName("getMonth()")
		final void testGetMonth() {
			/*
			 * TODO: Add code with assertion to test
			 */
			assertEquals(3, TestBirthDate.getMonth(),
					" BirthDate.getMonth() does not match expectations");
		}	
	}
	
	@Nested	@DisplayName("getYear() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetYearTest {
		@Test @Order(1) @DisplayName("getYear()")
		final void testGetYear() {
			/*
			 * TODO: Add code with assertion to test
			 */
			assertEquals(1998, TestBirthDate.getYear(),
					" BirthDate.getYear() does not match expectations");
		}	
	}

}