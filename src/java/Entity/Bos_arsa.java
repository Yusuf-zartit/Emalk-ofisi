package Entity;

public class Bos_arsa extends Arsa{
    private String imar_durumu;    //inşaata uygun mu  yola yakın mı

    public Bos_arsa(String imar_durumu) {
        this.imar_durumu = imar_durumu;
    }

    public String getImar_durumu() {
        return imar_durumu;
    }

    public void setImar_durumu(String imar_durumu) {
        this.imar_durumu = imar_durumu;
    }

   
    
    
}
