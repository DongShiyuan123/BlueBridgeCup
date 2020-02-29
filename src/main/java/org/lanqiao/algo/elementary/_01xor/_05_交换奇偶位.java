package org.lanqiao.algo.elementary._01xor;

import org.assertj.core.api.Assertions;

/*
 * 将整数奇偶位互换
 * */
public class _05_交换奇偶位 {

    public static void main(String[] args) {
        int a = 0b01000000_00000000_00000000_00000000;//二进制
        System.out.println(a);
        int b = m(a);
        System.out.println(b);
        Assertions.assertThat(b).isEqualTo(0b10000000_00000000_00000000_00000000);
    }

    private static int m(int i) {
        int ou = i & 0xaaaaaaaa;//和1010 1010 1010 。。。。做与运算取出偶数位 16进制
        int ji = i & 0x55555555;//和0101 0101 0101.。。。。做与运算取出奇数位 16进制
        return (ou >> 1) ^ (ji << 1); // 连起来
    }
}
