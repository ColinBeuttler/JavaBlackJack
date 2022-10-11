import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");

        
        scan.nextLine();

        
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        int randomCard1 = drawRandomCard();
        int randomCard2 = drawRandomCard();

        int dealerRandom1 = drawRandomCard();
        int dealerRandom2 = drawRandomCard();
        
        System.out.println("\n You get a \n" + cardString(randomCard1)+ "\n and a \n" + cardString(randomCard2));

        
        //       – print: your total is: <hand value>

       int handValue = Math.min(randomCard1, 10) + Math.min(randomCard2, 10);

        System.out.println("\nYour total is: " + handValue);

        
        //
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden

        System.out.println("\nThe dealer shows \n " + cardString(dealerRandom1) + "\nand has a card facing down \n" + faceDown());
       
        int dealerValue = Math.min(dealerRandom1, 10) + Math.min(dealerRandom2, 10);

        System.out.println("\nThe dealer's total is hidden");

        String option = hitOrStay();

        //
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 

        while (!option.equalsIgnoreCase("stay")) {
            int newCard = drawRandomCard();
            handValue += Math.min(newCard, 10);
            System.out.println("\nYou get a \n" + cardString(newCard));
            System.out.println("\nyour new total is " + handValue);

            if (handValue > 21) {
                System.out.println("Bust! Player loses.");
                System.exit(0);
            }

            option = hitOrStay();
        }
        
    
   
        System.out.println("\nDealer's turn");
        System.out.println("\nThe dealer's cards are \n" + cardString(dealerRandom1) + "\nand a \n" + cardString(dealerRandom2));

        dealerValue = dealerRandom1 + dealerRandom2;

        while (dealerValue < 17) {
            int dealerNewcard = drawRandomCard();
            dealerValue += Math.min(dealerNewcard, 10);
            System.out.println("\nDealer gets a \n" + cardString(dealerNewcard));
            System.out.println("\nDealer's total is " + dealerValue);
        }
        
        if (dealerValue > 21) {
            System.out.println("Bust! Dealer loses");
            System.exit(0);
        }
        
        if (handValue > dealerValue) {
            System.out.println("Player wins!");
        }

        else {
            System.out.println("Dealer wins!");
        }

     
        scan.close();

    }

    /** 
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    int cardNumber = drawRandomCard();

    public static int drawRandomCard() {
        double randomCard = (Math.random() * 13) + 1;
        int randomCardInt = (int) randomCard;
        return randomCardInt;
    }
     
    

    /** 
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */

    public static String cardString( int cardNumber) {
        switch (cardNumber) {
            case 1:
            return
            
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";

            case 2:
            return

            "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";

            case 3:
            return

            "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";

            case 4:
            return

            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";

            case 5:
            return

            "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";

            case 6:
            return

            "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";

            case 7:
            return

            "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";

            case 8:
            return

            
            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";

            case 9:
            return

            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";

            case 10:
            return

            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";

            case 11:
            return

            "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";

            case 12:
            return

            "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";

            case 13:
            return

            "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";

        default:
        return "Not available";

        }
    }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** 
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */

    public static String hitOrStay() {
        System.out.print("\nEnter either 'hit' or 'stay'");
        String res = scan.nextLine();

        while (!(res.equalsIgnoreCase("hit") || res.equalsIgnoreCase("stay"))) {
            System.out.println("Answer 'hit' or 'stay'");
            res = scan.nextLine();
        }
        return res;
    }
     
    }

