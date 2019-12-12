package com.ccmsd.techgig;

import java.util.Collection;
import java.util.Stack;


public class SizedStack<T> extends Stack<T> {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    public final int maxSize;

    public SizedStack(int size) {
        super();
        this.maxSize = size;
    }

    public boolean isFull() {
        return this.size() >= maxSize;
    }

    @Override
    public T push(T object) {
        while (isFull()) {
            return null;
        }
        updateRecord(object.toString());
        return super.push(object);
    }

    private void updateRecord(String object) {
        switch (object) {
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

        return super.toString() + "SizedStack [maxSize=" + maxSize + ", bt=" + bt + ", bw=" + bw + ", wk=" + wk
                + ", al=" + al + "]";
    }

    @Override
    public synchronized boolean addAll(Collection<? extends T> c) {
        SizedStack<String> s = (SizedStack<String>) c;
        this.bt = s.bt;
        this.bw = s.bw;
        this.wk = s.wk;
        this.al = s.al;
        return super.addAll(c);

    }

    public int bt = 0;
    public int bw = 0;
    public int wk = 0;
    public int al = 0;
}
