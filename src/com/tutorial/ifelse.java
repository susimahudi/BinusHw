package com.tutorial;

import java.util.*;
public class ifelse {
    public static void main(String[] args){
        int input, x;

        Scanner inputuser = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        input = inputuser.nextInt();

        x = (input == 10) ? (input*input) : (input/2);

        System.out.print("Angka anda adalah: "+ x );



    }
}
