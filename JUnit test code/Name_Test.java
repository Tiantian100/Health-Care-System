package testMyHealthCareSystem;


/*		@(#)Name_Test.java	Jan. 31, 2024
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
* Test class for testing the Name class
* Uses JUnit version 5
* @author Jawaa Chen
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - Name")
@TestMethodOrder(OrderAnnotation.class)
public class Name_Test {
	Name TestName;
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
		TestName = new Name();
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	TODO: Undo what was setup for each test before the test was run
		 */
		TestName = null;
	}

	/*		Methods to test
	 * 
			+Name(...)
			+toString():String
			+formattedName():String
			+setFirst(first:String):void
			+setLast(last:String):void
			+setMiddle(middle:String):void
			+setSaluation(salutation:String):void
			+first():String
			+last():String
	 */
	
	@Nested	@DisplayName("Name() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class NameTest {
		@Test @Order(1) @DisplayName("Name() test with Null arguments")
		final void testNameWithNullArguments() {
			Name result = new Name();
			assertNotNull(result);
			
		}
		/*
		 * TODO: Add code with assertion to test overloaded constructors as you see fit
		 */
		
		@Test @Order(2) @DisplayName("Name(String first, String last) test")
		final void testNamewith2Arguments() {
			Name TestName = new Name("First","Last");
			assertEquals("First", TestName.getFirst(),"Name(String first, String last) constructor does not match expectations");
			assertEquals("Last", TestName.getLast(),"Name(String first, String last) constructor does not match expecations");
			assertEquals(null, TestName.getMiddle(),"Name(String first, String last) constructor does not match expecations");
			
		}
		
		@Test @Order(3) @DisplayName("Name(String first, String last, String middle) test")
		final void testNamewith3Arguments() {
			Name TestName = new Name("First","Last","Middle");
			assertEquals("First", TestName.getFirst(),"Name(String first, String last) constructor does not match expectations");
			assertEquals("Last", TestName.getLast(),"Name(String first, String last) constructor does not match expecations");
			assertEquals("Middle", TestName.getMiddle(),"Name(String first, String last) constructor does not match expecations");
			
		}
			
	
		
		
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			/*
			 * TODO: Add code with assertion to test
			 */
			TestName = new Name("First", "Last", "Middle");
			TestName.setSalutation("Sir");
			System.out.println(TestName.toString());
			assertEquals("<Name>: [Salutation = Sir, First = First, Middle = Middle, Last = Last]", TestName.toString(),
					"Name.toString() does not match expectations");
		}
	}
	
	@Nested	@DisplayName("formattedName() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedName {
		@Test @Order(1) @DisplayName("formattedName()")
		final void testFormattedName() {
			/*
			 * TODO: Add code with assertion to test
			 */
			TestName = new Name("First", "Last", "Middle");
			TestName.setSalutation("Sir");
			System.out.println(TestName.formattedName());
			assertEquals("Sir First Middle Last", TestName.formattedName(),
					"Name.formattedName() does not match expectations");
		}
		
	}

	@Nested	@DisplayName("setFirst(), getFirst() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetFirstTest {
		@Test @Order(1) @DisplayName("setFirst()")
		final void testSetFirst() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Name TestName = new Name();
			TestName.setFirst("First");
			assertEquals("First", TestName.getFirst(),
					"TestName.setFirst()/getFirst() does not match expectations");
			
		}	
	}
	
	@Nested	@DisplayName("setLast(),getLast() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetLastTest {
		@Test @Order(1) @DisplayName("setLast()")
		final void testSetLast() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Name TestName = new Name();
			TestName.setLast("Last");
			assertEquals("Last", TestName.getLast(),"TestName.setLast()/getLast does not match expectations");
		}	
	}

	@Nested	@DisplayName("setMiddle()/getMiddle() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetMiddleTest {
		@Test @Order(1) @DisplayName("setMiddle()")
		final void testMiddle() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Name TestName = new Name();
			TestName.setMiddle("Middle");
			assertEquals("Middle", TestName.getMiddle(),"TestName.setMiddle()/getMiddle() does not match expectations");
		}	
	}

	
	@Nested	@DisplayName("setSalutation()/getSalutation() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetSalutationTest {
		@Test @Order(1) @DisplayName("setSalutation()")
		final void testSetSalutation() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Name TestName = new Name();
			TestName.setSalutation("Salutation");
			assertEquals("Salutation", TestName.getSalutation(),"TestName.setSalutation()/getSalutation does not match expectations");
		}
	}
	
	@Nested	@DisplayName("first() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FirstTest {
		@Test @Order(1) @DisplayName("first()")
		final void testFirst() {
			/*
			 * TODO: Add code with assertion to test
			 */
		}
	}


	@Nested	@DisplayName("last() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class LastTest {
		@Test @Order(1) @DisplayName("last()")
		final void testlast() {
			/*
			 * TODO: Add code with assertion to test
			 */
		}
	}
	

}
