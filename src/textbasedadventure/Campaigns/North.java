package textbasedadventure.Campaigns;


import java.util.Scanner;
import textbasedadventure.Player.Player;

public class North extends Campaign {
    public North() {
        super("North");
    }
    
    @Override
    protected void beginning() {}

    @Override
    protected void hurdleOne() {
        Player p = Campaign.getPlayer();
        this.printWithSmallDelays("Here we go! " + p.getName() + " has came across his first trap!...");
        this.printWithSmallDelays("It's a narrow bridge with deadly footholds....");
        this.printWithSmallDelays("What do you think? How will you cross this bridge");

        // TODO: take a suggestion from user
        
        int choice = this.takeUserChoice();
        switch (choice) {
            case 1 -> {
                this.printWithSmallDelays("Oh no! You have landed on foothold!");
            }

            case 2 -> {
                this.printWithSmallDelays("Throwing stone at first foothold...");
                this.printWithSmallDelays("First foothold has been destroyed!");
                
                this.printWithSmallDelays("Now, moving forward....");
                System.out.println("Wait! there's another foothold!");
                
                this.printWithSmallDelays("Throwing stone at second foothold...");
                this.printWithSmallDelays("Destroyed!");
                this.printWithSmallDelays("Throwing stone at third foothold...");
                this.printWithSmallDelays("Destroyed!");
            }
            
            case 3 -> {
                System.out.println("");
            }
        }
        
        // Cleared
        this.printWithSmallDelays("This is just the beginning...(evil emoji)");
    }
    
    @Override
    protected void hurdleTwo() {}
    
    @Override
    protected void hurdleThree() {}
    
    @Override
    protected void ending() {}
    
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
