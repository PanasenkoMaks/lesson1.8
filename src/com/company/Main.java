package com.company;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        printIsLeapYear(2022);
        System.out.println("Task 2");
        printClientDeviceYear(2014);
        clientName(1);
        System.out.println();
        System.out.println("Task 3");
        int deliveryDistance = deliveryDistance(94);
        System.out.println("Срок доставки - " + deliveryDistance);
        System.out.println("Task 4");
        printDouble("ihkkjhjgghjhjj");
        System.out.println("Task 5");
        int [] arr = {5, 4, 3, 2, 1};
        printArray(arr);
    }
    public static void printIsLeapYear(int year) {
        boolean leapYear = isLeapYear(year);
        printIsLeapYearResult(year, leapYear);
    }
    private static boolean isLeapYear(int year){
        return year % 4 == 0 && (year % 400 == 0) && (year % 100 != 0);
    }
    private static void printIsLeapYearResult(int year, boolean leapYear){
        if (leapYear){
            System.out.println(year + " - високосный год");
        }
        else {
            System.out.println(year + "  - не високосный год");
        }
    }


    public static void printClientDeviceYear (int clientDeviceYear){
        if (clientDeviceYear < 2015){
            System.out.print("Установите облегченную версию приложения для ");
        }
        else {
            System.out.print("Установите версию приложения для ");
        }
}
   public static void clientName (int osName){
        if (osName == 0){
            System.out.print("IOS");
        }
        else {
            System.out.print("Android");
        }
    }
    public static int deliveryDistance (int distance){
        if (distance < 20){
            return 1;
        }
        else if (distance > 20 && distance < 60){
            return 2;
        }
        else{
            return 3;
        }
    }
    public static void printDouble (String doble){
        char[] d = doble.toCharArray();
        for (int i = 0; i < d.length - 1; i++)
            if (d[i] == d[i+1]){
                System.out.println("найден дубль - " + d[i]);
                break;
            }
    }
    public static void printArray(int [] args){
        for (int i = args.length - 1; i >= 0; i--){
            System.out.print(args[i]);
        }

    }
}
