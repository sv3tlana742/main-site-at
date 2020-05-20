package lesson_1;

class Treadmill implements Obstacle {
    private int length;

    public int getType() {
        return Obstacle.TYPE_TREADMILL;
    }

    Treadmill (int length) {
        this.length = length;
    }

    int getLength() {
        return length;
    }
}
