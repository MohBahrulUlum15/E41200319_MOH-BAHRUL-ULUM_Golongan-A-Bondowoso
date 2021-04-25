package Konstruktor;

/**
 * @author MOH. BAHRUL 'ULUM
 */
public class C extends B{

    C() {   //  super(); Tambahan kode secara otomatis oleh Java untuk memanggil Konstruktor dari SuperClassnya
        
        super();    //  Konstruktor deault dari class B 
                    //  Object dipanggil
        System.out.println("Konstruktor class C dieksekusi ...");
    }
    
}
