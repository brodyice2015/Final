import java.util.Scanner;

public class Pokemon
	{
	private static String [] pokemon = {"Squirtle", "Pikachu", "Charmander", "Bulbasor"};
	static String AIpokemon;
	public static void greetPlayer()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello, " + name + ", would you like to play pokemon?");
		Scanner userInput1 = new Scanner(System.in);
		String choice =userInput1.nextLine();
		if (choice.equals("No"))
			{
			System.out.println("Okay, let's play later!");
			}
		else if(choice.equals("no"))
			{
			System.out.println("Okay, let's play later!");
			}
		else 
			{
			System.out.println("Okay, let's play!");
			}
		}	
	
	}
