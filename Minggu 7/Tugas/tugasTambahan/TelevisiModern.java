package tugasTambahan;

/**
 *
 * @author Moh. Bahrul 'Ulum
 */
public class TelevisiModern extends Televisi{
    
    public TelevisiModern(String deskripsi, int jumlahChannel) {
        super(deskripsi, jumlahChannel);
    }
    
    static String TELETEXT = "Teletext";
    static String TV = "Televisi";
    
    public void setModusTampilan(String x) {
        this.TELETEXT = x;
        
        System.out.println("Modus tampilan : " + x);
    }
    
    int halamanTeletext;
    public void setHalamanTeletext(int i) {
        this.halamanTeletext = i;
        
        System.out.println("Berpindah ke halaman teletext " + i);
    }
    
    String titleMovie = "";
    public void setDiscTray(String title) {
        this.titleMovie = title;
    }
    
    public void playCD() {
        if (titleMovie == "") {
            System.out.println("Tidak ada CD di dalam disc tray!");
        } else {
            System.out.println("Memutar Film " + titleMovie);  
        }
    }
}
