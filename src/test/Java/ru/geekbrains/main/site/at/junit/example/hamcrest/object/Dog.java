package ru.geekbrains.main.site.at.junit.example.hamcrest.object;

public class Dog extends Animal{
    public Dog(String sound) {
        super(sound);
    }

    public String toString() {
        return this.sound;
    }
}
