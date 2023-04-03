package q3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Table {
    private Set<Player> players;
    private Player[] seat = new Player[5];

    public Table(){
        players = new HashSet<>();
    }

    public void addPlayers(Player player){
        players.add(player);
    }

    public boolean seatPlayers(){
        if(players.size() >= 5){
            int i = 0;
            while(seat.length < 5){
                Random random = new Random();
                //seat[i] = players.
            }


        }
        return false;
    }

}
