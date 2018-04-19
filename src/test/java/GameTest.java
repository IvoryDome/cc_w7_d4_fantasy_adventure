import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    private Game game;
    private Dwarf player1;
    private ArrayList<Player> players;
    private Room room1;
    private ArrayList<Room> rooms;
    private Monster monster;

    @Before
    public void before() {
        player1 = new Dwarf("Grug", 100);
        players = new ArrayList();
        players.add(player1);
        monster = new Monster("Balrog of Morgoth", 1000, 2000);
        room1 = new Room("Haunted Cavern", monster, null);
        rooms = new ArrayList<>();
        rooms.add(room1);
        game = new Game(players, rooms);
    }

    @Test
    public void gameHasPlayers(){
        assertEquals(1, game.getPlayersInGame().size());
    }

    @Test
    public void gameHasRooms(){
        assertEquals(1, game.getRoomsInGame().size());
    }

//    @Test
//    public void roomStartsEmpty(){
//        assertEquals();
//    }

    @Test
    public void canAddPlayersToRoom(){
        game.addPlayersInGameToPlayersInRoom(room1);
        assertEquals(1, room1.getPlayersInRoom().size());
    }


}
