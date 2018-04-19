import java.util.ArrayList;

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
        this.health = health;
    }

    public void pickUpTreasure(Treasure treasure){
        this.loot.add(treasure);
    }




}
