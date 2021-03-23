package minggu3;

import java.util.Scanner;

public class Tugas2 {

    //-Membuat deretan array secara random (acak) yang mana jumlah deretnya ditentukan oleh user

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai yang akan diinputkan : ");
        int jumlah = scan.nextInt();

        int[] array = new int[jumlah];

        for (int i = 0; i < jumlah; i++){
            System.out.print("indeks ke-" + i + " : ");
            array[i] = scan.nextInt();
        }

        System.out.print("Berikut adalah nilai-nilai yang telah diinputkan : ");
        for (int j : array) {
            System.out.print(j + "  ");
        }
    }
}
