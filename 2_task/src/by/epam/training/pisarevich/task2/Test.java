package by.epam.training.pisarevich.task2;

public class Test {
    public static void main(String[] args) {
        int num1 = UserInput.nextInt();

        System.out.println("Максимальная цифра " + MathLogic.calcGreatestDigit(num1));
        System.out.println("Палидром " + MathLogic.isPalindrome(num1));
        System.out.println("Простое число " + MathLogic.isPrimeNumber(num1));
        System.out.println("Все простые делители " + MathLogic.calcPrimeDiv(num1));

        int num2 = UserInput.nextInt();

        System.out.println("НОД " + MathLogic.findGcd(num1,num2));
        System.out.println("НОК " + MathLogic.findLcm(num1,num2));

    }
}
