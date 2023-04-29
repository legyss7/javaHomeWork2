//Дан массив целых чисел. Заменить отрицательные элементы на
// сумму индексов двузначных элементов массива.
package org.hom2.task3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 6, 5, 34, 37, 0, 9, 10, 11, -20, -1};
        PrintArray(numbers);
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 9 && numbers[i] < 100
                    || numbers[i] < -9 && numbers[i] > -100) {
                sum += numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) numbers[i] = sum;
        }
        PrintArray(numbers);
    }

    public static void PrintArray(int [] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b]\n");
    }
}
