package Konstruktor;

/**
 * @author MOH. BAHRUL 'ULUM
 */
public class B extends A{

    B() {   //  super(); Tambahan kode secara otomatis oleh Java untuk memanggil Konstruktor dari SuperClassnya
        
        super();    //  Konstruktor deault dari class A 
                    //  Object dipanggil
        System.out.println("Konstruktor class B dieksekusi ...");
    }
    
}
