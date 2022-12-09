package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //deklarasi scanner untuk input
        Scanner input = new Scanner(System.in);

        //menampilkan perintah input angka
        System.out.println("Mengubah Pon menjadi Kg");
        System.out.print("Masukkan Angka (Pon): ");
        double pon = input.nextDouble(); //deklarasi untuk menampung input pon
        double kg = 0.454 * pon; // deklarasi pon dan hitungan pon -> kg

        // hasil konversi
        System.out.println("\n" + pon + " Pound " + "sama dengan = "
                + kg + " Kg");
    }
}
