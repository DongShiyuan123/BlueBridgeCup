package org.lanqiao.algo.elementary._01xor;

import java.util.Scanner;

/**
 * 请实现一个函数，输入一个整数，输出二进制中1的个数
 * 例：9的二进制表示为1001，有2位是1
 * <p>
 * 判断一个整数是不是2的整数次方（二进制一条语句解决 if (((N - 1) & N) == 0)  ）
 */
public class _03_1的个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(Integer.toString(N, 2));

        int count = 0;
        //1
        //比对每一位
        for (int i = 0; i < 32; i++) {
            if ((N & (1 << i)) == (1 << i)) {
                count++;
            }
        }
        System.out.println(count);
        //2
        count = 0;
        for (int i = 0; i < 32; i++) {
            if (((N >>> i) & 1) == 1)
                count++;
        }
        System.out.println(count);
        //3
        count = 0;
        while (N != 0) {
            N = ((N - 1) & N);
            count++;
        }
        System.out.println(count);

    }
}
