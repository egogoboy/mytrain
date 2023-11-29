package com.egor.train.task3;
import java.util.*;

public class MainTask3 {
    static class element {
        int index;
        int value;
    }
    public static void main (String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        mas[0] = in.nextInt();
        element max = new element(), min = new element();
        max.index = 0; min.index = 0;
        max.value = mas[0]; min.value = mas[0];
        for (int i = 1; i < n; i++) {
            mas[i] = in.nextInt();
            if (mas[i] > max.value) {
                max.value = mas[i];
                max.index = i;
            }
            else if (mas[i] < min.value) {
                min.value = mas[i];
                min.index = i;
            }
        }
        if ((min.index != 0) && (max.index != mas.length - 1)) {
            int temp = mas[0];
            mas[0] = mas[min.index];
            mas[min.index] = temp;
            if ((min.index != mas.length - 1) && (max.index != 0)) {
                temp = mas[mas.length - 1];
                mas[mas.length - 1] = mas[max.index];
                mas[max.index] = temp;
            }
        }
        System.out.print('[');
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + (i == mas.length - 1 ? "]" : ", "));
    }
}