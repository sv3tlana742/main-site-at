package ru.geekbrains.main.site.at.competitor;


import ru.geekbrains.main.site.at.obstacles.Treadmill;
import ru.geekbrains.main.site.at.obstacles.Wall;

public class Man implements Competitor {
    private String name = "Человек";
    private int skillRun;
    private float skillJump;

    public Man(int skillRun, float skillJump) {
        this.skillRun = skillRun;
        this.skillJump = skillJump;
    }

    public boolean run(Treadmill treadmill) {
        if (skillRun >= treadmill.getLength()) {
            System.out.println(name + " успешно пробежал " + treadmill.getLength());
            return true;
        } else {
            System.out.println(name + " не смог пробежать " + treadmill.getLength());
            return false;
        }
    }

    public boolean jump(Wall wall) {
        if (skillJump >= wall.getHeight()) {
            System.out.println(name + " успешно перепрыгнул " + wall.getHeight());
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть " + wall.getHeight());
            return false;
        }
    }

}
