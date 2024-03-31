package org.example;

public class ReverseString {
    public String reverseStr(String str){
        StringBuilder sb = new StringBuilder();
        char[] strArr = str.toCharArray();

        for(int i=strArr.length-1; i>=0; i--){
            sb.append(strArr[i]);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
