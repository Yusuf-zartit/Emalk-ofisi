package Entity;

public class Tara extends Arsa {

    private String ekilen;
    private String toprak_tutu;

    public Tara() {
    }

    public Tara(String ekilen, String toprak_tutu, String konum, float metra_kare, int id, double fiyat, String adres, String emalk_tipi) {
        super(konum, metra_kare, id, fiyat, adres, emalk_tipi);
        this.ekilen = ekilen;
        this.toprak_tutu = toprak_tutu;
    }

    public Tara(String ekilen, String toprak_tutu, String konum, float metra_kare, double fiyat, String adres, String emalk_tipi) {
        super(konum, metra_kare, fiyat, adres, emalk_tipi);
        this.ekilen = ekilen;
        this.toprak_tutu = toprak_tutu;
    }

    public String getEkilen() {
        return ekilen;
    }

    public void setEkilen(String ekilen) {
        this.ekilen = ekilen;
    }

    public String getToprak_tutu() {
        return toprak_tutu;
    }

    public void setToprak_tutu(String toprak_tutu) {
        this.toprak_tutu = toprak_tutu;
    }

}
