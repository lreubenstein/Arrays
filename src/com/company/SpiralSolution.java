package com.company;

import java.util.Arrays;

public class SpiralSolution {
    public static int []spiral(int [][] a){
        int size = a.length * a[0].length;
        int [] result = new int [size];
        int startrow = 0;
        int endcol = a[0].length-1;
        int endrow = a.length-1;
        int startcol = 0;
        int i = 0;
        while(startrow <= endrow && startcol <= endcol){
            for(int c = startcol; c <= endcol; c++){
                result[i] = a[startrow][c];
                i++;
            }
            startrow++;
            for(int r = startrow; r <= endrow; r++){
                result[i] = a[r][endcol];
                i++;
            }
            endcol--;
            if(startrow <= endrow){
                for(int c = endcol; c >= startcol; c--){
                    result[i]=a[endrow][c];
                    i++;
                }
                endrow--;
            }

            if(startcol <= endcol){
                for(int r = endrow; r>= startrow; r--){
                    result[i]=a[r][startcol];
                    i++;
                }
                startcol++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [][]a={{1,  2,  3,  4, 5},
                   {6,  7,  8,  9, 10},
                   {11, 12, 13, 14, 15},
                   {16, 17, 18, 19, 20}};
        System.out.println(Arrays.toString(spiral(a)));

        int [][] b = {{1, 2,  3,  4},
                      {5, 6,  7,  8},
                      {9, 10, 11, 12}};
        System.out.println(Arrays.toString(spiral(b)));

        int [][] c = {{15},{38}, {26}};
        System.out.println(Arrays.toString(spiral(c)));

        int [][] d = {{40, 25},
                    {17, 99},
                    {76, 53},
                    {88, 2}};
        System.out.println(Arrays.toString(spiral(d)));

        int [][] e = {{7, 3, 5, 2}};
        System.out.println(Arrays.toString(spiral(e)));
    }
}

/*
[1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12]
[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
[15, 38, 26]
[40, 25, 99, 53, 2, 88, 76, 17]
[7, 3, 5, 2]

 */