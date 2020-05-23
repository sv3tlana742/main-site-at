package lesson_1.obstacles;

public class Treadmill implements Obstacle {
    private int length;

    public int getType() {
        return Obstacle.TYPE_TREADMILL;
    }

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
