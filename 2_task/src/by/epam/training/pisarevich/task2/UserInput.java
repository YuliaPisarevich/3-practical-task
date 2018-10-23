package by.epam.training.pisarevich.task2;

import java.util.Scanner;

public class UserInput {
    public static int nextInt(){
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
}
