package org.sopdu;

import java.util.Scanner;

public class Main {
    /*
    public static void main(String[] args) {
        /*
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("a = "+a);
         *//*
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        Scanner scanner = new Scanner(System.in);
        int operator = scanner.nextInt();
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int result;
        switch (operator){
            case 1:
                result = a+b;
                break;
            case 2:
                result = a-b;
                break;
            case 3:
                result = a*b;
                break;
            default:
                result = 0;
        }
        System.out.println("Результат: " + result);
    }
    */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте число");
        System.out.println("---------------");
        System.out.println("Введите число. Чем больше число, тем сложнее");
        int range = scanner.nextInt();
        int number = (int)(Math.random()*range);
        while (true){
            System.out.println("Угадайте число от 0 до "+range);
            int input_num = scanner.nextInt();
            if(input_num == number){
                System.out.println("Вы угадали!");
                break;
            } else if(input_num > number) {
                System.out.println("Загаданое число меньше");
            } else {
                System.out.println("Загаданое число больше");
            }
        }
        scanner.close();
    }
}
