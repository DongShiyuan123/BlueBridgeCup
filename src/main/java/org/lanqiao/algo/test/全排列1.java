package org.lanqiao.algo.test;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.lanqiao.algo.book.cc150._9_5全排列I;

import java.util.ArrayList;

/**
 * @author Dong
 * @time 2020-05-15 16:39
 */
public class 全排列1 {
    public static void main(String[] args) {
        ArrayList<String> res = getPermutation0("abcd");
        System.out.println(res.size());
        System.out.println(res);
    }

    private static ArrayList<String> getPermutation0(String A) {
        int n = A.length();
        if (n <= 0)
            return null;

        ArrayList<String> list = new ArrayList<String>();
        list.add(A.charAt(0) + "");

        for (int i = 1; i < n; i++) {
            ArrayList<String> new_List = new ArrayList<>();
            for (String str : list) {
                new_List.add(A.charAt(i) + str);
                new_List.add(str + A.charAt(i));
                for (int k = 1;k<str.length(); k++){
                    new_List.add(str.substring(0,k)+ A.charAt(i)+str.substring(k));
                }
            }
            list=new_List;
        }

        return list;
    }


}
