package com.tutorial;

import java.util.Scanner;
public class warpad {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jml_orang;
        String nama;
        double makanan1_harga = 9999.99,
                makanan2_harga = 12345.67,
                makanan3_harga = 21108.40,
                makanan4_harga = 13579.13,
                makanan5_harga = 98765.43;

        System.out.println("Selamat Datang di Resto Bugaria");

        //================= INPUT JML ORANG ===============//
        System.out.print("Pesan untuk berapa orang? : ");
        jml_orang = input.nextInt();

        //================== INPUT NAMA ==================//
        System.out.print("Pesanan atas nama: ");
        nama = input.nextLine();
        input.nextLine();

        //================== DAFTAR MENU ================//
        System.out.println("\n Menu Spesial hari ini:");
        System.out.println("=============================");
        System.out.println("   1. Nasi Goreng Spesial       @ Rp."+makanan1_harga);
        System.out.println("   2. Ayam Bakar Spesial        @ Rp."+makanan2_harga);
        System.out.println("   3. Steak Sirloin Spesial     @ Rp."+makanan3_harga);
        System.out.println("   4. Kwetiaw Siram Spesial     @ Rp."+makanan4_harga);
        System.out.println("   5. Kambing Guling Spesial    @ Rp."+makanan5_harga);
        System.out.println();

        //================= TAMBAH PESANAN ===============//
        System.out.println("Pesanan Anda [Batas Pesanan 0-10 PO]");
        System.out.print("Nasi Goreng Spesial = ");
        int nasi = input.nextInt();
        System.out.print("Ayam Bakar Spesial = ");
        int ayam = input.nextInt();
        System.out.print("Steak Sirloin Spesial = ");
        int steak = input.nextInt();
        System.out.print("Kwetiaw Siram Spesial = ");
        int kwetiaw = input.nextInt();
        System.out.print("Kambing Guling Spesial = ");
        int kambing = input.nextInt();
        System.out.println();

        //================= PROSES PESANAN =================//
        Double menu1 = (nasi * makanan1_harga),
                menu2 = (ayam * makanan2_harga),
                menu3 = (steak * makanan3_harga),
                menu4 = (kwetiaw * makanan4_harga),
                menu5 = (kambing * makanan5_harga),
                Total = menu1 + menu2 + menu3 + menu4 + menu5,
                Diskon = Total * 10/(float)100,
                Total_bayar = Total - Diskon,
                Pembelian_perorang = Total_bayar/jml_orang;

        //========== HARGA BELI & PERHITUNGAN BAYAR ==========//
        System.out.println("Harga Pembelian:");
        System.out.printf("\n1. Nasi Goreng Spesial     %d Porsi * 9999,99  = Rp."+menu1, nasi);
        System.out.printf("\n2. Ayam Goreng Spesial     %d Porsi * 12345,67 = Rp."+menu2,ayam);
        System.out.printf("\n3. Steak Sirloin Spesial   %d Porsi * 21108,40 = Rp."+menu3,steak);
        System.out.printf("\n4. Kwetiaw Siram Spesial   %d Porsi * 13579,13 = Rp."+menu4,kwetiaw);
        System.out.printf("\n5. Kambing Guling Spesial  %d Porsi * 98765,43 = Rp."+menu5,kambing);
        System.out.println("\t+");
        System.out.println("======================================================================");
        System.out.println("Total Pembelian                                           = Rp."+Total);
        System.out.println("Disc.10% (Masa Promosi)                                   = Rp."+Diskon+"\t-");
        System.out.println("======================================================================");
        System.out.println("Total Pembelian setelah Disc 10%                          = Rp."+Total_bayar);
        System.out.println("Pembelian per-orang (untuk 8 orang)                       = Rp."+Pembelian_perorang);
        System.out.println("                Terimakasih atas kunjungan anda...");
        System.out.println("                   ...tekan ENTER untuk keluar... ");


    }
}
