package testMyHealthCareSystem;


/*		@(#)Address_Test.java	Jan. 31, 2024
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
* Test class for testing the Address class
* Uses JUnit version 5
* @author Jawaa Chen
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - Address")
@TestMethodOrder(OrderAnnotation.class)
public class Address_Test {
	Address TestAddress;
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
		TestAddress = new Address(null, null, null, null);
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	TODO: Undo what was setup for each test before the test was run
		 */
		TestAddress = null;
	}

	/*		Methods to test
	 * 
	 * 	+Address(...)
			+formattedAddress():String
			+street():String
			+postalCode():String
			+getCity():String
			+setStreet(street:String):void
			+setNumber(number:String):void
			+setCity(city:String):void
			+setCountry(country:String):void
			+setPostalCode(postalCode:String):void
	 */
	
	@Nested	@DisplayName("Address() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class AddressTest {
		@Test @Order(1) @DisplayName("Address() test with Null arguments")
		final void testAddressWithNullArguments() {
			Address result = new Address(null, null, null, null);
			assertNotNull(result);
		}
		
		/*
		 * TODO: Add code with assertion to test overloaded constructors as you see fit
		 */
		@Test @Order(2)
		final void testAddresswithValidArguments() {
			Address result = new Address("Langdon St", "2686", "Abbotsford", "V2T 3L2");
			assertNotNull(result);
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
			Address TestAddress = new Address("Langdon St", "2686", "Abbotsford", "V2T 3L2");
			TestAddress.setCountry("Canada");
			System.out.println(TestAddress.toString());
			assertEquals("<Address>: [Number = 2686, Street = Langdon St, Postal Code = V2T 3L2, City = Abbotsford, Country = Canada]", TestAddress.toString(),
					"Address.toString() does not match expecations");
		}
	}
	
	@Nested	@DisplayName("formattedAddress() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedAddress {
		@Test @Order(1) @DisplayName("formattedAddress()")
		final void testFormattedAddress() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Address TestAddress = new Address("Langdon St", "2686", "Abbotsford", "V2T 3L2");
			TestAddress.setCountry("Canada");
			System.out.println(TestAddress.formattedAddress());
			assertEquals("2686 Langdon St V2T 3L2 Abbotsford Canada", TestAddress.formattedAddress(),
					"Address.toString() does not match expecations");
		}
		
	}

	@Nested	@DisplayName("setpostalCode(), getpostalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class PostalCodeTest {
		@Test @Order(1) @DisplayName("postalCode()")
		final void testPostalCode() {
			/*
			 * TODO: Add code with assertion to test
			 */
			TestAddress.setPostalCode("K28 333");
			assertEquals("K28 333", TestAddress.getPostalCode(),
					"Address.setPostalCode()/getPostalCode() does not match expectations");
		}	
	}

	@Nested	@DisplayName("getCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetCityTest {
		@Test @Order(1) @DisplayName("getCity()")
		final void testGetCity() {
			/*
			 * TODO: Add code with assertion to test
			 */
		}	
	}

	
	@Nested	@DisplayName("setStreet(), getStreet() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetStreetTest {
		@Test @Order(1) @DisplayName("setStreet()")
		final void testSetStreet() {
			/*
			 * TODO: Add code with assertion to test
			 */
			TestAddress.setStreet("Street");
			assertEquals("Street", TestAddress.getStreet(),
					"Address.setStreet()/getStreet() does not match expectations");
		}
	}
	
	@Nested	@DisplayName("setNumber() Test, getNumber() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetNumberTest {
		@Test @Order(1) @DisplayName("setNumber()")
		final void testSetNumber() {
			/*
			 * TODO: Add code with assertion to test
			 */
			TestAddress.setNumber("1");
			assertEquals("1", TestAddress.getNumber(),
					"Address.setNumber()/getNumber() does not match expectations");
		}
	}


	@Nested	@DisplayName("setCity() Test, getCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCityTest {
		@Test @Order(1) @DisplayName("setCity()")
		final void testSetCity() {
			/*
			 * TODO: Add code with assertion to test
			 */
			TestAddress.setCity("City");
			assertEquals("City", TestAddress.getCity(),""
					+ "Address.setCity()/getCity() does not match expectations");
		}
	}
	
	@Nested	@DisplayName("setCountry() Test, getCountry() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCountryTest {
		@Test @Order(1) @DisplayName("setCountry()")
		final void testSetCountry() {
			/*
			 * TODO: Add code with assertion to test
			 */
			TestAddress.setCountry("Country");
			assertEquals("Country", TestAddress.getCountry(),""
					+ "Address.setCountry()/getCountry() does not match expectations");
		}
	}
	
	@Nested	@DisplayName("setPostalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetPostalCodeTest {
		@Test @Order(1) @DisplayName("setPostalCode()")
		final void testSetCountry() {
			/*
			 * TODO: Add code with assertion to test
			 */
		}
	}




}
