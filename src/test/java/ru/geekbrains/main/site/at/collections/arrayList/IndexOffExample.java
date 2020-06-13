package ru.geekbrains.main.site.at.collections.arrayList;

import ru.geekbrains.main.site.at.collections.objects.Dog;

import java.util.ArrayList;
import java.util.List;

public class IndexOffExample {
    public static void main(String[] args) {

//        List<String> cats = new ArrayList<>();
//        cats.add("Том");
//        cats.add("Барсик");
//        cats.add("Бармоглот");
//
//        System.out.println(cats.indexOf("Барсик"));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(123));
        dogs.add(new Dog(456));
        dogs.add(new Dog(345));
        dogs.add(new Dog(678));
        dogs.add(new Dog(148));

        System.out.println(dogs.indexOf(new Dog(456)));
    }
}
