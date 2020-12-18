package controller;

import Entity.Bos_arsa;
import dao.Bos_arsaDao;
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
public class Bos_arsaBean implements Serializable{
    
    private Bos_arsaDao dao;
    private Bos_arsa entity;

    public Bos_arsaBean() {
    }
    
    public String create(){
        this.getDao().kayıt(entity);
        return "index";
    }
    public List<Bos_arsa> getRead(){
        return this.getDao().okumak();
    }

    public String UpdateForm(Bos_arsa c){
        this.entity=c;
        return "Update";
    }
    public String Update(){
        this.getDao().guncelme(entity);
        return "index";
    }
    public void delete(Bos_arsa d){
        this.getDao().silme(d);
    }
    
    public Bos_arsaDao getDao() {
        return dao;
    }

    public void setDao(Bos_arsaDao dao) {
        this.dao = dao;
    }

    public Bos_arsa getEntity() {
        return entity;
    }

    public void setEntity(Bos_arsa entity) {
        this.entity = entity;
    }
    
}

