package Entity;

public class Ofis extends İsYeri{
    private String cephe;   //güney mu dogü mu batı mı güzey mu 
    private int hangi_kat;

    public Ofis(String cephe, int hangi_kat) {
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
