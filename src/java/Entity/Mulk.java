package Entity;

/**
 *
 * @author yusef
 */
public class Mulk {
    private int id;
    private float metra_kare;
    private double fiyat;
    private String adres;
    private String emalk_tipi;  // satlık mı kıralık mı

    public Mulk(int id, float metra_kare, double fiyat, String adres, String emalk_tipi) {
        this.id = id;
        this.metra_kare = metra_kare;
        this.fiyat = fiyat;
        this.adres = adres;
        this.emalk_tipi = emalk_tipi;
    }

    public Mulk() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMetra_kare() {
        return metra_kare;
    }

    public void setMetra_kare(float metra_kare) {
        this.metra_kare = metra_kare;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEmalk_tipi() {
        return emalk_tipi;
    }

    public void setEmalk_tipi(String emalk_tipi) {
        this.emalk_tipi = emalk_tipi;
    }
    
    
}
