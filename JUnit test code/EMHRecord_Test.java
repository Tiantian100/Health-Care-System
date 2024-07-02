package testMyHealthCareSystem;


/*		@(#)EMHRecord_Test.java	Jan. 31, 2024
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
* Test class for testing the EMHRecord class
* Uses JUnit version 5
* @author Jawaa Chen
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMHRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMHRecord_Test {
	Address TestAddress;
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
		TestAddress = null;
	}

	/*		Methods to test
	 * 
		+EMHRecord(reportingFacilityProvince:String, institutionNumber:String, chartNumber:String,healthCareNumber:String)
		+toString():String
	 */

	
	@Nested	@DisplayName("EMHRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMHRecordTest {
		@Test @Order(1) @DisplayName("EMHRecord() test with Null arguments")
		final void testEMHRecordWithNullArguments() {
			/*
			 * TODO: Add code with assertion to test constructor\
			 */
			EMHRecord result = null;
			assertNull(result);
		}
		
		/*
		 * TODO: Add code with assertion to test overloaded constructors as you see fit
		 */
		@Test @Order(2) 
		final void testEMHRecordWithValidArguments() {
			EMHRecord TestRecord = new EMHRecord("Ontario", "53945", "0758459565", "014290123605");
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
			EMHRecord TestRecord = new EMHRecord("Ontario", "53945", "0758459565", "014290123605");
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
			System.out.println(TestRecord.toString());
			String expectedValue = String.format("<%s>:\n Reporting Facility Province = %s\n Institution Number = %s\n Functional Centre Account = %s\n "
					+ "Encounter Sequence = %d\n HealthCareNumber = %s\n ChartNumber = %s\n issuingProvince = %s\n residenceCode = %s\n gender = %s\n "
					+ "submissionYear = %d\n adminViaAmbulance = %s\n registrationDate = %d\n registrationTime = %d\n birthDate = %s",
					TestRecord.getClass().getSimpleName(), TestRecord.getReportingFacilityProvince(), TestRecord.getInstitutionNumber(), TestRecord.getFunctionalCentreAccount(),
					TestRecord.getEncounterSequence(), TestRecord.getHealthCareNumber(), TestRecord.getChartNumber(), TestRecord.getIssuingProvince(), TestRecord.getResidenceCode(), 
					TestRecord.getGender(), TestRecord.getSubmissionYear(), TestRecord.getAdminViaAmbulance(), TestRecord.getRegistrationDate(), TestRecord.getRegistrationTime(), TestBirthDate.formattedBirthDate());
			assertEquals(expectedValue, TestRecord.toString(), "EMHRecord.toString() does not match expectations");
			
		}
	}

	
	/*
	 * TODO: Add code to test one set method and one get method
	 */

} 