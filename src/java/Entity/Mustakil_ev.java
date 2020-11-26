package Entity;

public class Mustakil_ev extends Konut{
    private int kat_sayisi;
    private String pahcasi;   // var mı yok mı

    public Mustakil_ev(int kat_sayisi, String pahcasi) {
        this.kat_sayisi = kat_sayisi;
        this.pahcasi = pahcasi;
    }

    public int getKat_sayisi() {
        return kat_sayisi;
    }

    public void setKat_sayisi(int kat_sayisi) {
        this.kat_sayisi = kat_sayisi;
    }

    public String getPahcasi() {
        return pahcasi;
    }

    public void setPahcasi(String pahcasi) {
        this.pahcasi = pahcasi;
    }
    
    
    
}
