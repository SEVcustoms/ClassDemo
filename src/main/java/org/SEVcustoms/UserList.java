package org.SEVcustoms;

import java.util.ArrayList;
import java.util.Scanner;

public class UserList {
    private static ArrayList<String> userNameList = new ArrayList<>();
    private static ArrayList<Integer> userAgeList = new ArrayList<>();
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
    public static void replaceUserInfomation(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер пользователя, чью позицию хотите поменять");
            int numberOfChande = scanner.nextInt();
            if (numberOfChande < 1 || numberOfChande > userNameList.size()) {
                System.out.println("Введен неверный номер пользователя");
            }
            System.out.println("Введите номер пользователя, на чью позицию хотите поменять");
            int numberToChande = scanner.nextInt();
            if (numberToChande < 1 || numberToChande > userNameList.size()) {
                System.out.println("Введен неверный номер пользователя");
            } else {
                String chandgeUserName = userNameList.get(numberOfChande - 1);
                int chandgeUserAge = userAgeList.get(numberOfChande - 1);
                userNameList.set(numberOfChande - 1, userNameList.get(numberToChande - 1));
                userAgeList.set(numberOfChande - 1, userAgeList.get(numberToChande - 1));
                userNameList.set(numberToChande - 1, chandgeUserName);
                userAgeList.set(numberToChande - 1, chandgeUserAge);
                UserList.getUserInformation();
                break;
            }
        }
    }
}
