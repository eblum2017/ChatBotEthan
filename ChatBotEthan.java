/**
*This is a chatBot that talks back to you
*until you type in bye or Bye.
* @author Ethan Blum
* @version 1.0
*/
import java.util.Scanner;

public class ChatBotEthan
{

	public static void main(String[] args)
	{
		//creating a scanner object to get input from the keyboard

			Scanner keyboard = new Scanner(System.in);
			System.out.println("Duuuuuuude what's your name? ");
			String name = keyboard.nextLine();
			System.out.print("Suuuppppp " + name + "! Hows it hangin?: ");
			String input = keyboard.nextLine();
			System.out.println("Dude, I'm totally stoked that your " + input);
			System.out.println("So Dude, " + name + ", How old are you?: ");
			int age = keyboard.nextInt();
		
			input = keyboard.nextLine();
			//typecasting a String into an int
			if (age > 25 )
			{
				System.out.println("Oh Radical!!! Do you shred the gnarly waves?: ");
			}else if (age > 5)
				System.out.println("Sweeeeeet! Do you shred the gnarly waves?: ");
			else
			{
				System.out.println("Sup baby!!!! Have you pooped yet?: ");
			}
			String response = keyboard.nextLine();
			System.out.println(response + "! Nice!" );
			System.out.println("Whats your favorite trick bro??");
			String reply = keyboard.nextLine();
			while (!reply.equals("Bye") && !reply.equals("bye"))
			{
				System.out.println("Oh gnarly! Me too! What else is your favorite trick?");
				reply = keyboard.nextLine();

			}
		
		
		
	} 
	
}