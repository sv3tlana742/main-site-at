package ru.geekbrains.main.site.at.collections.hw_7;

import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args) {

        String[] words = {"Апельсин", "Воробей", "Море", "Балет", "Дом", "Гном",
                         "Воробей", "Балет", "Дом", "Воробей", "Дом", "Соль", "Море"};
       Map<String,Integer> wordsMap = new HashMap<>();
       for (String word: words){
           wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
       }
       System.out.println(wordsMap.keySet());
        System.out.println(wordsMap);
    }
}
