package minggu4;

public class Tugas2 {

    //-Menampilkan bilangan kelipatan 2 antara 1-100 (Do_While)

    public static void main(String[] args) {
        System.out.println("            Do_While            ");
        System.out.println("  Bilangan kelipatan 2 (1-100)  ");
        System.out.println("================================");

        int angka = 1;
        do {
            System.out.print(angka + "  ");
            angka = angka * 2;
        } while (angka < 100);

    }
}
