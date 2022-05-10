package org.SEVcustoms;

import java.util.Scanner;

public class DialogClass {
    public void dialogMethod() {
        Scanner scr = new Scanner(System.in);
        int command;
        while (true) {
            System.out.println("Выбирите команду: 1 - добавить пользователя, " +
                    "2 - распечатать список пользователей, " +
                    "3 - удалить пользователя, 0 - выход");
            command = scr.nextInt();
            if (command == 0) {
                System.out.println("Выход.");
                break;
            }
            if (command == 1) {
                UserList.setUserInformation();
            }
            if (command == 2) {
                UserList.getUserInformation();
            }
            if (command == 3) {
                UserList.delitUserInformation();
            }
            if (command == 4) {
                System.out.println("Команда в разработке...");
            }
        }
    }
}
