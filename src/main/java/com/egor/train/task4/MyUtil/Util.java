package com.egor.train.task4.MyUtil;
import java.util.Scanner;
public class Util {
    public static boolean isMonoComment(String s, int index) {
        return ((index < s.length() - 1) && (s.startsWith("//", index)));
    }
    public static boolean isMultiCommentStart(String s, int index) {
        return ((index < s.length() - 1) && (s.startsWith("/*", index)));
    }
    public static boolean isMultiCommentEnd(String s, int index) {
        return ((index < s.length() - 1) && (s.startsWith("*/", index)));
    }

    public static int skipComment(Scanner in, String s) {
        while (!s.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                if (isMultiCommentEnd(s, i))
                    return i + 1;
            }
            s = in.nextLine();
        }
        return 0;
    }
}

