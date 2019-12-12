package test;

import java.util.Scanner;


public class GameOfThrones {

    public int winsPossibilitiesCounter(int p, int r) {

        int totalPossibilities = fight(p, 0, 0, p, r);
        return totalPossibilities % (10 ^ 9 + 7);
    }

    public int fight(int aryaWins, int sansaWins, int possibilities, final int p, final int r) {

        if (aryaWins < sansaWins * p) {
            return possibilities;
        }

        if (aryaWins + sansaWins == r) {
            possibilities += 1;
            return possibilities;
        }
        return fight(aryaWins + 1, sansaWins, possibilities, p, r)
                + fight(aryaWins, sansaWins + 1, possibilities, p, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            int p = sc.nextInt();
            System.out.println(new GameOfThrones().winsPossibilitiesCounter(p, r));
        }
        sc.close();
    }
}
