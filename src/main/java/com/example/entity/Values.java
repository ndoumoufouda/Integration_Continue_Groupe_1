package com.example.entity;

public class Values {

    private float x;
    private float y;

    public Values(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Values() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Values{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
