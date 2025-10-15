package com.springcore.ref;

public class B {
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int y;

    public B(int y) {
        this.y = y;
    }

    public B() {
        super();
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }
}
