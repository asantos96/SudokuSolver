package com.company;


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Prints out Grid
        int[] rows1 = {0, 2, 0, 8, 0, 0, 0, 1, 5};
        int[] rows2 = {3, 0, 0, 4, 6, 5, 2, 0, 0};
        int[] rows3 = {5, 6, 9, 0, 0, 2, 0, 3, 0};

        int[] rows4 = {0, 7, 6, 0, 4, 0, 0, 8, 0};
        int[] rows5 = {0, 0, 0, 0, 5, 8, 7, 0, 0};
        int[] rows6 = {9, 8, 0, 2, 7, 0, 4, 0, 1};
        int[] rows7 = {0, 0, 0, 0, 0, 4, 1, 0, 0};
        int[] rows8 = {7, 5, 1, 0, 0, 6, 0, 0, 2};
        int[] rows9 = {0, 0, 2, 1, 0, 0, 0, 5, 8};


        for (int i = 0; i < 9; i++) {
            System.out.print(rows1[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < 9; i++) {
            System.out.print(rows2[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < 9; i++) {
            System.out.print(rows3[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < 9; i++) {
            System.out.print(rows4[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < 9; i++) {
            System.out.print(rows5[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < 9; i++) {
            System.out.print(rows6[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < 9; i++) {
            System.out.print(rows7[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < 9; i++) {
            System.out.print(rows8[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < 9; i++) {
            System.out.print(rows9[i] + " ");
        }
        System.out.println("");

    }
}