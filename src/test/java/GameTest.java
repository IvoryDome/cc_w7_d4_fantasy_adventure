import enemies.Enemy;
import games.Game;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import players.Player;
import rooms.Room;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    private Game game;
    private Dwarf player1;
    private ArrayList<Player> players;
    private Room room1;
    private ArrayList<Room> rooms;
    private Enemy enemy;

    @Before
    public void before() {
        player1 = new Dwarf("Grug", 100);
        players = new ArrayList();
        players.add(player1);
        enemy = new Enemy("Balrog of Morgoth", 1000, 2000);
        room1 = new Room("Haunted Cavern", enemy, null);
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
//        assertEquals(0, game.g);
//    }

    @Test
    public void canAddPlayersToRoom(){
        game.addPlayersInGameToPlayersInRoom(room1);
        assertEquals(1, room1.getPlayersInRoom().size());
    }


}
