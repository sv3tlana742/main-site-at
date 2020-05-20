package lesson_1;

class Wall implements Obstacle {
    private float height;

    public int getType() {
        return Obstacle.TYPE_WALL;
    }

    Wall (float height) {
        this.height = height;
    }

    float getHeight() {
        return height;
    }
}
