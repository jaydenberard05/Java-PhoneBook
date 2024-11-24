package phonebook;
/**
 * @author Jayden Berard
 * @since 11-19-24
 * @version 1.0.0
 */
import java.util.Hashtable;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String args[]) {
		
		Hashtable<String, String> phonebook = new Hashtable<String, String>(811);
		Scanner input = new Scanner(System.in);
		
		phonebook.put("James", "845-614-9805");
		phonebook.put("John", "845-564-9901");
		phonebook.put("Joanne", "845-634-9305");
		phonebook.put("Jamie", "845-654-5301");
		phonebook.put("Jack", "845-834-9785");
		phonebook.put("Bob", "845-934-0905");
		
		System.out.println(" ____  _                      ____              _            _   ___  \r\n"
				+ "|  _ \\| |__   ___  _ __   ___| __ )  ___   ___ | | __ __   _/ | / _ \\ \r\n"
				+ "| |_) | '_ \\ / _ \\| '_ \\ / _ \\  _ \\ / _ \\ / _ \\| |/ / \\ \\ / / || | | |\r\n"
				+ "|  __/| | | | (_) | | | |  __/ |_) | (_) | (_) |   <   \\ V /| || |_| |\r\n"
				+ "|_|   |_| |_|\\___/|_| |_|\\___|____/ \\___/ \\___/|_|\\_\\   \\_/ |_(_)___/ \r\n"
				+ "");
		System.out.println("Welcome to PhoneBook v1.0");
		System.out.println("Enter a Name in the list to get a phone number:");		
		System.out.println("-------------------------------------------------");		
		System.out.println("James");
		System.out.println("John");
		System.out.println("Joanne");
		System.out.println("Jamie");
		System.out.println("Jack");
		System.out.println("Bob");
		
		
		String name = input.next();
		//String number = input.next();
				
		 	String s = phonebook.get(name);
		 	System.out.printf("The Phone Number is %s%n", s);
	}
	
	
}