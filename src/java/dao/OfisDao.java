package dao;

import Entity.Ofis;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DB;

/**
 *
 * @author yusef
 */
public class OfisDao extends DB {

    public void kayıt(Ofis d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("insert into Ofis (cephe,hangi_kat,isitma,esyali, bina_yasi, id,metra_kare,fiyat,adres,emalk_tipi) values "
                    + "('" + d.getCephe() + "','" + d.getHangi_kat() + "','" + d.getIsitma()
                    + "','" + d.getEsyali() + "','" + d.getBina_yasi() + "'," + d.getId()
                    + "," + d.getMetra_kare() + "," + d.getFiyat() + ",'" + d.getAdres() + "','" + d.getEmalk_tipi() + "') ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void silme(Ofis d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("delete from Ofis where id=" + d.getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void guncelme(Ofis d) {

    }

    public List<Ofis> okumak() {
        List<Ofis> list = new ArrayList<>();

        try {
            Statement s = this.getConnect().createStatement();
            ResultSet rs = s.executeQuery("select * from Ofis order by fiyat asc");

            while (rs.next()) {
                Ofis temp = new Ofis(rs.getString("cephe"), rs.getInt("hangi_kat"), rs.getString("isitma"),
                        rs.getString("esyali"), rs.getString("bina_yasi"), rs.getInt("idi"), rs.getInt("metra_kare"), rs.getInt("fiyat"), rs.getString("adres"),
                        rs.getString("emalk_tipi"));
                list.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

}
