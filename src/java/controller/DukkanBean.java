package controller;

import Entity.Dukkan;
import dao.DukkanDao;
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
public class DukkanBean implements Serializable{
    
    private DukkanDao dao;
    private Dukkan entity;

    public DukkanBean() {
    }
    
    public String create(){
        this.getDao().kayıt(entity);
        return "index";
    }
    public List<Dukkan> getRead(){
        return this.getDao().okumak();
    }

    public String UpdateForm(Dukkan c){
        this.entity=c;
        return "Update";
    }
    public String Update(){
        this.getDao().guncelme(entity);
        return "index";
    }
    public void delete(Dukkan d){
        this.getDao().silme(d);
    }
    
    public DukkanDao getDao() {
        return dao;
    }

    public void setDao(DukkanDao dao) {
        this.dao = dao;
    }

    public Dukkan getEntity() {
        return entity;
    }

    public void setEntity(Dukkan entity) {
        this.entity = entity;
    }
    
}
