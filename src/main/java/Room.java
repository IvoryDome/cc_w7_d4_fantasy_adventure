import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Player> playersInRoom;
    private Monster monster;
    private Treasure treasure;

    public Room(String name, Monster monster, Treasure treasure){
        this.name = name;
        this.monster = monster;
        this.treasure = treasure;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayersInRoom() {
        return playersInRoom;
    }

    public Monster getMonster() {
        return monster;
    }

    public Treasure getTreasure() {
        return treasure;
    }


    public void setPlayersInRoom(ArrayList<Player> playersInRoom) {
        this.playersInRoom = playersInRoom;
        //
    }

    public void removeMonster(Monster monster) {
        this.monster = null;
    }

    public void removeTreasure(Treasure treasure) {
        this.treasure = null;
    }

    public void kickPlayersOut(){
        if ((monster == null) && (treasure == null)){
            playersInRoom.clear();
        }
    }



}
