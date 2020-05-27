package ru.geekbrains.main.site.at.competitor;

import ru.geekbrains.main.site.at.obstacles.Treadmill;
import ru.geekbrains.main.site.at.obstacles.Wall;

public interface Competitor {
    boolean run(Treadmill treadmill);
    boolean jump(Wall wall);
}
