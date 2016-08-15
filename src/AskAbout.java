
import java.io.IOException;
import java.util.Scanner;

public class AskAbout {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Welcome to Learn All About Our Student...");
			// Adds a Space to previous statement
			System.out.println();

			System.out.println("Which Stuident Would You Like to Learn About?");
			System.out.println();

			System.out.println("Make a Selection: Janae || Jamel || Mariah");

			String userInput = sc.nextLine();
			String selection = sc.nextLine();

		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
	}
}
/*
 * 
 * 
 * switch (selection) { case "Janae": selection = "Janae"; break; case "Jamel":
 * selection = "Jamel"; break; case "Mariah": selection = "Mariah"; break;
 * 
 * System.out.println ("Great! You selected" + selection);
 * 
 * 
 * }
 * 
 * } } /* if (selection.equalsIgnoreCase("Janae")) { System.out.println(
 * "You select " + selection); } else throw new IllegalArgumentException(
 * "Student does not exist.");
 * 
 * 
 * if (selection.equalsIgnoreCase("Jamel")) System.out.println("You select " +
 * selection);
 * 
 * else throw new IllegalArgumentException("Student does not exist.");
 * 
 * 
 * if (selection.equalsIgnoreCase("Mariah")) { System.out.println("You select "
 * + selection);
 * 
 * 
 * }else{ throw new IllegalArgumentException("Student does not exist.");
 */
