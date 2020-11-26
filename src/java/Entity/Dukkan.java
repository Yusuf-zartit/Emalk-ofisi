package Entity;

public class Dukkan extends İsYeri{
    private String takas;   // takasa uygun mu degil mi
    private String aciklama;   // Dukkan başka bir özelikleri var mı 

    public Dukkan(String takas, String aciklama) {
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
