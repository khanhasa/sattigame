/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author Hasan Khan, 2019
 * @author Ajoonepreet Matharu, 2019
 */
//we tried working with enums for the card value and suits but got struck for how to contiune with it 
// which is why we then switched to arraylist instead of enums. 
// which is the reason for there beibg two card classes. the card class uses the enums and the cards class uses the arraylist. 
//{
    
    public class Card 
    {
       enum Suits 
    {
        Diamonds, Hearts, Clubs, Spades; 
    }
    
    enum Value
    {
       Two, Three, Four, Five, Six, Eight, Nine, Ten, Queen, King;  
    }
    
    enum Special 
    {
        Seven, Jack, Ace; 
    }

    public Card(String Value, String s)
    {
      
    }
  
    
        private String suit;
	private String value;
	private String specialCard;
	private boolean special;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
       if(suit.equals("Hearts")||suit.equals("Diamonds")||suit.equals("Spades")||suit.equals("Clubs"))
        {
        this.suit = suit;
        }
        else
        {
            System.out.println("The suit name is not correct");
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
       if(value.equals("Two")||value.equals("Three")||value.equals("Four")||value.equals("Five")||value.equals("Six")||value.equals("Eight")
               ||value.equals("Nine")||value.equals("Ten")||value.equals("Queen")||value.equals("King"))
        this.value = value;
    }

    public String getSpecialCard() {
        return specialCard;
    }

    public void setSpecialCard(String specialCard) {
       if(specialCard.equals("Seven")||specialCard.equals("Ace")||specialCard.equals("Jack"))
                
        this.specialCard = specialCard;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }
    
        
        
    
    
    
    
