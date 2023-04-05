package com.example.test1;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        String str="ABBCCCCCBBAB";
            String s=str.toUpperCase();
        System.out.println(s);
            StringBuilder sb=new StringBuilder();
            List<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<s.length();i++){
                //第一个元素是必定输出的，不用删除的
                if (i == 0) {
                    list.add(0);
                }else {
                    //根据前后元素比较，如果相同，则跳过，不同，则记录索引
                    if(s.charAt(i)!=s.charAt(i-1)){
                        list.add(i);
                    }}
            }
            for(Integer n:list){
                //将记录的索引对应原字符串添加到StringBuilder中，形成新的字符串
                sb.append(str.charAt(n));
            }

        System.out.println(sb.toString());


    }

}
