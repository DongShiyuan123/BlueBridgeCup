package org.lanqiao.algo.elementary._01xor;

/**
 * @author Dong
 * @time 2020-02-18 15:57
 */
public class test {
    public static void main(String[] args) {
        int n=3;
        for (int i = 1; i <= 10; i++) {
            n = n ^ i;
        }

        for (int i = 1; i <= 10; i++) {
            n = n ^ i;
        }
        System.out.println(n);
    }
}
