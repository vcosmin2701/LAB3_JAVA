package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int minValue = 0;
        int maxValue = 100;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 25; i++){
            int randInt = ThreadLocalRandom.current().nextInt(minValue, maxValue);
            list.add(randInt);
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}