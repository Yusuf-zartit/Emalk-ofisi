package dao;

import Entity.Mustakil_ev;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DB;

/**
 *
 * @author yusef
 */
public class Mustakil_ev_Dao extends DB {

    public void kayıt(Mustakil_ev d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("insert into Mustakil_ev (metra_kare,fiyat,adres,emalk_tipi,oda_sayisi,yapi_durumu,esyali"
                    + ",isitma,pahcasi,kat_sayisi) values "
                    + "(" + d.getMetra_kare() + "," + d.getFiyat() + ",'" + d.getAdres()
                    + "','" + d.getEmalk_tipi() + "'," + d.getOda_sayisi() + ",'" + d.getYapi_durumu()
                    + "','" + d.getEsyali() + "','" + d.getIsitma() + "','" + d.getPahcasi() + "'," + d.getKat_sayisi() + ") ");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public void silme(Mustakil_ev d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("delete from Mustakil_ev where id=" + d.getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void guncelme(Mustakil_ev d) {

    }

    public List<Mustakil_ev> okumak() {
        List<Mustakil_ev> list = new ArrayList<>();

        try {
            Statement s = this.getConnect().createStatement();
            ResultSet rs = s.executeQuery("select * from Mustakil_ev order by fiyat asc");

            while (rs.next()) {
                Mustakil_ev temp = new Mustakil_ev(rs.getString("pahcasi"), rs.getInt("kat_sayisi"),
                        rs.getInt("idi"), rs.getInt("metra_kare"), rs.getInt("fiyat"), rs.getString("adres"),
                        rs.getString("emalk_tipi"), rs.getInt("oda_sayisi"), rs.getString("yapi_durumu"),
                        rs.getString("esyali"), rs.getString("isitma"));
                list.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

}
