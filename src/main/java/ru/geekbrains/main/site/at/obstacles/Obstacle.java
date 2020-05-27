package ru.geekbrains.main.site.at.obstacles;

public interface Obstacle {
    int TYPE_TREADMILL = 1;
    int TYPE_WALL = 2;

    int getType();
}
