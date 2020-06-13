package ru.geekbrains.main.site.at.collections.arrayList;

import ru.geekbrains.main.site.at.collections.objects.Dog;

import java.util.ArrayList;
import java.util.List;

public class ContainsOfExample {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(123));
        dogs.add(new Dog(456));
        dogs.add(new Dog(345));
        dogs.add(new Dog(678));
        dogs.add(new Dog(148));

        System.out.println(dogs.indexOf(new Dog(456)));
        System.out.println(dogs.indexOf(new Dog(345)));
    }
}
