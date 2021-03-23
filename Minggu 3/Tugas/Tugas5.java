package minggu3;
import java.util.Scanner;

public class Tugas5 {

    //-Membuat pilihan menu minuman Cafe Ceria dengan menggunakan kondisi switch case

    public static void main(String[] args) {
        System.out.println(
                "       CAFE CERIA      " + "\n" +
                "      ANEKA MINUMAN    " + "\n" +
                "------------------------" + "\n" +
                "      SPECIAL MENU :   " + "\n" +
                "    1.  Soft drinks    " + "\n" +
                "    2.  Mix juice      " + "\n" +
                "    3.  Nescafe        " + "\n" +
                "    4.  Soda milk      " + "\n" +
                "    5.  Tea            " + "\n" +
                "------------------------"
        );

        Scanner scan = new Scanner(System.in);
        String pembeli;
        int pilihan;
        String[] menu = {"Soft drinks", "Mix juice", "Nescafe", "Soda milk", "Tea"};

        System.out.print("Masukkan nama pembeli : ");
        pembeli = scan.nextLine();

        System.out.print("Silahkan masukkan pilihan anda : ");
        pilihan = scan.nextInt();

        switch (pilihan){
            case 1:
                System.out.println("Minuman yang anda pesan adalah " + menu[0]);
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah " + menu[1]);
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah " + menu[2]);
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah " + menu[3]);
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah " + menu[4]);
                break;
            default:
                System.out.println("Tidak ada dalam pilihan, mohon periksa pilihan anda!");
        }

        System.out.println("Pesan akan segera kami antar" + "\n" +
                "Terima kasih " + pembeli + " telah berkunjung di Cafe Ceria"
                );

    }
}
