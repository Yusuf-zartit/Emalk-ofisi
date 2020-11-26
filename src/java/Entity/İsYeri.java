package Entity;

/**
 *
 * @author yusef
 */
public class İsYeri extends Mulk{
    private String isitma;    // var mı yok mu
    private String esyali;    // var mı yok mu
    private String bina_yasi;

    public İsYeri(String isitma, String esyali, String bina_yasi) {
        this.isitma = isitma;
        this.esyali = esyali;
        this.bina_yasi = bina_yasi;
    }

    public İsYeri() {
    }
    

    public String getIsitma() {
        return isitma;
    }

    public void setIsitma(String isitma) {
        this.isitma = isitma;
    }

    public String getEsyali() {
        return esyali;
    }

    public void setEsyali(String esyali) {
        this.esyali = esyali;
    }

    public String getBina_yasi() {
        return bina_yasi;
    }

    public void setBina_yasi(String bina_yasi) {
        this.bina_yasi = bina_yasi;
    }
    
    
}
