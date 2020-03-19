package org.lanqiao.algo.elementary._02searchAndSort;

import java.util.Scanner;

/**
 * 小白正在上楼梯，楼梯有n阶台阶，小白一次可以上1阶，2阶或3阶，
 * 实现一个方法，计算小白有多少种走完楼梯的方式
 */
public class Case01_小白上楼梯 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int res = f(n);
            System.out.println(res);
        }
    }

    private static int f(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return f(n - 1) + f(n - 2) + f(n - 3);
    }
}
