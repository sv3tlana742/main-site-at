package ru.geekbrains.main.site.at.collections.hw_7.task_2;

public class PhoneBook extends MainPhoneBook {
    public static void main(String[] args) {

        MainPhoneBook phoneBook = new MainPhoneBook();

        phoneBook.add("Иванов", "897654343");
        phoneBook.add("Иванов", "123456789");
        phoneBook.add("Петров", "345674343");
        phoneBook.add("Васечкин", "905674787");
        phoneBook.add("Васечкин", "176674787");

        System.out.println(phoneBook.get("Иванов"));
    }
}
