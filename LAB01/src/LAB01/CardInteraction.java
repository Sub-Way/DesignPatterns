package LAB01;
/*
 * OOP Assignment 1
 * Contains methods for interaction with user
 */
import java.util.Scanner;
public class CardInteraction {
	private Scanner scanner;
	//private CardOrder card;
	
	public CardInteraction() {
		scanner = new Scanner(System.in);
	}
	
	//runs the program as follows:
	//Gets details of card name from user
	//Displays card
	//Repeatedly, until user responds ok
	//	Asks the user if they would like to change the border
	//	If so, change the border and print the new card
	//Print the price of the order
	//print whether a discount is applicable or not
	public void run() {
		//Alter this gradually to add more details
		CardOrder order = new CardOrder(getNameFromUser());
		System.out.print(order.getSampleCard());
		requests(order);
		getNumberFromUser(order);
	}

	//repeatedly requests and reads name from user
	//until valid (i.e. <=28 chars and contains at least one space
	//finally returns the valid text
	private String getNameFromUser() {
		//use this value until more code written
		System.out.print("Enter name : ");
		String input_name = scanner.nextLine();
		if(input_name.length()>28){
			System.out.println("Write name within  28 character!");
			System.out.print("Enter name : ");
			input_name = scanner.nextLine();
		}
		return input_name;	
	}
	
	private void requests(CardOrder card){
		System.out.print("Enter ¡°OK¡± if this card is ok, otherwise enter an alternative border character:");
		while(true){
			String border = scanner.nextLine();
			if(!border.equals("OK") && border.length()>1){
				System.out.print("Press OK again, or enter the border character 1-size : ");
			}
			else if(!border.equals("OK") ){
				card.setBorder(border);
				System.out.println(card.getSampleCard());
				System.out.print("Enter ¡°OK¡± if this card is ok, otherwise enter an alternative border character:");
			}
			else
				break;
		}
	}
	
	//repeatedly requests and reads number from user
	//until valid number entered i.e. between 1 and 1000
	//finally returns the valid number	
	private void getNumberFromUser(CardOrder card) {
		//use this number until more code written
		
		while(true){
			int count = 0;
			System.out.print("How many cards would you like? ");
			String num=scanner.nextLine();
			count = Integer.parseInt(num);
			if(count > 1000 || count < 1){
				System.out.println("Please enter a number between 1 and 1000!");
			}
			else{
				card.setNumCards(count);
				card.getFinalCost();
				break;
			}
		}
	}			
}


