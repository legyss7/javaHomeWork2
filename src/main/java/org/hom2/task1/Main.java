//Дана последовательность N целых чисел. Найти сумму простых чисел.

package org.hom2.task1;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 6, 5, 34, 37, 0, 9, 10, 11, -20, -1};
        PrintArray(numbers);
        int sum = 0;
        int j;
        boolean flag;
        int numberAbs;
        for (int i = 0; i < numbers.length; i++) {
            j = 2;
            flag = true;
            numberAbs = Math.abs(numbers[i]);
            while (j <= Math.sqrt(numberAbs)) {
                if(numberAbs % j == 0) {
                    flag = false;
                    break;
                }
                j += 1;
            }
            if(flag){
                flag = true;
                sum += numbers[i];
            }
        }
        System.out.println("sum = " + sum);
    }
    public static void PrintArray(int [] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b]\n");
    }
}