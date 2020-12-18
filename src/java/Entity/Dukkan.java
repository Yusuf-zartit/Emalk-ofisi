package Entity;

public class Dukkan extends İsYeri {

    private String takas;   // takasa uygun mu degil mi
    private String aciklama;   // Dukkan başka bir özelikleri var mı 

    public Dukkan(String takas, String aciklama,String isitma, String esyali, String bina_yasi, int id, float metra_kare, double fiyat, String adres, String emalk_tipi) {
        super(isitma,esyali, bina_yasi, id,metra_kare,fiyat,adres,emalk_tipi);
        this.takas = takas;
        this.aciklama = aciklama;
    }
 public Dukkan(String takas, String aciklama,String isitma, String esyali, String bina_yasi, float metra_kare, double fiyat, String adres, String emalk_tipi) {
        super(isitma,esyali, bina_yasi,metra_kare,fiyat,adres,emalk_tipi);
        this.takas = takas;
        this.aciklama = aciklama;
    }

    public String getTakas() {
        return takas;
    }

    public void setTakas(String takas) {
        this.takas = takas;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

}
