package dao;

import Entity.Dukkan;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DB;

/**
 *
 * @author yusef
 */
public class DukkanDao extends DB {

    public void kayıt(Dukkan d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("insert into Dukkan (takas,aciklama,isitma,esyali, bina_yasi, id,metra_kare,fiyat,adres,emalk_tipi) values "
                    + "('" + d.getTakas() + "','" + d.getAciklama() + "','" + d.getIsitma()
                    + "','" + d.getEsyali() + "','" + d.getBina_yasi() + "'," + d.getId()
                    + "," + d.getMetra_kare() + "," + d.getFiyat() + ",'" + d.getAdres() + "','" + d.getEmalk_tipi() + "') ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void silme(Dukkan d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("delete from Dukkan where id=" + d.getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void guncelme(Dukkan d) {

    }

    public List<Dukkan> okumak() {
        List<Dukkan> list = new ArrayList<>();

        try {
            Statement s = this.getConnect().createStatement();
            ResultSet rs = s.executeQuery("select * from Dukkan order by fiyat asc");

            while (rs.next()) {
                Dukkan temp = new Dukkan(rs.getString("takas"), rs.getString("aciklama"), rs.getString("isitma"),
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
