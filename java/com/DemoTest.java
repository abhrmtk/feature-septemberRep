package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoTest {

    public static void main(String[] args){
        String str="hhoobcaacbzzffzze";
        List<String> list=new ArrayList<>();

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){

                String s=str.substring(i,j);

                if(checkPalindrome(s) )
                    list.add(s);
            }
        }

        int maxLength=list.stream().mapToInt(String::length).max().orElse(0);

        List<String> result=list.stream().filter(s->s.length()==maxLength).collect(Collectors.toList());

        System.out.println(result);


//        String str = "dswissab";
//
//        Character result = str.chars()
//                .mapToObj(c -> (char) c)
//                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
//                .findFirst()
//                .orElse(null);

        System.out.println(result);
    }



    public static boolean checkPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}
