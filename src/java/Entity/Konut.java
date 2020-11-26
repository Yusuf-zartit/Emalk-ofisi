package Entity;

/**
 *
 * @author yusef
 */
public class Konut extends Mulk{
    private int oda_sayisi;
    private String yapi_durumu;
    private String esyali;
    private String isitma;

    public Konut(int oda_sayisi, String yapi_durumu, String esyali, String isitma) {
        this.oda_sayisi = oda_sayisi;
        this.yapi_durumu = yapi_durumu;   //kıralık verilmiş mi yoksa daha boş mu
        this.esyali = esyali;     // var mı yok mu
        this.isitma = isitma;      // var mı yok mu
    }

    public Konut() {
    }
    

    public int getOda_sayisi() {
        return oda_sayisi;
    }

    public void setOda_sayisi(int oda_sayisi) {
        this.oda_sayisi = oda_sayisi;
    }

    public String getYapi_durumu() {
        return yapi_durumu;
    }

    public void setYapi_durumu(String yapi_durumu) {
        this.yapi_durumu = yapi_durumu;
    }

    public String getEsyali() {
        return esyali;
    }

    public void setEsyali(String esyali) {
        this.esyali = esyali;
    }

    public String getIsitma() {
        return isitma;
    }

    public void setIsitma(String isitma) {
        this.isitma = isitma;
    }
    
    
}
