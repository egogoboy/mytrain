package com.egor.train.task3.MyUtil;
import com.egor.train.task3.Pair;
public class Array {
    public static Pair<Integer, Integer> maxElement(int[] mas, int begin, int end) {
        Pair<Integer, Integer> result = new Pair<>();
        result.first = mas[begin];
        result.second = begin;
        for (int i = begin; i < end; i++) {
            if (mas[i] > result.first) {
                result.first = mas[i];
                result.second = i;
            }
        }
        return result;
    }
    public static Pair<Integer, Integer> minElement(int[] mas, int begin, int end) {
        Pair<Integer, Integer> result = new Pair<>();
        result.first = mas[begin];
        result.second = begin;
        for (int i = begin; i < end; i++) {
            if (mas[i] < result.first) {
                result.first = mas[i];
                result.second = i;
            }
        }
        return result;
    }
}
