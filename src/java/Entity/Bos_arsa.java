package Entity;

public class Bos_arsa extends Arsa {

    private String imar_durumu;    //inşaata uygun mu  yola yakın mı

    public Bos_arsa(String imar_durumu,String konum, float metra_kare, int id, double fiyat, String adres, String emalk_tipi) {
        super(konum, metra_kare, id, fiyat, adres, emalk_tipi);
        this.imar_durumu = imar_durumu;
    }

    public Bos_arsa(String imar_durumu,String konum, float metra_kare, double fiyat, String adres, String emalk_tipi) {
        super(konum, metra_kare, fiyat, adres, emalk_tipi);
        this.imar_durumu = imar_durumu;
    }

    public Bos_arsa() {
    }

    public String getImar_durumu() {
        return imar_durumu;
    }

    public void setImar_durumu(String imar_durumu) {
        this.imar_durumu = imar_durumu;
    }

}
