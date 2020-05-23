package lesson_1.obstacles;

public class Wall implements Obstacle {
    private float height;

    public int getType() {
        return Obstacle.TYPE_WALL;
    }

    public Wall(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }
}
