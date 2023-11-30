package com.egor.train.task2.MyUtil;
import com.egor.train.task2.Pair;
public class Util {
    public static Pair<Double, Integer> UpSize(double size, int type) {
        while (size / 1024 >= 1) {
            size /= 1024;
            type++;
        }
        Pair<Double, Integer> result = new Pair<>();
        result.first = size;
        result.second = type;
        return result;
    }
}
