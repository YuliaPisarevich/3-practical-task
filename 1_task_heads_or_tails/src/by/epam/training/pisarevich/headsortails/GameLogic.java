package by.epam.training.pisarevich.headsortails;

import java.util.Random;

public class GameLogic {
    public static int countHeads(int numOfToss) {

        Random random = new Random();
        int x;
        int heads = 0;

        for (int i = 1; i <= numOfToss; i++) {
            x = random.nextInt(2);

            if (x == 1) {
                heads = heads + 1;
            }

        }
        return heads;
    }

    public static int countTails(int numOfHeads, int numOfToss){
        return numOfToss - numOfHeads;
    }
}
