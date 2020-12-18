package Entity;

/**
 *
 * @author yusef
 */
public class Arsa extends Mulk {

    private String konum;

    public Arsa(String konum, float metra_kare, int id, double fiyat, String adres, String emalk_tipi) {
        super(id, metra_kare, fiyat, adres, emalk_tipi);
        this.konum = konum;
    }

    public Arsa(String konum, float metra_kare, double fiyat, String adres, String emalk_tipi) {
        super(metra_kare, fiyat, adres, emalk_tipi);
        this.konum = konum;
    }

    public Arsa() {
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

}
