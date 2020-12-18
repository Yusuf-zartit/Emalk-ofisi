package dao;

import Entity.Daire;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DB;

/**
 *
 * @author yusef
 */
public class DaireDao extends DB {

    public void kayıt(Daire d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("insert into Daire (metra_kare,fiyat,adres,emalk_tipi,oda_sayisi,yapi_durumu,esyali"
                    + ",isitma,bulundugu_kat,banyo_sayisi) values "
                    + "(" + d.getMetra_kare() + "," + d.getFiyat() + ",'" + d.getAdres()
                    + "','" + d.getEmalk_tipi() + "'," + d.getOda_sayisi() + ",'" + d.getYapi_durumu()
                    + "','" + d.getEsyali() + "','" + d.getIsitma() + "','" + d.getBulundugu_kat() + "',"+ d.getBanyo_sayısı()+") ");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
        public void silme(Daire d) {
        try {
            Statement s = this.getConnect().createStatement();
            s.executeUpdate("delete from Daire where id="+d.getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        public void guncelme(Daire d){
            
        }
        public List<Daire> okumak(){
            List<Daire> list=new ArrayList<>();
            
            try{
                Statement s=this.getConnect().createStatement();
                ResultSet rs=s.executeQuery("select * from Daire order by fiyat asc");
                
                while(rs.next()){
                    Daire temp=new Daire( rs.getString("bulundugu_kat"),rs.getInt("banyo_sayısı"),
                            rs.getInt("idi"), rs.getInt("metra_kare"),  rs.getInt("fiyat"), rs.getString("adres"),
                            rs.getString("emalk_tipi"), rs.getInt("oda_sayisi"), rs.getString("yapi_durumu"),
                            rs.getString("esyali"),rs.getString("isitma"));
                    list.add(temp);
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            
            return list;
        }


}
