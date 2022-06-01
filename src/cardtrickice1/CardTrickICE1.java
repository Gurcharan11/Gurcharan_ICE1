/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * Name : Gurcharan Singh
 * Student Number : 991652322
 */
package cardtrickice1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * step1 : generate 7 random cards and store in array - how step 2: take any
 * card input from user suit,number step 3: user card is in the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7]; //Array of object
        for (int i = 0; i < magicHand.length; i++) {
            Card c1 = new Card();
            c1.setValue((int) Math.floor(Math.random() * (13) + 1));//use a method to generate random *13
            c1.setSuits((int) Math.floor(Math.random() * (4)));//random method suit 
            magicHand[i] = c1;
            System.out.println(c1.getValue() + " " + c1.getSuits());
        }
        //step 2:take input 
        Scanner input = new Scanner(System.in);
        Card c2 = new Card();
        System.out.print(" Please enter a card value and suit: ");
        c2.setValue(input.nextInt());
        Arrays.sort(Card.SUITS);
        c2.setSuits(Arrays.binarySearch(Card.SUITS, input.next()));

        //step 3: match with array 
        int j= 0;
        boolean match = false;
        while (j < 7) {
            if (magicHand[j].getValue() == c2.getValue() && magicHand[j].getSuits().equals(c2.getSuits())) {
                match = true;
            }
            j++;
        }
        
        if(match){System.out.println("card is found");} else {System.out.println("card is not found");}
        Card luckyCard  = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuits(2);
        System.out.println("lucky card is " + luckyCard.getValue() + " of " + luckyCard.getSuits());
    }

}
