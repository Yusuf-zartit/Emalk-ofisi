package dao;

import Entity.Bos_arsa;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DB;

/**
 *
 * @author yusef
 */
public class Bos_arsaDao extends DB {

    public void kayıt(Bos_arsa d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("insert into Bos_arsa (imar_durumu,konum, metra_kare, fiyat, adres, emalk_tipi) values "
                    + "('" + d.getImar_durumu() + "','" + d.getKonum()
                    + "'," + d.getMetra_kare() + "," + d.getFiyat() + ",'" + d.getAdres()
                    + "','" + d.getEmalk_tipi() + "') ");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public void silme(Bos_arsa d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("delete from Bos_arsa where id=" + d.getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void guncelme(Bos_arsa d) {

    }

    public List<Bos_arsa> okumak() {
        List<Bos_arsa> list = new ArrayList<>();

        try {
            Statement s = this.getConnect().createStatement();
            ResultSet rs = s.executeQuery("select * from Bos_arsa order by fiyat asc");

            while (rs.next()) {
                Bos_arsa temp = new Bos_arsa( rs.getString("imar_durumu"),rs.getString("konum"),
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
