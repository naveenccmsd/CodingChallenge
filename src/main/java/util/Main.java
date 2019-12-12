package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class Main {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(isCordSquare(line));
        }
    }

    private static boolean isCordSquare(String line) {
        String[] cords = line.split("\\),");
        return isSqurae(new Cord(cords[0]), new Cord(cords[1]), new Cord(cords[2]), new Cord(cords[3]));
    }

    public static boolean isSqurae(Cord c1, Cord c2, Cord c3, Cord c4) {
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        int d1 = distanceSquare(c1, c2);
        int d2 = distanceSquare(c1, c3);
        int d3 = distanceSquare(c1, c4);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        if (d1 == d2) {
            if (d1 + d2 == d3) {
                return true;
            }
        } else if (d1 == d3) {
            if (d1 + d3 == d2) {
                return true;
            }
        } else if (d2 == d3) {
            if (d2 + d3 == d1) {
                return true;
            }
        }
        return false;
    }

    private static int distanceSquare(Cord c1, Cord c2) {
        return (c1.x - c2.x) * (c1.x - c2.x) + (c1.y - c2.y) * (c1.y - c2.y);
    }
}

class Cord {

    int x, y;

    Cord(String str) {
        str = str.replaceAll("\\(", "").replaceAll("\\)", "");
        String[] ints = str.split(",");
        this.x = Integer.parseInt(ints[0].trim());
        this.y = Integer.parseInt(ints[1].trim());
    }

    @Override
    public String toString() {
        return "Cord [x=" + x + ", y=" + y + "]";
    }

}
