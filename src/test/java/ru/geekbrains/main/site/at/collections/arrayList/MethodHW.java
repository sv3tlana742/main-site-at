package ru.geekbrains.main.site.at.collections.arrayList;


//listUtils.union

import java.util.ArrayList;
import java.util.Collections;

public class MethodHW {
        public static void main(String[] args) {

            ArrayList<String> word = new ArrayList<>();
            word.add("Апельсин");
            word.add("Воробей");
            word.add("Балет");
            word.add("Дом");
            word.add("Гном");
            word.add("Балет");
            word.add("Дом");
            word.add("Дом");

            System.out.println(word);

//            ensureCapacity
            word.ensureCapacity(20);

//            set
            word.set(0,"Абрикос");
            System.out.println(word);

//            trimToSize
            word.trimToSize();

//            Collections.frequency
            System.out.println(Collections.frequency(word, "Дом"));

//            Collections.sort
            Collections.sort(word);
            System.out.println(word);


//              clear
//            word.clear();
//            System.out.println(word);

//              toArray
//            String[] arr = new String[word.size()];
//            word.toArray(arr);
//
//            System.out.println(word);
        }
}
