package lesson_1.competitor;

import lesson_1.obstacles.Treadmill;
import lesson_1.obstacles.Wall;

public interface Competitor {
    boolean run(Treadmill treadmill);
    boolean jump(Wall wall);
}
