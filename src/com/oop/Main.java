package com.oop;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int jumlah_produk,pilihan,bayar,harga,total,totall;

        Scanner input = new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.println("==================== KOMPUTECH STORE ====================");
        System.out.println("=========================================================");
        System.out.println("\nNo.\t\tNama Barang \t\t\t\t\tHarga");
        System.out.println("1.\t\tAMD Ryzen 5 5600x\t\t\t\tRp.\t4.450.000");
        System.out.println("2.\t\tAMD Ryzen 7 5800x\t\t\t\tRp.\t6.050.000");
        System.out.println("3.\t\tAMD Ryzen 9 3950x\t\t\t\tRp.\t10.490.000");
        System.out.println("4.\t\tAMD Ryzen Threadripper 3990x\tRp.\t64.000.000");
        System.out.println("5.\t\tIntel i3 12100f\t\t\t\t\tRp.\t1.700.000");
        System.out.println("6.\t\tIntel i5 12400\t\t\t\t\tRp.\t3.090.000");
        System.out.println("7.\t\tIntel i5 12600k\t\t\t\t\tRp.\t4.529.000");
        System.out.println("8.\t\tIntel i7 12700k\t\t\t\t\tRp.\t6.410.000");
        System.out.println("9.\t\tIntel i9 12900k\t\t\t\t\tRp.\t9.699.000");
        System.out.println("=========================================================");
        System.out.print("Masukkan Pilihan Anda (1-9) : ");
        pilihan = input.nextInt();
        if(pilihan == 1){
            harga = 4450000;
            System.out.println("\nAMD Ryzen 5 5600x" +
                    "\nHarga : Rp. " + harga);
        }else if(pilihan == 2){
            harga = 6050000;
            System.out.println("AMD Ryzen 7 5800x" +
                    "\nHarga : Rp. " + harga);
        }else if(pilihan == 3){
            harga = 10490000;
            System.out.println("MD Ryzen 9 3950x" +
                    "\nHarga : Rp. " + harga);
        }else if(pilihan == 4){
            harga = 64000000;
            System.out.println("AMD Ryzen Threadripper 3990x" +
                    "\nharga : Rp. " + harga);
        }else if(pilihan == 5){
            harga = 1700000;
            System.out.println("Intel i3 12100f" +
                    "\nharga : Rp. " + harga);
        }else if(pilihan == 6){
            harga = 3090000;
            System.out.println("Intel i5 12400" +
                    "\nharga : Rp. " + harga);
        }else if(pilihan == 7){
            harga = 4529000;
            System.out.println("Intel i5 12600k" +
                    "\nharga : Rp. " + harga);
        }else if(pilihan == 8){
            harga = 6410000;
            System.out.println("Intel i7 12700k" +
                    "\nharga : Rp. " + harga);
        }else if(pilihan == 9){
            harga = 9699000;
            System.out.println("Intel i9 12900k" +
                    "\nharga : Rp. " + harga);
        }else{
            System.out.println("Maaf, pilihan yang anda pilih tidak valid");
            return;
        }
        System.out.print("Jumlah Produk : ");
        jumlah_produk = input.nextInt();
        total = harga * jumlah_produk;
        System.out.println("Anda harus membayar : Rp. " + total);
        System.out.print("Bayar : Rp. ");
        bayar = input.nextInt();
        totall = bayar - total;
        System.out.println("Kembaliannya : Rp. " +totall);

        return;
    }
}
