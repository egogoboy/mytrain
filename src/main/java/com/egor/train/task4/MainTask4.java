package com.egor.train.task4;

import static com.egor.train.task4.MyUtil.Util.*;
import java.util.*;

public class MainTask4 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.nextLine();
            while (!s.isEmpty()) {
                for (int i = 0; i < s.length(); i++) {
                    if (isMonoComment(s, i)) {
                        break;
                    }
                    else if (isMultiCommentStart(s, i)) {
                        i = skipComment(in, s);
                    }
                    else System.out.print(s.charAt(i));
                }
                s = in.nextLine();
                System.out.print("\n");
            }
        }
    }
}