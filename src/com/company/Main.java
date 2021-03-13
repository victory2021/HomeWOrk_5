package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("input element for num1:");


        ArrayList<String> num1 = new ArrayList<>();
        while (num1.size() < 5){
            Scanner scanner = new Scanner(System.in);
            String s1 = scanner.nextLine();
            num1.add(s1);
        }
        printInfo(num1);
        System.out.println("input element for num 2:");

        ArrayList<String> num2 = new ArrayList<>();
        while (num2.size() < 5){
            Scanner scanne = new Scanner(System.in);
            num2.add(scanne.nextLine());
        }
        printInfo(num2);
        ArrayList<String> num3 = new ArrayList<>();
        Collections.reverse(num2);

        Iterator<String> iterator = num2.iterator();
        while (iterator.hasNext()) {
            Iterator<String> iterator1 = num1.iterator();
            while (iterator1.hasNext()){
                num3.add(iterator1.next());
                iterator1.remove();
                break;
            }
            num3.add(iterator.next());
        }
        System.out.println(num3);
        System.out.println("num3 is sorted: ");
        num3.sort(Comparator.comparing((String::length)));
        System.out.println(num3);


    }
    public static void printInfo(ArrayList<?> arrayList){
        Iterator<?> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

