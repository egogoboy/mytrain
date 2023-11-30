package com.egor.train.task3;
import java.util.*;
import static com.egor.train.task3.MyUtil.Array.*;
public class MainTask3 {
    public static void main (String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        mas[0] = in.nextInt();
        for (int i = 1; i < n; i++)
            mas[i] = in.nextInt();
        Pair<Integer, Integer> max, min;
        max = maxElement(mas, 0, mas.length);
        min = minElement(mas, 0, mas.length);
        if ((min.second != 0) && (max.second != mas.length - 1)) {
            int temp = mas[0];
            mas[0] = mas[min.second];
            mas[min.second] = temp;
            if ((min.second != mas.length - 1) && (max.second != 0)) {
                temp = mas[mas.length - 1];
                mas[mas.length - 1] = mas[max.second];
                mas[max.second] = temp;
            }
        }
        System.out.print('[');
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + (i == mas.length - 1 ? "]" : ", "));
    }
}