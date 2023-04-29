// Дана последовательность из N целых чисел.
// Верно ли, что последовательность является возрастающей.

package org.hom2.task2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{-2, 0, 5, 6, 37, 40, 50};
        PrintArray(numbers);
        boolean flag = true;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > numbers[i+1]){
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Верно, последовательность является возрастающей.");
        } else {
            System.out.println("Не верно ли, последовательность не является возрастающей.");
        }
    }
    public static void PrintArray(int [] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b]\n");
    }
}
