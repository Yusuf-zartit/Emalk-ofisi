package Entity;

public class Mustakil_ev extends Konut {

    private int kat_sayisi;
    private String pahcasi;   // var mı yok mı

    public Mustakil_ev(String pahcasi, int kat_sayisi, int id, float metra_kare,
            double fiyat, String adres, String emalk_tipi, int oda_sayisi, String yapi_durumu,
            String esyali, String isitma) {
        super(oda_sayisi, yapi_durumu, esyali, isitma, id, metra_kare, fiyat, adres, emalk_tipi);
        this.pahcasi = pahcasi;
        this.kat_sayisi = kat_sayisi;
    }

    public Mustakil_ev(String pahcasi, int kat_sayisi, float metra_kare,
            double fiyat, String adres, String emalk_tipi, int oda_sayisi, String yapi_durumu,
            String esyali, String isitma) {
        super(oda_sayisi, yapi_durumu, esyali, isitma, metra_kare, fiyat, adres, emalk_tipi);
        this.pahcasi = pahcasi;
        this.kat_sayisi = kat_sayisi;
    }

    public Mustakil_ev() {
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
