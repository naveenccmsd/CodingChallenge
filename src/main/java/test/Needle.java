package test;

import java.io.*;
import java.util.*;


public class Needle {
    public static int count(String needle, InputStream haystack) throws Exception {
        int res = 0;
        Scanner scanner = new Scanner(haystack);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            int fromIndex = 0, index = s.indexOf(needle, fromIndex);
            while (index >= 0) {
                res++;
                index = s.indexOf(needle, index + needle.length());
            }
        }
        scanner.close();
        return res;
    }

    public static void main(String[] args) throws Exception {
        String inMessage = "Hello, there!\nHow are you today?\nYes, you over theretherethe"
                + "\nrethere\n"
                + "there.";

        try (InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
            System.out.println(Needle.count("there", inStream));
        }
    }
}
