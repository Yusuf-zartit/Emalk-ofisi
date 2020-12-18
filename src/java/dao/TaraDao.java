package dao;

import Entity.Tara;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DB;

/**
 *
 * @author yusef
 */
public class TaraDao extends DB {

    public void kayıt(Tara d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("insert into Tara (ekilen,toprak_tutu,konum, metra_kare, fiyat, adres, emalk_tipi) values "
                    + "('" + d.getEkilen() + "','" + d.getToprak_tutu() + "','" + d.getKonum()
                    + "'," + d.getMetra_kare() + "," + d.getFiyat() + ",'" + d.getAdres()
                    + "','" + d.getEmalk_tipi() + "') ");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public void silme(Tara d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("delete from Tara where id=" + d.getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void guncelme(Tara d) {

    }

    public List<Tara> okumak() {
        List<Tara> list = new ArrayList<>();

        try {
            Statement s = this.getConnect().createStatement();
            ResultSet rs = s.executeQuery("select * from Tara order by fiyat asc");

            while (rs.next()) {
                Tara temp = new Tara(rs.getString("ekilen"), rs.getString("toprak_turu"),rs.getString("konum"),
                         rs.getInt("metra_kare"),rs.getInt("idi"), rs.getInt("fiyat"), rs.getString("adres"),
                        rs.getString("emalk_tipi"));
                list.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

}
