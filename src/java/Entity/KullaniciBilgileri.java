package Entity;

public class KullaniciBilgileri {

    private int id;
    private int uye_Yetki;
    private String tel_no;
    private String name;
    private String last_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUye_Yetki() {
        return uye_Yetki;
    }

    public void setUye_Yetki(int uye_Yetki) {
        this.uye_Yetki = uye_Yetki;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

}
