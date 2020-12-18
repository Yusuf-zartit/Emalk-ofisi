package Entity;

public class Ofis extends İsYeri {

    private String cephe;   //güney mu dogü mu batı mı güzey mu 
    private int hangi_kat;

    public Ofis(String cephe, int hangi_kat, String isitma, String esyali, String bina_yasi, int id, float metra_kare, double fiyat, String adres, String emalk_tipi) {
        super(isitma, esyali, bina_yasi, id, metra_kare, fiyat, adres, emalk_tipi);
        this.cephe = cephe;
        this.hangi_kat = hangi_kat;
    }

    public Ofis(String cephe, int hangi_kat, String isitma, String esyali, String bina_yasi, float metra_kare, double fiyat, String adres, String emalk_tipi) {
        super(isitma, esyali, bina_yasi, metra_kare, fiyat, adres, emalk_tipi);
        this.cephe = cephe;
        this.hangi_kat = hangi_kat;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getHangi_kat() {
        return hangi_kat;
    }

    public void setHangi_kat(int hangi_kat) {
        this.hangi_kat = hangi_kat;
    }

}
