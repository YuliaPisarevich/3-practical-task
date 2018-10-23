package by.epam.training.pisarevich.headsortails;

public class GameTest {
    public static void main(String[] args) {
        int numOfToss = UserInput.nextInt();
        int numOfHeads = GameLogic.countHeads(numOfToss);
        int numOfTails = GameLogic.countTails(numOfHeads,numOfToss);

        View.print("Орёл ", numOfHeads);
        View.print("Решка ", numOfTails);


    }
}
