package com.tutorial;

import java.util.Scanner;

public class forcasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String nama_pasangan;
        String nama_anda;
        int umur_pasangan;
        int umur_anda;
        double min = 50;
        double max = 100;
        double kecocokan = (double)Math.random()*(max-min+1)+min;

        System.out.println("Selamat datang di program ramalan cupu");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\n");

        System.out.println("Data Anda: ");
        System.out.println("\u2665\u2665\u2665\u2665\u2665\u2665\u2665");

        System.out.println("Masukkan nama anda: ");
        nama_anda =  input.nextLine();

        System.out.print("Masukkan umur anda: ");
        umur_anda = input.nextInt();
        System.out.println("\n");

        System.out.println("Data Pasangan Anda: ");
        System.out.println("\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665");

        System.out.println("Masukkan nama pasangan anda: ");
       nama_pasangan =  input.nextLine();

        System.out.print("Masukkan umur pasangan anda: ");
        umur_pasangan = input.nextInt();
        System.out.println("\n");

        System.out.println(nama_anda+"["+umur_anda+"] tahun");
        System.out.println("\n"
                                    +" \u2665\u2665\u2665    \u2665\u2665\u2665"+"\n"
                     +" \u2665\u2665\u2665\u2665\u2665  \u2665\u2665\u2665"+"\u2665\u2665"+"\n"
                +"\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665"+"\u2665\u2665\u2665\u2665" + "\u2665" +
                     "\u2665"+"\n" +"\u2665\u2665\u2665\u2665\u2665" + "\u2665\u2665\u2665" + "\u2665" +
                        "\u2665\u2665\u2665"+"\n" +"\u2665\u2665\u2665\u2665\u2665"+"\u2665\u2665" +
                                    "\u2665"+"\n" +" \u2665\u2665\u2665\u2665"+"\n" 
                                                +" \u2665\u2665"+"\n");
        System.out.println(nama_pasangan+" ["+umur_pasangan+"] tahun");
        System.out.println();
        System.out.println("Tekan ENTER untuk melihat hasil ramalan...");
        System.out.println("Kecocokan anda dengan pasangan anda adalah :"+String.format("%.2f",kecocokan)+"%");
        System.out.println("\n");
        System.out.println("Terima Kasih karena anda telah menggunakan Jasa Ramalan kami...^^V");


    }
}
