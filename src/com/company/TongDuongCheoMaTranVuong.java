package com.company;

import java.util.Scanner;

public class TongDuongCheoMaTranVuong {

    public static void main(String[] args) {
        // write your code here
        int[][] arr = new TongDuongCheoMaTranVuong().creat();
        String showArray = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                showArray += arr[i][j] + "\t";
            }
            showArray += "\n";
        }
        System.out.println("your array is: \n" + showArray);
        int total = new TongDuongCheoMaTranVuong().sum(arr);
        System.out.println("Sum is\t" + total);
    }

    int[][] creat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert row ad collum for this square Matrix");
        int row = scanner.nextInt();
        int[][] arr = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = (int) Math.round(Math.random() * 100);
            }
        }
        return arr;
    }

    public int sum(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][i];
        }
        return total;
    }

}
