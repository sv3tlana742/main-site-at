package ru.geekbrains.main.site.at.collections.objects;

public class Start {
    public static void main(String[] args){
        Dog dog1 = new Dog(123456);
        Dog dog2 = new Dog(123456);

        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
    }
}

