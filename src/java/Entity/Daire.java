package Entity;

public class Daire extends Konut {

    private String bulundugu_kat;
    private int banyo_sayısı;

    public Daire(String bulundugu_kat, int banyo_sayısı, int id, float metra_kare,
            double fiyat, String adres, String emalk_tipi, int oda_sayisi, String yapi_durumu,
            String esyali, String isitma) {
        super(oda_sayisi, yapi_durumu, esyali, isitma, id, metra_kare, fiyat, adres, emalk_tipi);
        this.bulundugu_kat = bulundugu_kat;
        this.banyo_sayısı = banyo_sayısı;
    }

    public Daire(String bulundugu_kat, int banyo_sayısı, float metra_kare,
            double fiyat, String adres, String emalk_tipi, int oda_sayisi, String yapi_durumu,
            String esyali, String isitma) {
        super(oda_sayisi, yapi_durumu, esyali, isitma, metra_kare, fiyat, adres, emalk_tipi);
        this.bulundugu_kat = bulundugu_kat;
        this.banyo_sayısı = banyo_sayısı;
    }

    public String getBulundugu_kat() {
        return bulundugu_kat;
    }

    public void setBulundugu_kat(String bulundugu_kat) {
        this.bulundugu_kat = bulundugu_kat;
    }

    public int getBanyo_sayısı() {
        return banyo_sayısı;
    }

    public void setBanyo_sayısı(int banyo_sayısı) {
        this.banyo_sayısı = banyo_sayısı;
    }

}
