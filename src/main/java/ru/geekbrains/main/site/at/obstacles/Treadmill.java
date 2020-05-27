package ru.geekbrains.main.site.at.obstacles;

public class Treadmill implements Obstacle {
    private int length;

    public int getType() {
        return TYPE_TREADMILL;
    }

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
