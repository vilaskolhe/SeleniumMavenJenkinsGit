package src.main;

import java.util.Base64;

public class TestClass {

	public static void main(String[] args) {
		
		
		byte[] Password = Base64.getDecoder().decode("RHdlYXJrYWJhaV81NDEz");
		deleteUnwantedFromGMailInbox deleteUnwantedFromGMailInbox=new deleteUnwantedFromGMailInbox();

		String x="abc";
		int y='d';
		
		String z=x+y;
		System.out.println(z);
		
		
		
		
		// TODO Auto-generated method stub
		System.out.println("in Main");
//		removeDuplicatesFromString duplicatesFromString = new removeDuplicatesFromString();
//
//		System.out.println(duplicatesFromString.removeDuplicateCharacters("aaabbbbcccc"));
//		System.out.println(duplicatesFromString.removeDuplicateByUsingSet("aabbcc"));

//		palindromNumbersBetweenTwoNumbers betweenTwoNumbers= new palindromNumbersBetweenTwoNumbers();
//		betweenTwoNumbers.palindrom();
		
//		numerOfDaysToReachTerrace daysToReachTerrace= new numerOfDaysToReachTerrace();
//		daysToReachTerrace.numberOfDaysToReachTerrace();
		utilityMethods utilityMethods= new utilityMethods();
		utilityMethods.launchBrowser("https://google.com");
		utilityMethods.maximizeBrowser();
		deleteUnwantedFromGMailInbox.loginToGMail("kolhe.vilas", new String(Password));
		System.out.println("Out Of Main");
	}

}
