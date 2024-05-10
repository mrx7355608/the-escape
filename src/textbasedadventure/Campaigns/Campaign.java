
package textbasedadventure.Campaigns;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import textbasedadventure.Player.Player;

public class Campaign {
    private final String name;
    private static final Player player = new Player("Asmeer");
    
    // Constructor
    public Campaign(String n) {
        this.name = n;
    }
    
    // Getter for campaign name
    public String getName() {
        return name;
    }
    
    // Getter for campaign player
    public static Player getPlayer() {
        return player;
    }
        
    // Starts the campaign
    public void start() {
        this.beginning();
        this.hurdleOne();
        this.hurdleTwo();
        this.hurdleThree();
        this.ending();
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
    
    protected void printWithSmallDelays(String data) {
        System.out.println(data);
        try {
            TimeUnit.MILLISECONDS.sleep((long) 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Campaign.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void beginning() {}
    protected void hurdleOne() {}
    protected void hurdleTwo() {}
    protected void hurdleThree() {}
    protected void ending() {}
}
