package test;

import java.util.*;


public class CandidateCode_max {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String typePeople = sc.nextLine();
            System.out.println(maxTypes(typePeople));
        }
        sc.close();
    }

    static String alphabet = "0abcdefghijklmnopqrstuvwxyz";

    private static char maxTypes(String typePeople) {
        int map[] = new int[27];
//        System.out.println(typePeople);
        for (int i = 0; i < typePeople.length(); i++) {
            int index = alphabet.indexOf(typePeople.charAt(i));
            map[index] = map[index] + 1;
        }
        int max = 0, maxIndex = 0;
        for (int i = 0; i < map.length; i++) {
            if (max < map[i]) {
                max = map[i];
                maxIndex = i;
            }
        }
//        System.out.println(Arrays.toString(map));
//        System.out.println(maxIndex);
        return alphabet.charAt(maxIndex);
    }

}
