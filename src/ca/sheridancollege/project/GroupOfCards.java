/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 * @modified by: Hasan Khan, 04/13/19 & Ajoonepreet Matharu, 01/13/19
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Cards> cards;
    String[] suits = {"Hearts","Diamonds", "Spades", "Clubs"};
    int[] values = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13}; //regular cards including Ace=1, Jack=11, Queen=12, & King=13
    int[] specialCard ={1,1,7,7,11,11}; //wildcards used
    
    private int size;//the size of the grouping
    
    //used to add both the suit and value of a card to the arraylist cards which is the deck
   
    for(String s:suits)
    {
        for(int i:values){
            cards.add(new Cards(i,s));
        }
    }
    
    for(int i:specialCard) 
    { //adding special cards to the deck
            cards.add(new Cards(i));
    }
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Cards> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    public void DealDeck ()
    {
        
    }
    
        public void ComputerPlayer()
    {
        
    }
        
        public void SpecialityCards()
        {
            
        }
    
    
    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
}//end class
