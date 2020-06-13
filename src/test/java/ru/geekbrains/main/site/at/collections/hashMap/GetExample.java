package ru.geekbrains.main.site.at.collections.hashMap;

import ru.geekbrains.main.site.at.collections.objects.Dog;
import ru.geekbrains.main.site.at.collections.objects.Human;

import java.util.HashMap;
import java.util.Map;

public class GetExample {
    public static void main(String[] args) {
        Map<Human, Dog> dogs = new HashMap<>();

        dogs.put(
                new Human("Olga"),
                new Dog(123456));

        dogs.put(
                new Human("Ivan"),
                new Dog(456789));

        dogs.put(
                new Human("Fedor"),
                new Dog(1987654));

        System.out.println(dogs.get(new Human("Olga")));
        System.out.println(dogs.keySet());
        System.out.println(dogs.values());
    }
}
