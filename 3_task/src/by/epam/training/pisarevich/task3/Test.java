package by.epam.training.pisarevich.task3;

public class Test {
    public static void main(String[] args) {
        int num = UserInput.nextInt();
        View.print("Число является совершенным ",PerfectNumberLogic.isPerfect(num));

    }
}
