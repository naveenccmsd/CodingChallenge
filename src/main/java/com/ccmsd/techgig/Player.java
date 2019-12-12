package com.ccmsd.techgig;

import java.util.ArrayList;
import java.util.List;


public class Player {

    public static int bt = 0;
    public static int bw = 0;
    public static int wk = 0;
    public static int al = 0;

    int id = 0;
    String name;
    int points;
    String city;

    public Player(String name, int points, String city) {
        super();
        this.name = name;
        this.points = points;
        this.city = city;
        id++;
        switch (name) {
            case "BT":
                bt++;
                break;
            case "BW":
                bw++;
                break;
            case "WK":
                wk++;
                break;
            case "AL":
                al++;
                break;
        }
    }

    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", points=" + points + ", city=" + city + "]";
    }
    public String tostaticString() {
        return "Player [BT=" + bt + ", BW=" + bw + ", WK=" + wk + ", AL=" + al + "]";
    }
    public static String toStaticString() {
        return "Player [BT=" + bt + ", BW=" + bw + ", WK=" + wk + ", AL=" + al + "]";
    }

    public static List<Player> addPlayers() {
        List<Player> player = new ArrayList<>();
        player.add(new Player("BT", 10, "Ipswich"));
        player.add(new Player("BT", 10, "Ipswich"));
        player.add(new Player("BT", 10, "Ipswich"));
        player.add(new Player("BT", 10, "Ipswich"));
        player.add(new Player("BT", 10, "Ipswich"));
        player.add(new Player("BT", 10, "Ipswich"));
        player.add(new Player("BT", 10, "Ipswich"));
        player.add(new Player("BT", 10, "Ipswich"));
        player.add(new Player("BT", 10, "Ipswich"));
        player.add(new Player("BT", 10, "Ipswich"));
        player.add(new Player("BT", 10, "Ipswich"));
        player.add(new Player("BW", 10, "Suffolk"));
        player.add(new Player("BW", 5, "Suffolk"));
        player.add(new Player("BW", 5, "Suffolk"));
        player.add(new Player("WK", 10, "Suffolk"));
        player.add(new Player("AL", 10, "Suffolk"));
        player.add(new Player("BW", 10, "Suffolk"));
        player.add(new Player("BW", 10, "Suffolk"));
        player.add(new Player("BW", 10, "Suffolk"));
        player.add(new Player("BW", 10, "Suffolk"));
        player.add(new Player("BW", 10, "Suffolk"));
        player.add(new Player("BW", 10, "Suffolk"));
        return player;
    }

    public static void allPosiblities() {

    }

}
