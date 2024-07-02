package testMyHealthCareSystem;


/*		@(#)EMRecord_Test.java	Jan. 31, 2024
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
* Test class for testing the EMRecord class
* Uses JUnit version 5
* @author Jawaa Chen
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMRecord_Test {
	EMRecord TestRecord;
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	TODO: Undo what was setup for each test before the test was run
		 */
		TestRecord = null;
	}

	/*		Methods to test
	 * 
		+EMRecord(reportingFacilityProvince:String, institutionNumber:String, chartNumber:String,healthCareNumber:String)
		+toString():String
		+setName(name:Name):void
		+setAddress(address:Address):void
		+setHeight():void
		+getHeight():int
		+setWeight():void
		+getWeight():int
		+formattedName():String
		+formattedAddress():String
		+bmi():int
	 */

	
	@Nested	@DisplayName("EMRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMRecordTest {
		@Test @Order(1) @DisplayName("EMRecord() test with Null arguments")
		final void testEMRecordWithNullArguments() {
			/*
			 * TODO: Add code with assertion to test constructor\
			 */
			EMRecord result = null;
			assertNull(result);
		}
		
		/*
		 * TODO: Add code with assertion to test overloaded constructors as you see fit
		 */
		@Test @Order(2)
		final void testEMRecordWithValidArguments() {
			EMRecord TestRecord = new EMRecord("Ontario", "53945", "0758459565", "014290123605");
			assertNotNull(TestRecord);
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
			EMRecord TestRecord = new EMRecord("Ontario", "53945", "0758459565", "014290123605");
			TestRecord.setHeight(72);
			TestRecord.setWeight(180);
			TestRecord.setFunctionalCentreAccount("123456789");
			TestRecord.setEncounterSequence(001);
			TestRecord.setIssuingProvince("Ontario");
			TestRecord.setResidenceCode("d81c41v");
			TestRecord.setGender("M");
			TestRecord.setSubmissionYear(1980);
			TestRecord.setAdminViaAmbulance("A");
			TestRecord.setRegistrationDate(19990214);
			TestRecord.setRegistrationTime(0000); 
			BirthDate TestBirthDate = new BirthDate(1999,01,01);
			TestRecord.setBirthDate(TestBirthDate);
			Name TestName = new Name("First", "Last", "Middle");
			TestRecord.setName(TestName);
			Address TestAddress = new Address("Street","833","White", "K9K 2S7");
			TestRecord.setAddress(TestAddress);
			System.out.println(TestRecord.toString());
			String addon = ("<EMRecord>:\n Reporting Facility Province = Ontario\n Institution Number = 53945\n"
					+ " Functional Centre Account = 123456789\n Encounter Sequence = 1\n HealthCareNumber = 014290123605\n"
					+ " ChartNumber = 0758459565\n issuingProvince = Ontario\n residenceCode = d81c41v\n gender = M\n"
					+ " submissionYear = 1980\n adminViaAmbulance = A\n registrationDate = 19990214\n registrationTime = 0\n"
					+ " birthDate = 1999/01/01");
			String expectedValue = String.format("<%s>:\n Height = %s\n Weight = %s\n Name = %s\n Address = %s\n\n %s", 
					TestRecord.getClass().getName(), TestRecord.getHeight(), TestRecord.getWeight(), TestRecord.getName(), TestRecord.getAddress(), addon);
			System.out.println(expectedValue);
			assertEquals(expectedValue, TestRecord.toString(), "EMRecord.toString() does not match expecations");
		}
	}

	
	/*
	 * TODO: Add code to test one set method and one get method
	 */

}
