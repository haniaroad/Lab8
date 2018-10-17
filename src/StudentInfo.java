import java.util.Arrays;
import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);

		String names[] = { "Derien", "Carl", "Ben", "Matt", "Dejuan" };
		String hobbies[] = { "Hiking", "Coding", "Social Media", "Studying", "Basketball" };
		String cities[] = { "Detroit", "Chicago", "Los Angeles", "Miami", "Oakland" };
		String newTry = "";
		
		
		do {
		
		for (int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + ". " + names[i]);
		}

		System.out.println("\nWelcome to our Java class. Which student would you like to learn more about?");
			
		
		int userOption = Validator.getInt(scanner, "Select a student: ", 1, names.length);
		
		System.out.println("Would you like to know " + names[userOption-1] + "'s favorite hobby or city?");
			String userPick = scanner.nextLine();
		
			
			// if city is chosen return the value at the index for the city array
			if(userPick.equalsIgnoreCase("City")) {
				System.out.println(names[userOption -1]  + "'s favorite city is " + cities[userOption -1] + "." + " Would you like to know more about " + names[userOption -1]  + "? Y/N");
						
			}
					
			else {
				System.out.println(hobbies[userOption-1] + " is his favorite hobby." + " Would you like to know about another student? Y/N");
					newTry = scanner.nextLine();		
			
			}
			
		} while(newTry.equalsIgnoreCase("y"));				
				
				
			
			// else if not city then the only option is hobby return the hobby for index
		
				//Math the number a user selects to a student's info
				//show food match for selection
				
				//System.out.println(names[userOption -1] + "'s favorite hobby is " + hobbies[userOption -1] + " and his favorite city is " + cities[userOption -1] + ".");
	}

}
