package minggu4;

import java.util.Scanner;

public class Tugas1 {

    //-Menampilkan bilangan genap dari kecil hingga besar

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int awal, akhir;

        System.out.print("Masukkan angka pertama : ");
        awal = scan.nextInt();
        System.out.print("Masukkan angka terakhir : ");
        akhir = scan.nextInt();

        for (int i = awal; i < akhir; i++ ){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
    }
}
