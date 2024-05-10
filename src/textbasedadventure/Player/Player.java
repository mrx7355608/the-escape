
package textbasedadventure.Player;

import java.util.ArrayList;

public class Player {
    private final String name;
    private int health;    
    private final ArrayList<String> skills;
    private int goldCoins;
    
    public Player(String n) {
        this.name = n;
        this.health = 100;
        this.goldCoins = 50;
        this.skills = new ArrayList();
    }
    
    public void setHealth(int health) {
        this.health = health;
    }

    public void setGoldCoins(int goldCoins) {
        this.goldCoins = goldCoins;
    }
    
    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public int getGoldCoins() {
        return goldCoins;
    }
    
}
