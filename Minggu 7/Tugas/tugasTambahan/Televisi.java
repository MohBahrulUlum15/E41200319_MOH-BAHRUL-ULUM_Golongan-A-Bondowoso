package tugasTambahan;

/**
 *
 * @author Moh. Bahrul 'Ulum
 */

public class Televisi {
    String deskripsi;
    int jumlahChannel;
    String[] Channels;
    int channelAktif;
    int volume;
    
    public Televisi(String deskripsi, int jumlahChannel) {
        this.deskripsi = deskripsi;
        this.jumlahChannel = jumlahChannel;
    }
    
    public String getDeskripsi() {
        return (deskripsi);
    }
    
    public void getChannels() {
        System.out.println("Belum ada channel yang di set!");
    }
    
    public void setChannels(String[] Channels) {
        this.Channels = Channels;
        
        if (Channels.length > jumlahChannel) {
            System.out.println("Maaf TV ini hanya dapat menyimpan " + jumlahChannel + " channel");
        } else {
            System.out.println("Informasi channel berhasil diupdate!");
        }
    }
    
    public void setChannelAktif(int channelAktif) {
        this.channelAktif = channelAktif;
        
        if (channelAktif < Channels.length) {
            System.out.println("Pindah channel ke : " + Channels[channelAktif]);   
        } else {
            System.out.println("Channel yang anda inginkan belum di set!");
        }
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
        
        System.out.println("Intensitas volume sekarang : " + volume);
    }
}
