package textbasedadventure;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import textbasedadventure.Campaigns.Campaign;
import textbasedadventure.Campaigns.North;
import textbasedadventure.Campaigns.South;
import textbasedadventure.Campaigns.East;
import textbasedadventure.Campaigns.West;

public class Game {

    public void start() {
        this.introduction();
        this.chooseCampaign().start();
    }

    private void introduction() {
        this.printWithDelay("Welcome to Fantasy jungle");
        this.printWithDelay("You are in the middle of this forest, filled with hardships and challenges...");
        this.printWithDelay("You will have to find a way to escape this forest...");
        // TODO: add more souts to provide information about skillshop, inventory
        // campaigns and other things.
    }

    private Campaign chooseCampaign() {
        while (true) {
            System.out.println("\nSelect a campaign: ");
            System.out.println("1. North");
            System.out.println("2. South");
            System.out.println("3. East");
            System.out.println("4. West");
            int choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1 -> {
                    return new North();
                }
                case 2 -> {
                    return new South();
                }
                case 3 -> {
                    return new East();
                }
                case 4 -> {
                    return new West();
                }
                default -> {
                    System.out.println("\nERROR! Please select a valid campaign");
                    continue;
                }
            }
        }

    }

    private void printWithDelay(String str) {
        System.out.println(str);
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
