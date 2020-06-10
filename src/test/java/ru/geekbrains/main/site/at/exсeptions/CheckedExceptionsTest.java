package ru.geekbrains.main.site.at.exсeptions;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionsTest {
    @Test
    void example() {
        File file = new File ("src\test\resources\txt1.txt");
        try {
            new Scanner(file);
            System.out.println("Блок new Scanner(file);");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Блок catch");
        }finally {
            System.out.println("Блок finally");
        }
        System.out.println("программа выполняется дальше");
    }
}

