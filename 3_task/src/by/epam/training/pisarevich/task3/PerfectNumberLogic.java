package by.epam.training.pisarevich.task3;

public class PerfectNumberLogic {
    public static boolean isPerfect(int num) {
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count = count + i;
            }

        }
        boolean result = false;
        if (num == count) {
            result = true;
        }
        return result;
    }

}
