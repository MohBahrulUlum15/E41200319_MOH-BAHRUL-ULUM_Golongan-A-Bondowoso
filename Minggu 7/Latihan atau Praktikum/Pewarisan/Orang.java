package Pewarisan;

/**
 * @author MOH. BAHRUL 'ULUM
 */
public class Orang {
    private String nama;
    private double tinggi;
    private double berat;

    public void Orang (String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public String toString() {
        return ("Nama : " + nama + "\nTinggi : " + tinggi + "\nBerat : " + berat);
    }
    
}
