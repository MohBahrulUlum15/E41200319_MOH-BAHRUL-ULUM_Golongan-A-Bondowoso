package minggu3;

import java.util.Scanner;

public class Tugas4 {

    //-Promo Belanja Berhadiah Kharisma Agung Plaza (KAP)

    public static void main(String[] args) {

        System.out.println("----------------------------------------------" + "\n" +
                "         Kharisma Agung Plaza < KAP >         " + "\n" +
                "           Promo Belanja Berhadiah            " + "\n" +
                "       Khusus Pembelian 5 Barang Pertama      " + "\n" +
                "       Dengan harga minimum Rp. 10000,00      " + "\n" +
                "----------------------------------------------"
        );

        Scanner scan = new Scanner(System.in);
        String pembeli;
        int jumlahBarang = 5;
        int totalHarga = 0;
        int[] hargaBarang = new int[jumlahBarang];

        System.out.print("Masukkan nama pembeli : ");
        pembeli = scan.nextLine();
        System.out.println("");

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + "  : ");
            hargaBarang[i] = scan.nextInt();
            totalHarga += hargaBarang[i];

        }
        System.out.println("Total harga pembelian atas nama " + pembeli + " adalah Rp " + totalHarga + "\n");

        if (hargaBarang[0] >= 10000 &&
            hargaBarang[1] >= 10000 &&
            hargaBarang[2] >= 10000 &&
            hargaBarang[3] >= 10000 &&
            hargaBarang[4] >= 10000 )
        {
            System.out.println("Selamat...." + "\n" + "Anda mendapat hadiah 1 mug cantik");
        }

        System.out.println("----------------------------------------------" + "\n" +
                "                 Terima Kasih                 " + "\n" +
                "  Anda sudah belanja di Kharisma Agung Plaza  "
        );
    }
}
