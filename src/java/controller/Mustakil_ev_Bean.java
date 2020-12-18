package controller;

import Entity.Mustakil_ev;
import dao.Mustakil_ev_Dao;
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

public class Mustakil_ev_Bean implements Serializable {

    private Mustakil_ev_Dao dao;
    private Mustakil_ev entity;

    public Mustakil_ev_Bean() {
    }

    public String create() {
        this.getDao().kayıt(entity);
        return "index";
    }

    public List<Mustakil_ev> getRead() {
        return this.getDao().okumak();
    }

    public String UpdateForm(Mustakil_ev c) {
        this.entity = c;
        return "Update";
    }

    public String Update() {
        this.getDao().guncelme(entity);
        return "index";
    }

    public void delete(Mustakil_ev d) {
        this.getDao().silme(d);
    }

    public Mustakil_ev_Dao getDao() {
        return dao;
    }

    public void setDao(Mustakil_ev_Dao dao) {
        this.dao = dao;
    }

    public Mustakil_ev getEntity() {
        return entity;
    }

    public void setEntity(Mustakil_ev entity) {
        this.entity = entity;
    }

}
