package controller;

import Entity.Ofis;
import dao.OfisDao;
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
public class OfisBean implements Serializable{
    
    private OfisDao dao;
    private Ofis entity;

    public OfisBean() {
    }
    
    public String create(){
        this.getDao().kayıt(entity);
        return "index";
    }
    public List<Ofis> getRead(){
        return this.getDao().okumak();
    }

    public String UpdateForm(Ofis c){
        this.entity=c;
        return "Update";
    }
    public String Update(){
        this.getDao().guncelme(entity);
        return "index";
    }
    public void delete(Ofis d){
        this.getDao().silme(d);
    }
    
    public OfisDao getDao() {
        return dao;
    }

    public void setDao(OfisDao dao) {
        this.dao = dao;
    }

    public Ofis getEntity() {
        return entity;
    }

    public void setEntity(Ofis entity) {
        this.entity = entity;
    }
    
}
