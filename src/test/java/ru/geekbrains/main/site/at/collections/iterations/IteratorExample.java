package ru.geekbrains.main.site.at.collections.iterations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Том");
        cats.add("Барсик");
        cats.add("Бармоглот");

        System.out.println(cats);

        Iterator<String> iterator = cats.iterator();

        while (iterator.hasNext()){
            String cat = iterator.next();
            System.out.println(cat);
        }

        for (String cat:cats){
            System.out.println(cat);
        }
    }
}
