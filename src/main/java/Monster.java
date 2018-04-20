public class Monster {

    private String name;
    private int damage;
    private int health;

    public Monster(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damageTaken){
        this.health -= damageTaken;
    }

    public String attackPlayer(Player player){
        int playerHealth;
        playerHealth = player.getHealth();
        player.setHealth(playerHealth -= damage);
        return "RAWR! I attack " + player.getName() + " for " + damage + "damage!";
    }
}
