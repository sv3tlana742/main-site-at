package ru.geekbrains.main.site.at.exсeptions;

public class StackOverflowErrorExample {
    public static void main (String[] args) {
        example ();
    }

    private static int example() {
        return example();
    }
}
