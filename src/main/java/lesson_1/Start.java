package lesson_1;

import lesson_1.competitor.Cat;
import lesson_1.competitor.Competitor;
import lesson_1.competitor.Man;
import lesson_1.competitor.Robot;
import lesson_1.obstacles.Obstacle;
import lesson_1.obstacles.Treadmill;
import lesson_1.obstacles.Wall;

public class Start {
    public static void main(String[] args) {
        System.out.println("*** Task 2 ***");

        Man man = new Man(850, 0.5f);
        Cat cat = new Cat(500, 2);
        Robot robot = new Robot(1000,0.1f);
        Treadmill treadmill = new Treadmill(800);
        Wall wall = new Wall(2);

        man.run(treadmill);
        man.jump(wall);

        cat.run(treadmill);
        cat.jump(wall);

        robot.run(treadmill);
        robot.jump(wall);

        System.out.println("*** Task 3 ***");

        Competitor[] competitors = {man, cat, robot};
        Obstacle[] obstacles = {
            new Wall(0.3f),
            new Treadmill(400),
            new Wall(1),
            new Treadmill(800),
            new Wall(3),
            new Treadmill(1200),
        };

        for (Competitor competitor: competitors) {
            for (Obstacle obstacle: obstacles) {
                if (obstacle.getType() == Obstacle.TYPE_WALL) {
                    if (!competitor.jump((Wall) obstacle)) {
                        break;
                    }
                } else { //Obstacle.TYPE_TREADMILL
                    if (!competitor.run((Treadmill) obstacle)) {
                        break;
                    }
                }
            }
        }
    }

}
