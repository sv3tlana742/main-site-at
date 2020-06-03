package ru.geekbrains.main.site.at.junit.example.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssertThrowsExample {

    @Test
    void example() {
        File file = new File ("src\test\resources\txt1.txt");


        Assertions.assertThrows(FileNotFoundException.class,
                () -> new Scanner(file));
    }
}
