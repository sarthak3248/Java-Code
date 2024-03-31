package org.example;

public class Basic {
    public int compare1(int n1, int n2){
        if(n1 > n2){
            return 1;
        }
        return -1;
    }

    public int compare2(int n1, int n2){
        if(n1 > n2){
            return 1;
        }else if(n1 < n2){
            return -1;
        }
        return 0;
    }
}
