/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Ajoonepreet Matharu,  04/13/19 
 * @author by: Hasan Khan, 04/13/19
 */
public class Cards 
{
    private String suits; 
    private int value;
    private int specialCard;
    private boolean special; 
    
    //constructs all non-special cards with a suit and number value. 
    public Cards(int value, String Suits)
    {
        this.suits = Suits;
        this.value = value;
        this.specialCard = 0;
        this.special = false;
    }
    
    //constructor for all wildcards such as number 7, ace=1 and jack=11
    public Cards (int specialCard)
    {
        this.suits = "";
        this.value = 0;
        this.specialCard = specialCard;
        this.special = true;
    }

    /**
     * @return the Suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param Suits the Suits to set
     */
    public void setSuits(String Suits) 
    {
       //this.Suits = Suits;
    }

    /**
     * @return the value
     */
    public int getValue() 
    {
        if(!this.special)
        {
             return this.value;
        }
        else {
             return this.specialCard;
        }
       
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
       // this.value = value;
    }

    /**
     * @return the specialCard
     */
    public int getSpecialCard() {
        return specialCard;
    }

    /**
     * @param specialCard the specialCard to set
     */
    public void setSpecialCard(int specialCard) {
       // this.specialCard = 0;
    }

    /**
     * @return the special
     */
    public boolean isSpecial() {
        if(special)
        {
            return true;
        }
        return false;
    }

    /**
     * @param special the special to set
     */
    public void setSpecial(boolean special) {
       // this.special = false;
    }
    
    
    
}
