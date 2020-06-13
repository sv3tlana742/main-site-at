package ru.geekbrains.main.site.at.collections.hw_7.task_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainPhoneBook {

    private Map <String, Set<String>> entries;

    public MainPhoneBook() {
        this.entries = new HashMap<>();
    }

    public void add (String surname, String phone){
        Set<String> entry = entries.getOrDefault(surname, new HashSet<>());
        entry.add(phone);
        entries.put(surname, entry);
    }

    public Set<String> get(String surname){
        return entries.get(surname);
    }
}
