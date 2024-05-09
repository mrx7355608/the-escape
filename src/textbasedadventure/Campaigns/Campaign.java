
package textbasedadventure.Campaigns;

import textbasedadventure.Character.Character;

public class Campaign {
    private final String name;
    private static final Character character = new Character("Asmeer");
    
    // Constructor
    public Campaign(String n) {
        this.name = n;
    }
    
    // Getter for campaign name
    public String getName() {
        return name;
    }
    
    // Getter for campaign character
    public static Character getCharacter() {
        return character;
    }
        
    // Starts the campaign
    public void start() {
        this.hurdleOne();
        this.hurdleTwo();
        this.hurdleThree();
    }
    
    // Restarts a specific hurdle
    public void restartHurdle(int hurdleNumber) {
        switch (hurdleNumber) {
            case 1 -> {
                this.hurdleOne();
            }
            case 2 -> {
                this.hurdleTwo();
            }
            case 3 -> {
                this.hurdleThree();
            }
        }
    }
    
    // Restarts campaign
    public void restartCampaign() {
        this.start();
    }
    
    protected void hurdleOne() {}
    protected void hurdleTwo() {}
    protected void hurdleThree() {}
}
