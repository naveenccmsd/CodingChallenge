package com.ccmsd.nielson;


class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class FourSquare {

    public static void main(String args[]) {
        Point p1 = new Point(20, 10);
        Point p2 = new Point(10, 20);
        Point p3 = new Point(20, 20);
        Point p4 = new Point(10, 10);

        System.out.println(isSquare(p1, p2, p3, p4));
    }

    private static boolean isSquare(Point p1, Point p2, Point p3, Point p4) {

        
        int distance12 = squareDist(p1, p2);
        int distance13 = squareDist(p1, p3);
        int distance14 = squareDist(p1, p4);
//        a = 2*d 
        if (distance12 == distance13 && 2 * distance12 == distance14) {
            int dist = squareDist(p2, p4);
            return (dist == squareDist(p3, p4) && dist == distance12);
        }
        if (distance13 == distance14 && 2 * distance13 == distance12) {
            int dist = squareDist(p2, p3);
            return (dist == squareDist(p2, p4) && dist == distance13);
        }
        if (distance12 == distance14 && 2 * distance12 == distance13) {
            int dist = squareDist(p2, p3);
            return (dist == squareDist(p3, p4) && dist == distance12);
        }
        return false;
    }

    private static int squareDist(Point p, Point q) {
        return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y);
    }
}
