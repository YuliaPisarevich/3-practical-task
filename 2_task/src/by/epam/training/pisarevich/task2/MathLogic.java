package by.epam.training.pisarevich.task2;

public class MathLogic {
    //Наибольшая цифра натурального числа
    public static int calcGreatestDigit(int num) {
        String numStr = num + "";
        int len = numStr.length();
        int max = -1;
        int digit;

        for (int i = 0; i < len; i++) {
            digit = num % 10;
            num /= 10;
            if (max < digit) {
                max = digit;
            }
        }
        return max;
    }
    //Является ли число палидромом
    public static boolean isPalindrome(int num) {
        String numStr = num + "";
        int len = numStr.length();
        int n = 0;
        boolean result = false;
        for (int i = 0; i < len / 2; i++) {
            if (numStr.charAt(i) == numStr.charAt(len - (i + 1))) {
                n = n + 1;
            }
            if (n == len / 2) {
                result = true;
            }
        }
        return result;
    }
    //Является ли заданное число простым
    public static boolean isPrimeNumber(int num) {
        boolean result = false;
        int n = 0;
        if (num == 2) {
            result = true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i != 0) {
                n = n + 1;
            }
            if (n + 2 == num) {
                result = true;
            }
        }
        return result;
    }
    //Найти все простые делители
    public static String calcPrimeDiv(int num) {
        String str = "";
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && isPrimeNumber(i)) {
                str = str + " " + i;
            }

        }
        return str;
    }
    //НОД
    public static int findGcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
    //НОК
    public static int findLcm(int a, int b) {
        return a * b / findGcd(a, b);
    }
//неправильно
//    public static int calcDiffDigits(int num){
//        String numStr = num + "";
//        int n = 0;
//        for (int i = 0; i < numStr.length(); i++) {
//            for (int j = 1 + i; j < numStr.length(); j++) {
//                if (numStr.charAt(i) == numStr.charAt(j) && i != j) {
//                    n++;
//                    break;
//                }
//            }
//        }
//        return numStr.length() - n;
//    }
}
