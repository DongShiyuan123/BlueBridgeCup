package org.lanqiao.algo.elementary._05str;

import java.util.Scanner;

/**
 * @author Dong
 * @time 2020-04-21 5:29
 */
public class Hiho1485 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] w = str.toCharArray();
        sovel(w);
    }

    private static void sovel(char[] w) {
        int min = Integer.MAX_VALUE;
        int j = -1;
        for (int i = 0; i < w.length; i++) {
            char c = w[i];
            if (check(c)) { //i停下
                if (j == -1) {  // j的第一次定位
                    j = i + 1;
                }
                while (j < w.length) {
                    char c2 = w[j];
                    if (check(c2) && containsAll(w, i, j)) {  // 全部囊括
                        if (check(w, i, j) && j - i + 1 < min) { // 更新min
                            min = j - i + 1;
                        }
                        break;  // j停下
                    }
                    j++;
                }
            }
        }
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }

    private static boolean containsAll(char[] w, int i, int j) {
        int c1 = 0, c2 = 0, c3 = 0;
        for (int k = i; k <= j; k++) {
            if (w[k] == 'h') c1++;
            if (w[k] == 'i') c2++;
            if (w[k] == 'o') c3++;
        }
        return c1 >= 2 && c2 >= 1 && c3 >= 1;
    }

    /**
     * 检查字符序列是否恰好包含2个h，一个i，一个o
     *
     * @param w
     * @param i
     * @param j
     * @return
     */
    private static boolean check(char[] w, int i, int j) {
        int c1 = 0, c2 = 0, c3 = 0;
        for (int k = i; k <= j; k++) {
            if (w[k] == 'h') c1++;
            if (w[k] == 'i') c2++;
            if (w[k] == 'o') c3++;
        }
        return c1 == 2 && c2 == 1 && c3 == 1;
    }

    private static boolean check(char c) {
        return c == 'h' || c == 'i' || c == 'o';
    }

}
