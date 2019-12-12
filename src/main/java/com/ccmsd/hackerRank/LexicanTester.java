package com.ccmsd.hackerRank;

import java.util.*;
import java.io.*;


public class LexicanTester {
    // Sorting method
    public static void InsertionSort(ArrayList<String> List) {
        for (int i = 1; i < List.size(); i++) {
            String value = List.get(i);
            int j = i - 1;
            while (j >= 0 && value.compareTo(List.get(j)) < 0) {
                List.set(j + 1, List.get(j));
                j--;
            }
            List.set(j + 1, value);
        }
    }

    public static void main(String args[]) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Zzz");
        list.add("Aaa");
        list.add("bbb");
        FileWriter writer = new FileWriter("C:\\Users\\npalaninathan\\Desktop\\output.txt");
        try {
            String newLine = System.getProperty("line.separator");
            InsertionSort(list); // method to sort available text in the files
            for (String str : list) {
                writer.write(str + newLine);
            }
            writer.close();

        } catch (Exception e) {
            System.out.println("file not found");
        }
    }
}
