package Entity;

public class Kullanici {

    private int Kullanici_id;
    private String username;
    private String password;
    private KullaniciBilgileri yetki;// her kullanicinin kendi bilgilerini ve yetki seviyesini içerir

    public Kullanici() {
        this.yetki = new KullaniciBilgileri();
    }

    public int getKullanici_id() {
        return Kullanici_id;
    }

    public void setKullanici_id(int Kullanici_id) {
        this.Kullanici_id = Kullanici_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public KullaniciBilgileri getYetki() {
        return yetki;
    }

    public void setYetki(KullaniciBilgileri yetki) {
        this.yetki = yetki;
    }

}
