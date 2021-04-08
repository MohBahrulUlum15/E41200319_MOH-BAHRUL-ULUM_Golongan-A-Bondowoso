package minggu4;

public class Tugas2 {
    //-Menampilkan bilangan kelipatan 2 antara 1-100 (Do_While)
    public static void main(String[] args) {
        System.out.println("              Do_While              ");
        System.out.println("  Bilangan dikali dengan 2 (1-100)  ");
        System.out.println("====================================");
        int angka = 1;
        do {
            System.out.print(angka + "  ");
            angka = angka * 2;
        } while (angka < 100);

        System.out.println("\n" + "\n");

        System.out.println("              Do_While              ");
        System.out.println("    Bilangan kelipatan 2 (1-100)    ");
        System.out.println("====================================");
        int hasil = 0;
        int kelipatan = 2;
        int batasan = 100;
        for (int i = 1; i < batasan/kelipatan ; i++){
            hasil = kelipatan * i;
            System.out.print((hasil) + " ");
        }

    }
}
