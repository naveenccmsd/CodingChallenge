package test;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;


public class Entry {

    Queue<String> queue = new LinkedList<>();

    public void enter(String passportNumber) {
        queue.add(passportNumber);
    }

    public String leave() {
        try {
            return queue.remove();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Entry entry = new Entry();
        entry.enter("AB54321");
        entry.enter("UK32032");
        System.out.println(entry.leave());
        System.out.println(entry.leave());
        System.out.println(entry.leave());
    }
}
