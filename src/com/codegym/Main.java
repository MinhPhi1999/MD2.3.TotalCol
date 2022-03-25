package com.codegym;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("thích tổng cột nào ");
        int col = scanner.nextInt();

        System.out.println(" tổng cột " + totalCol(array,col));
    }
    static int totalCol(int[][] arr,int col){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (col==j){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
}
