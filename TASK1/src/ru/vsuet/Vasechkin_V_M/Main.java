package ru.vsuet.Vasechkin_V_M;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrFirst = {1, 2, 3, 4, 4, 5, 6, 77, 8, 91, 3, 9};
        int[] arrAgree = {4, 91, 2};
        int[] arrEnd = new int[20];
        int counterForAnswer = 0;
        boolean flag = true;
        for (int k : arrFirst) {
            for (int i : arrAgree) {
                if (k == i) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arrEnd[counterForAnswer] = k;
                counterForAnswer++;
            }
            flag = true;
        }
        arrEnd = Arrays.copyOf(arrEnd, counterForAnswer);
        System.out.println(Arrays.toString(arrEnd));
    }
}