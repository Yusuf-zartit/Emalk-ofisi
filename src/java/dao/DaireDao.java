package dao;

import Entity.Daire;
import java.sql.Statement;
import util.DB;

/**
 *
 * @author yusef
 */
public class DaireDao extends DB {

    public void kayıt(Daire d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("insert into Daire (metra_kare,fiyat,adres,emalk_tipi,oda_sayisi"
                    + ",yapi_durumu,esyali,isitma,bulundugu_kat,banyo_sayısı) values "
                    + "('" + d.getMetra_kare() + "','" + d.getFiyat() + "','" + d.getAdres()
                    + "','" + d.getEmalk_tipi() + "','" + d.getOda_sayisi() + "','" + d.getYapi_durumu()
                    + "','" + d.getEsyali() + "','" + d.getIsitma() + "','" + d.getBanyo_sayısı() + "','"
                    + d.getBulundugu_kat() + "')");

        } catch (Exception e) {

        }
    }
        public void silme(Daire d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("delete from Daire where id="+d.getId());

        } catch (Exception e) {

        }
    }


}
