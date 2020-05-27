package ru.geekbrains.main.site.at.obstacles;

public class Wall implements Obstacle {
    private float height;

    public int getType() {
        return TYPE_WALL;
    }

    public Wall(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }
}
