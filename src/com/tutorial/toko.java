package com.tutorial;

import java.util.Scanner;

public class toko {
    public static void main(String[] args){
        //Deklarai Scanner untuk input
        Scanner input = new Scanner(System.in);

        //Deklarasi perintah input
        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();

        System.out.println(" ");
        System.out.println("Stok Gudang Input Barang");
        System.out.println("#########################");

        System.out.println(" ");
        System.out.println("Selamat datang "+ nama);

        System.out.print("Masukkan nama barang yang mau ditambah :");
        String barang = input.nextLine();

        System.out.print("Masukkan jumlah barang yang mau ditambah: ");
        int jumlah = input.nextInt();

        System.out.print("Masukkan harga beli untuk barang tersebut: ");
        float beli = input.nextFloat();

        System.out.print("Masukkan harga jual untuk barang tersebut: ");
        float jual = input.nextFloat();

        System.out.println(" ");
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("#########################");

        System.out.println("Nama Barang: "+barang);
        System.out.println("Jumlah Barang: "+ jumlah);
        System.out.println("Harga Beli:" + beli);
        System.out.println("Harga Jual: "+ jual);
    }
}
