package controller;

import Entity.Daire;
import dao.DaireDao;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author yusef
 */
@Named
@SessionScoped
public class DaireBean implements Serializable{
    
    private DaireDao dao;
    private Daire entity;

    public DaireBean() {
    }
    
    public String create(){
        this.getDao().kayıt(entity);
        return "index";
    }
    public List<Daire> getRead(){
        return this.getDao().okumak();
    }

    public String UpdateForm(Daire c){
        this.entity=c;
        return "Update";
    }
    public String Update(){
        this.getDao().guncelme(entity);
        return "index";
    }
    public void delete(Daire d){
        this.getDao().silme(d);
    }
    
    public DaireDao getDao() {
        return dao;
    }

    public void setDao(DaireDao dao) {
        this.dao = dao;
    }

    public Daire getEntity() {
        return entity;
    }

    public void setEntity(Daire entity) {
        this.entity = entity;
    }
    
}
