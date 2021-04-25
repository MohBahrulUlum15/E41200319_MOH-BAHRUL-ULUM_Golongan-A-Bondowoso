package Pewarisan;

/**
 * @author MOH. BAHRUL 'ULUM
 */
public class B extends A{       //  Mendeklarasikan class B yang diturunkan dari class A
    int z;
    
    void TampilkanJumlah(){
        //  subclass dapat mengakses member dari superclass
        System.out.println("Jumlah : " + (x + y + z));
    }
}
