package util;

public class Pair<T1, T2> {

    private int a, b;

    public Pair(int a, int b) {
        this.a = a;
        this.a = b;
    }

    public Integer getKey() {
        return this.a;
    }

    public Integer getValue() {
        return this.b;
    }

}
