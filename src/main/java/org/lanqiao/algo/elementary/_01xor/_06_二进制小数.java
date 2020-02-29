package org.lanqiao.algo.elementary._01xor;

/*
 * 给定一个介于0和1之间的实数，如（0.625），类型为double打印他的二进制表示（0.101，小数点后的二进制分别表示0.5,0.25,0.125 ....)
 * 如果该数字无法精确的用32位以内的二进制表示，则打印“ERROR”
 *
 * */
public class _06_二进制小数 {
    public static void main(String[] args) {
        double num = 0.625;
        StringBuilder sb = new StringBuilder("0.");
        while (num > 0) {
            //乘2：挪整
            double r = num * 2;
            //判断整数部分
            if (r >= 1) {
                sb.append("1");
                //消掉整数部分
                num = r - 1;
            } else {
                sb.append("0");
                num = r;
            }

            if (sb.length() > 34) {
                System.out.println("ERROR");
                return;
            }

        }
        System.out.println(sb.toString());
    }
}
