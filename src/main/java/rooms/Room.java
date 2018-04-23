package rooms;

import enemies.Enemy;
import players.Player;
import treasure.Treasure;

import java.util.ArrayList;
import java.util.Random;

public class Room {

    private String name;
    private ArrayList<Player> playersInRoom;
    private Enemy enemy;
    private Treasure treasure;

    public Room(String name, Enemy enemy, Treasure treasure){
        this.name = name;
        this.enemy = enemy;
        this.treasure = treasure;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayersInRoom() {
        return playersInRoom;
    }

    public Enemy getMonster() {
        return enemy;
    }

    public Treasure getTreasure() {
        return treasure;
    }


    public void setPlayersInRoom(ArrayList<Player> playersInRoom) {
        this.playersInRoom = playersInRoom;
        //
    }

    public void removeEnemy(Enemy enemy) {
        this.enemy = null;
    }

    public void removeTreasure(Treasure treasure) {
        this.treasure = null;
    }

    public void kickPlayersOut(){
        if ((enemy == null) && (treasure == null)){
            playersInRoom.clear();
        }













        }








}
