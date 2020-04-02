package org.lanqiao.algo.elementary._03sort;

import java.util.Arrays;

/**
 * Case02串B是否包含串A的全部字符：
 * 判断字符串A中的字符是否全部出现在字符串B中（大众点评笔试题）
 */
public class Case12_ContainsAll {
    public static boolean check(String s1, String s2) {
        char[] s2_arr = s2.toCharArray();//转成字符数组
        Arrays.sort(s2_arr);//排序
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            int index = Arrays.binarySearch(s2_arr, a);//二分查找
            if (index < 0)
                return false;
        }
        return true;
    }

}
