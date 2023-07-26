/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import dao.Dao;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Cavalo;


/**
 *
 * @author temporario
 */
@Named
@ViewScoped
public class NovoCavalo implements Serializable {
    private Cavalo cavalo;
    private Dao<Cavalo> dao;

    public NovoCavalo() {
        cavalo= new Cavalo();
        dao= new Dao(Cavalo.class);
    }
    public void salvar(){
        dao.inserir(cavalo);
    }
    public Cavalo getUsuario() {
        return cavalo;
    }

    public void setUsuario(Cavalo cavalo) {
        this.cavalo = cavalo;
    }
    
    
    
    
}
