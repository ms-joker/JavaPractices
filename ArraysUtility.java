package utilities;

import JavaMain.day26_CustomMethodsPractice.FrequencyOfElement;

public class ArraysUtility {

    // print each element of the array.
    public static void printEach(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void printEach(double[] arr) {
        for (double i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void printEach(short[] arr) {
        for (short i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void printEach(byte[] arr) {
        for (byte i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void printEach(long[] arr) {
        for (long i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    // returns the maximum number (int, double, long) of the array.
    public static int max(int[] arr) {
        int m = arr[0];
        for (int i : arr) {
            if (i > m) m = i;
        }
        return m;
    }

    public static double max(double[] arr) {
        double m = arr[0];
        for (double i : arr) {
            if (i > m) m = i;
        }
        return m;
    }

    public static long max(long[] arr) {
        long m = arr[0];
        for (long i : arr) {
            if (i > m) m = i;
        }
        return m;
    }

    // returns the minimum number (int, double, long) of the array.
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
        }
        return min;
    }

    public static double min(double[] arr) {
        double min = arr[0];
        for (double i : arr) {
            if (i < min) min = i;
        }
        return min;
    }

    public static long min(long[] arr) {
        long min = arr[0];
        for (long i : arr) {
            if (i < min) min = i;
        }
        return min;
    }

    // returns if the array contains the element.
    public static boolean contains(int[] arr, int n) {
        boolean result = false;
        for (int i : arr) {
            if (i == n) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean contains(double[] arr, double n) {
        boolean result = false;
        for (double i : arr) {
            if (i == n) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean contains(long[] arr, long n) {
        boolean result = false;
        for (long i : arr) {
            if (i == n) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean contains(String[] arr, String s) {
        boolean result = false;
        for (String i : arr) {
            if (i.equalsIgnoreCase(s)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean contains(char[] arr, char c) {
        boolean result = false;
        for (char i : arr) {
            if (i == c) {
                result = true;
                break;
            }
        }
        return result;
    }

    // returns an array after add the new element to the array.
    public static int[] addElement(int[] arr, int n) {
        int[] newArr = new int[arr.length + 1];
        int i = 0;
        for (int a : arr) {
            newArr[i++] = a;
        }
        newArr[i] = n;
        return newArr;
    }

    public static long[] addElement(long[] arr, long n) {
        long[] newArr = new long[arr.length + 1];
        int i = 0;
        for (long a : arr) {
            newArr[i++] = a;
        }
        newArr[i] = n;
        return newArr;
    }

    public static double[] addElement(double[] arr, double n) {
        double[] newArr = new double[arr.length + 1];
        int i = 0;
        for (double a : arr) {
            newArr[i++] = a;
        }
        newArr[i] = n;
        return newArr;
    }

    public static String[] addElement(String[] arr, String s) {
        String[] newArr = new String[arr.length + 1];
        int i = 0;
        for (String a : arr) {
            newArr[i++] = a;
        }
        newArr[i] = s;
        return newArr;
    }

    public static char[] addElement(char[] arr, char n) {
        char[] newArr = new char[arr.length + 1];
        int i = 0;
        for (char a : arr) {
            newArr[i++] = a;
        }
        newArr[i] = n;
        return newArr;
    }

    // returns unique elements from the array as a new array.
    public static int[] uniqueElements(int[] arr) {
        int[] result = {};
        for (int i : arr) {
            if (FrequencyOfElement.frequency(arr, i) == 1) result = addElement(result, i);
        }
        return result;
    }

    public static double[] uniqueElements(double[] arr) {
        double[] result = {};
        for (double i : arr) {
            if (FrequencyOfElement.frequency(arr, i) == 1) result = addElement(result, i);
        }
        return result;
    }

    public static String[] uniqueElements(String[] arr) {
        String[] result = {};
        for (String i : arr) {
            if (FrequencyOfElement.frequency(arr, i) == 1) result = addElement(result, i);
        }
        return result;
    }

    public static char[] uniqueElements(char[] arr) {
        char[] result = {};
        for (char i : arr) {
            if (FrequencyOfElement.frequency(arr, i) == 1) result = addElement(result, i);
        }
        return result;
    }

    // returns an array after remove the element at the given index position.
    public static int[] removeElement(int[] arr, int index) {
        int[] result = {};
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            result = addElement(result, arr[i]);
        }
        return result;
    }

    public static double[] removeElement(double[] arr, int index) {
        double[] result = {};
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            result = addElement(result, arr[i]);
        }
        return result;
    }

    public static String[] removeElement(String[] arr, int index) {
        String[] result = {};
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            result = addElement(result, arr[i]);
        }
        return result;
    }

    public static char[] removeElement(char[] arr, int index) {
        char[] result = {};
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            result = addElement(result, arr[i]);
        }
        return result;
    }

    // returns an array after deleting the given element.
    public static int[] deleteElement(int[] arr, int n) {
        int[] result = {};
        int count = 0;
        if (!contains(arr, n)) {
            System.err.println("This element is not in the array!");
            System.exit(0);
        } else {


            for (int i : arr) {
                if (i == n) {
                    count++;
                    continue;
                }
                result = addElement(result, i);
            }
        }
        System.out.println("Deleted " + count + " time(s).");
        return result;
    }

    public static double[] deleteElement(double[] arr, double n) {
        double[] result = {};
        int count = 0;
        if (!contains(arr, n)) {
            System.err.println("This element is not in the array!");
            System.exit(0);
        } else {


            for (double i : arr) {
                if (i == n) {
                    count++;
                    continue;
                }
                result = addElement(result, i);
            }
        }
        System.out.println("Deleted " + count + " time(s).");
        return result;
    }

    public static String[] deleteElement(String[] arr, String s) {
        String[] result = {};
        int count = 0;
        if (!contains(arr, s)) {
            System.err.println("This element is not in the array!");
            System.exit(0);
        } else {


            for (String i : arr) {
                if (i.equalsIgnoreCase(s)) {
                    count++;
                    continue;
                }
                result = addElement(result, i);
            }
        }
        System.out.println("Deleted " + count + " time(s).");
        return result;
    }

    //returns an array after remove all duplicated element.
    public static int[] removeDuplicate(int[] arr) {
        int[] result = {};
        for (int i : arr) {
            if (!contains(result, i)) {
                result = addElement(result, i);
            }
        }
        return result;
    }

    public static double[] removeDuplicate(double[] arr) {
        double[] result = {};
        for (double i : arr) {
            if (!contains(result, i)) {
                result = addElement(result, i);
            }
        }
        return result;
    }

    public static char[] removeDuplicate(char[] arr) {
        char[] result = {};
        for (char i : arr) {
            if (!contains(result, i)) {
                result = addElement(result, i);
            }
        }
        return result;
    }

    public static String[] removeDuplicate(String[] arr) {
        String[] result = {};
        for (String s : arr) {
            if (!contains(result, s)) {
                result = addElement(result, s);
            }
        }
        return result;
    }

    // returns an array after replacing the element at the given index to the
    public static int[] replace(int[] arr, int index, int newElement) {
        arr[index] = newElement;
        return arr;
    }

    // returns an array after replacing all the oldElement with newElement.
    public static int[] replaceAll(int[] arr, int oldElement, int newElement) {
        if (!contains(arr, oldElement)) {
            System.err.println("The array does not contain the element: " + oldElement);
            System.exit(0);
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == oldElement) {
                    arr[i] = newElement;
                }
            }
        }
        return arr;
    }
    public static String[] replaceAll(String[] arr, String oldElement, String newElement) {
        if (!contains(arr, oldElement)) {
            System.err.println("The array does not contain the element: " + oldElement);
            System.exit(0);
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equalsIgnoreCase(oldElement)) {
                    arr[i] = newElement;
                }
            }
        }
        return arr;
    }

    //insert given element n into the array at the index.
    public static int[] insert(int[] arr, int index, int n){
        int[] result = {};
        for (int i=0; i<index; i++){
            result = addElement(result,arr[i]);
        }
        result = addElement(result,n);
        for (int i=index; i<arr.length; i++){
            result = addElement(result,arr[i]);
        }
        return result;
    }
    public static double[] insert(double[] arr, int index, double n){
        double[] result = {};
        for (int i=0; i<index; i++){
            result = addElement(result,arr[i]);
        }
        result = addElement(result,n);
        for (int i=index; i<arr.length; i++){
            result = addElement(result,arr[i]);
        }
        return result;
    }
    public static char[] insert(char[] arr, int index, char c){
        char[] result = {};
        for (int i=0; i<index; i++){
            result = addElement(result,arr[i]);
        }
        result = addElement(result,c);
        for (int i=index; i<arr.length; i++){
            result = addElement(result,arr[i]);
        }
        return result;
    }
    public static String[] insert(String[] arr, int index, String s){
        String[] result = {};
        for (int i=0; i<index; i++){
            result = addElement(result,arr[i]);
        }
        result = addElement(result,s);
        for (int i=index; i<arr.length; i++){
            result = addElement(result,arr[i]);
        }
        return result;
    }

    // swap the element at index1 with the element at index2;
    public static int[] swap(int[] arr, int index1, int index2){
        int[] result = {};
        if (index1>index2){
            int tmp = index1;
            index1 = index2;
            index2 = tmp;
        }
        for (int i=0; i<index1; i++){
            result = addElement(result, arr[i]);
        }
        result = addElement(result, arr[index2]);
        for (int i=index1+1; i<index2; i++){
            result = addElement(result, arr[i]);
        }
        result = addElement(result, arr[index1]);
        for (int i=index2+1; i<arr.length; i++){
            result = addElement(result, arr[i]);
        }
        return result;
    }

}
