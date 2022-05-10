package org.SEVcustoms;

import java.util.ArrayList;
import java.util.Scanner;

public class UserList {
    static ArrayList<String> userNameList = new ArrayList<>();
    static ArrayList<Integer> userAgeList = new ArrayList<>();
    private static String name;
    private static String surname;
    private static int age;

    public static void setUserInformation(){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите фамилию пользователя:");
        name = scaner.nextLine();
        System.out.println("Введите имя пользователя:");
        surname = scaner.next();
        while (true){
            System.out.println("Введите возраст пользователя:");
            age = scaner.nextInt();
            if (age >= 0 && age <=101){
                break;
            } else System.out.println("введено неверное значение возраста пользователя");
        }
        userNameList.add(name + " " + surname);
        userAgeList.add(age);
    }
    public static void getUserInformation(){
        for (int i = 0; i < userAgeList.size(); i++) {
            System.out.println((i + 1) + " " + userNameList.get(i) + " " + userAgeList.get(i));

        }
    }
    public static void delitUserInformation(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер пользователя, подлежащего удалению:");
            int number = scanner.nextInt();
            if (number < 1 || number > userNameList.size()) {
                System.out.println("Введен неверный номер пользователя");
            } else {
                userNameList.remove(number - 1);
                userAgeList.remove(number - 1);
                break;
            }
        }
    }
}
