package textbasedadventure.Campaigns;

import java.util.Scanner;

public class North extends Campaign {

    public North() {
        super("North");
    }

    @Override
    public void hurdleOne() {
        System.out.println("Here we go! You have came across your first trap!...");

        // Thread.sleep(1000.0);
        System.out.println("It's a narrow bridge with deadly footholds....");
        System.out.println("What do you think? How will you cross this bridge");

        // TODO: take a suggestion from user
        int choice = takeUserChoice();

        switch (choice) {
            case 1 -> {
                System.out.println("Oh no! You have landed on foothold!");
            }

            case 2 -> {
                System.out.println("Throwing stone at first foothold...");
                System.out.println("Destroyed!");
                
                System.out.println("Moving forward....");
                System.out.println("Wait! there's another foothold!");
                
                System.out.println("Throwing stone at second foothold...");
                System.out.println("Destroyed!");
                System.out.println("Throwing stone at third foothold...");
                System.out.println("Destroyed!");
            }
            
            case 3 -> {
                System.out.println("");
            }
        }
        
        // Cleared
        System.out.println("This is just the beginning...(evil emoji)");
    }
    
    @Override
    public void hurdleTwo() {}
    
    @Override
    public void hurdleThree() {}
    
    private int takeUserChoice() {
        System.out.println("1. By performing frontflip.");
        System.out.println("2. Throwing stones at the footholds");
        System.out.println("3. Grab an axe and destroy the foothold");
        System.out.println("4. Go back.");
        System.out.print("Choose: ");
        int choice = new Scanner(System.in).nextInt();
        return choice;
    }
}
