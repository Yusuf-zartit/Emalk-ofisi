package controller;

import Entity.Tara;
import dao.TaraDao;
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
public class TaraBean implements Serializable{
    
    private TaraDao dao;
    private Tara entity;

    public TaraBean() {
    }
    
    public String create(){
        this.getDao().kayıt(entity);
        return "index";
    }
    public List<Tara> getRead(){
        return this.getDao().okumak();
    }

    public String UpdateForm(Tara c){
        this.entity=c;
        return "Update";
    }
    public String Update(){
        this.getDao().guncelme(entity);
        return "index";
    }
    public void delete(Tara d){
        this.getDao().silme(d);
    }
    
    public TaraDao getDao() {
        return dao;
    }

    public void setDao(TaraDao dao) {
        this.dao = dao;
    }

    public Tara getEntity() {
        return entity;
    }

    public void setEntity(Tara entity) {
        this.entity = entity;
    }
    
}
