package ru.geekbrains.main.site.at.collections.hashset;

import ru.geekbrains.main.site.at.collections.objects.Dog;

import java.util.HashSet;
import java.util.Set;

public class ContainsExample {
    public static void main(String[] args) {
        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog(123));
        dogs.add(new Dog(456));
        dogs.add(new Dog(345));
        dogs.add(new Dog(678));
        dogs.add(new Dog(148));

        System.out.println(dogs.contains(new Dog(456)));
        System.out.println(dogs.contains(new Dog(345)));
    }
}
