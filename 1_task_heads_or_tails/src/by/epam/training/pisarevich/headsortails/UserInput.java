package by.epam.training.pisarevich.headsortails;

import java.util.Scanner;

public class UserInput {
    public static int nextInt(){
        System.out.println("Введите количество подбрасываний");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
}
