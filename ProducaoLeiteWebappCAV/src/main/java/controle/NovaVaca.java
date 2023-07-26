/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import dao.Dao;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Vaca;

/**
 *
 * @author temporario
 */
@Named
@ViewScoped
public class NovaVaca implements Serializable {
    private Vaca usuario;
    private Dao<Vaca> dao;

    public NovaVaca() {
        usuario= new Vaca();
        dao= new Dao(Vaca.class);
    }
    public void salvar(){
        dao.inserir(usuario);
    }
    public Vaca getUsuario() {
        return usuario;
    }

    public void setUsuario(Vaca vaca) {
        this.usuario = usuario;
    }
    
    
    
    
}
