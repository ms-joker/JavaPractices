package utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class MathUtility {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(int num1, int num2) {
        return num1 / num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static boolean isOdd(int num) {
        return (num % 2 != 0);
    }

    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static int min(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }

    public static double max(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static double min(double num1, double num2) {
        return (num1 < num2) ? num1 : num2;
    }

    public static int square(int num) {
        return num * num;
    }

    public static double square(double num) {
        return num * num;
    }

    public static int cube(int num) {
        return num * num * num;
    }

    public static double cube(double num) {
        return num * num * num;
    }

    public static boolean isPrime(int n) {
        int a = (int) Math.pow(n, 0.5);

        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;


    }

    public static ArrayList<Integer> primeFactors(int n) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                nums.add(i);
                n /= i;
            }

        }
        if (n>2) nums.add(n);
        return nums;


    }

}