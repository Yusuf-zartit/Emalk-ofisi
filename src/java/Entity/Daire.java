package Entity;

public class Daire extends Konut{
    private String bulundugu_kat;
    private int banyo_sayısı;

    public Daire(String bulundugu_kat, int banyo_sayısı) {
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
