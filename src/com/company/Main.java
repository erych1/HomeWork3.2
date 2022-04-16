package com.company;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 имен для списка А");

        a.add(scanner.nextLine());
        a.add(scanner.nextLine());
        a.add(scanner.nextLine());
        a.add(scanner.nextLine());
        a.add(scanner.nextLine());

        System.out.println(a.toString());

        ArrayList<String> b = new ArrayList<>();

        System.out.println("Введите 5 имен для списка Б");
        System.out.println("-----------------------");

        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());

        System.out.println(a.toString());

        System.out.println("----------------------");

        ArrayList<String> c = new ArrayList<>();
        Collections.reverse(b);
        for (int i = 0; i < a.size(); i++) {
            c.add(a.get(i));
            c.add(b.get(i));

        }

        System.out.println(c);

        System.out.println("---------------------------");

        StringComparator stringComporator = new StringComparator();
        Collections.sort(c, stringComporator);
        System.out.println(c);
    }

}
