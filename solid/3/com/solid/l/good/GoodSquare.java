package com.solid.l.good;

public class GoodSquare implements Shape {
    private int side;

    public GoodSquare(int side) {
        this.side=side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return this.side*this.side;
    }

    @Override
    public String toString() {
        return "I am a square";
    }
}
