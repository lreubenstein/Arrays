package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String [] s1 = {"bone", "head", "rubber", "stamp", "rubber", "band", "ignore"};
        String [] s2 = compound(s1);
        System.out.println(Arrays.toString(s2));
        String [] s3 = {"head", "stone", "key", "chain", "pencil", "box","milk", "can"};
        String [] s4 = compound(s3);
        System.out.println(Arrays.toString(s4));

    }

    public static String[] compound(String [] a){
        int n = a.length/2;
        String[]a2 = new String[n];
        int x = 0;
        for(int i = 0; i < a.length-1; i+=2){
            a2[x]= a[i]+a[i+1];
            x++;
        }
        return a2;
    }
}
