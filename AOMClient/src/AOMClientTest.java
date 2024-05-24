import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

class AOMClientTest {

	@Test
    public void testCreateSubscriber_InputHandling() {
        // Prepare a string that simulates user input
        String input = "5000000000\n" + // MSISDN
                       "2\n" +          // Package ID
                       "MTH\n" +       // Name
                       "Course\n" +        // Surname
                       "mth@gmail.com\n" + // Email
                       "mth@1445\n" +         // Password
                       "0000\n";      // Security Key
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream); // Redirect System.in to our ByteArrayInputStream

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the method
        AOMClient.createSubscriber();

        // Verify that the correct prompts are printed to the console
        String expectedOutput = "{\"message\":\"successfully registered\",\"msisdn\":\"5100000000\"}\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
	
	public void testLoginSubscriber_InputHandling() {
        // Prepare a string that simulates user input
        String input = "5000000000\n" + // MSISDN
                       "mth@1445\n" ;       // Password
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream); // Redirect System.in to our ByteArrayInputStream

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the method
        AOMClient.createSubscriber();
        
        // Verify that the correct prompts are printed to the console
        String expectedOutput = "{\"msisdn\":\"5100000000\"}\n\"token\":\"eyJhbGciOiJIUzUxMiJ9eyJzdWIiOiI1MD\"}\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
	
	public void testLoginSubscriber_WrongInputHandling() {
        // Prepare a string that simulates user input
        String input = "547845413145\n" + // MSISDN
                       "57451584\n" ;       // Password
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream); // Redirect System.in to our ByteArrayInputStream

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the method
        AOMClient.createSubscriber();
        
        // Verify that the correct prompts are printed to the console
        String expectedOutput = "Error: HTTP response code - 400\r\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
	
	 public void testShowRemainingBalanceList_InputHandling() {
	        // Redirect System.out to capture the output
	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outputStream));

	        // Call the method with provided MSISDN and Authorization token
	        AOMClient.showRemainingBalanceList("eyJhbGciOiJIUzUxMiJ9eyJzdWIiOiI1MD");

	        // Verify that the correct parameters are used and the output is printed to the console
	        String expectedOutput = "{\n" +
	                                "    \"package\": {\n" +
	                                "        \"id\": 2,\n" +
	                                "        \"name\": \"mennan pack\",\n" +
	                                "        \"period\": 30,\n" +
	                                "        \"price\": 350.0,\n" +
	                                "        \"dataAmount\": 20,\n" +
	                                "        \"minAmount\": 1000,\n" +
	                                "        \"smsAmount\": 150\n" +
	                                "    },\n" +
	                                "    \"balance\": {\n" +
	                                "        \"remData\": 20,\n" +
	                                "        \"remSms\": 150,\n" +
	                                "        \"remMin\": 1000,\n" +
	                                "        \"remMoney\": 100.0,\n" +
	                                "        \"endDate\": 1718648443,\n" +
	                                "        \"startDate\": 1716056443,\n" +
	                                "        \"price\": 350.0,\n" +
	                                "        \"packageId\": 2\n" +
	                                "    }\n" +
	                                "}\n";
	        assertEquals(expectedOutput, outputStream.toString());
	    }

	 public void testSendSMSMessage() {
	        // Redirect System.out to capture the output
	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outputStream));

	        // Call the method
	        AOMClient.sendSMSMessage("dummy_token");

	        // Verify that the correct message is printed to the console
	        String expectedOutput = "Sending SMS Message...\n";
	        assertEquals(expectedOutput, outputStream.toString());
	    }

	    @Test
	    public void testViewSMSInbox() {
	        // Redirect System.out to capture the output
	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outputStream));

	        // Call the method
	        AOMClient.viewSMSInbox("dummy_token");

	        // Verify that the correct message is printed to the console
	        String expectedOutput = "Viewing SMS Inbox...\n";
	        assertEquals(expectedOutput, outputStream.toString());
	    }

	    @Test
	    public void testUserLogout() {
	        // Redirect System.out to capture the output
	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outputStream));

	        // Call the method
	        AOMClient.userLogout("dummy_token");

	        // Verify that the correct message is printed to the console
	        String expectedOutput = "Logging out...\n";
	        assertEquals(expectedOutput, outputStream.toString());
	    }
	 
}
