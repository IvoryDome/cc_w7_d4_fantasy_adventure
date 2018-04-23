package players;

import java.util.ArrayList;
import interfaces.*;
import treasure.Treasure;

public abstract class Player {

    private String name;
    private int health;
    private ArrayList<Treasure> loot;

    public Player(String name, int health){
        this.name = name;
        this.health = health;
        this.loot = new ArrayList<Treasure>();
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        health = health;
    }

    public void pickUpTreasure(Treasure treasure){
        this.loot.add(treasure);
    }

    public void takeDamage(int damageTaken){
        this.health -= damageTaken;
    }

    public void getHealed(int healingCapacity){
        health += healingCapacity;
    }

}
