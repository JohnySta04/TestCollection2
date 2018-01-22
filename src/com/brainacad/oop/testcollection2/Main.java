package com.brainacad.oop.testcollection2;

import java.util.Random;
import java.util.LinkedList;

public class Main {


    public static void main(String[] strings) {


        System.out.println("******************************************");
        System.out.println("Labwork 2.15.2");
        System.out.println("--------------------------------------------");

        LinkedList<String> list = new LinkedList<String>();

        int[] intArray = new int[10];

        for (int i = 0; i < 10; i++) {

            intArray[i] = 0;
        }

        Random randomGenerator = new Random();

        int index;
        int pos;

        for (int i = 0; i < 10; i++) {

            index = randomGenerator.nextInt(100) % 10;

            pos = index;

            if (intArray[pos] == 1) {

                for (int j = 0; j < 10; j++) {

                    if (j > 0) {
                        if (pos < 9) {
                            pos++;
                        } else {
                            pos = 0;
                        }
                    }

                    if (intArray[pos] == 0) {
                        break;
                    }
                }
            }
            ;

            intArray[pos] = 1;

            list.add("number_" + pos);
        }

        for (String s : list) {
            System.out.println(s);

        }

        System.out.println("******************************************");
    }
}
