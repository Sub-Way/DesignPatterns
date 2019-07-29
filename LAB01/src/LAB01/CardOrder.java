package LAB01;
/**
 * OOP Assignment One
 * CardOrder class keeps details of one card order
 * and provides methods to print a card 
 * and determine the price
 *
 */

import java.util.StringTokenizer;

import LAB01.Name;
public class CardOrder {
	private String fName;
	private String Init;
	private Name name;  	//the name printed on the card
	private String border;    //the card border
	private int numCards;   //the number of cards to be printed
	private String fn;
	private int total_price = 0;
	private double discount = 0.0;
	
	private static final int CARD_LEN = 32;  //the length of the card in characters
	
	//initialises name from value in parameter
	//and sets other instance variables to suitable default values
	//you can create a Name from a single string after L5
      //If you want to start before then, just write name = new Name("A", "B", "C") in the constructor!
	
	public CardOrder(String fullName) {
		border = "*";
		setName(fullName);
		System.out.println("Here is a sample card:");
	}
	
	///////////////////////////////////////////
	//accessor/mutator methods
	
	//returns the character used in the border
	public String getBorder() {
		return border;
	}
	
	//sets the character used in the border 
	//to that provided in the parameter
	public void setBorder(String input) {
		border = input;
	}
	
	//returns the name 
	public Name getName() {
		return name;
	}
	
	//sets the name used in the card
	//to that provided in the parameter
	public void setName(String fullName) {
		fn = fullName;
		StringTokenizer st = new StringTokenizer(fn," ");
		String [] array = new String[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens()){
			array[i++] =st.nextToken();
		}
		if(array.length == 1) {
			name = new Name(fullName, "", "");
		}
		else if(array.length == 2) {
			name = new Name(array[0], "", array[1]);
		}
		else if(array.length == 3){
			name = new Name(array[0], array[1], array[2]);
		}
		else
			return;
		
		Init = name.getInits();
	}
	
	//returns the number of cards to be printed
	public int getNumCards() {
		return numCards;
	}
	
	//sets the number of cards to be printed 
	//to that provided in the parameter
	public void setNumCards(int n) {
		numCards = n;
	}
	///////////////////////////////////////////
	
	//returns a sample card, including a newline at the end of each line
	public String getSampleCard() {
		return getTopLine() + getBlankLine() + getLineWithName()
		       + getBlankLine() + getTopLine();
	}
	
	//returns a String containing the top or bottom line
	//of a card, including a newline character at the end
	private String getTopLine() {
		//use this value until more code written
		String topline = "";
		int len = CARD_LEN - 2*Init.length();
		for(int i=0; i<len; i++){
			topline += border;
		}
		return Init+topline+Init+'\n';
	}
	
	//returns a String containing the blank line
	//of a card, with a border char at each end
	//and including the newline character	
	private String getBlankLine() {	
		//use this value until more code written
		String b = border;
		String blankline="";
		for(int i=0; i<30; i++){
			blankline += " ";
		}
		return b+blankline+b+'\n';
	}
	
	//returns a String containing the name line
	//of a card, including name, padding and border
	//and including the newline character	
	private String getLineWithName() {
		//use this value until more code written
		name.setCenterName(fn);;
		
		//use this value until more code written
		String nameline = "";
		int len = name.getCenterName().length();
		int nbline = CARD_LEN - len;
		
		for(int i=0; i<CARD_LEN - 1; i++) {
			if(i==0) 
				nameline += border;
			else if(i<nbline/2) {
				nameline += " ";
			}
			else if(i == nbline/2) {
				nameline += name.getCenterName();
				i = i + name.getCenterName().length() - 1;
			}
			else if(i>nbline/2 && i<CARD_LEN) {
				nameline += " ";
			}
		}

		nameline += border;
		
		return nameline + "\n";
	}
	
	//returns the price of one card
	//in pounds (i,e either 0.20 or 0.25)
	//based on the number of characters in the name to be printed
	//0.20 if <=12 otherwise 0.25
	public double getCardPrice() {
		int price = 0;
		if(name.getCenterName().length() <= 12)
			price = 40;
		else
			price = 50;
		
		return total_price = price * numCards;
	}

	//returns the final cost of the order
	//which is the number of cards multiplied by the card price
	//and reduced by 10% if >= 100 cards
    public void getFinalCost() {
		//use this value until more code written
    	if(!hasDiscount()){
    		System.out.println("The price of " + numCards + " cards is " + getCardPrice() * 0.9 + " won.");
    		System.out.println("10% discount applied");
    	}
    	else{
    		System.out.println("The price of " + numCards + " cards is " + getCardPrice() + " won.");
    		System.out.println("No discoint given");
    	}  	
    }
    
    //returns true if number of cards < 100, false otherwise
    public boolean hasDiscount() {
    	if(numCards < 200)
    		return true;
    	else
    		return false;
    }
}
