/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.DaoProducao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Producao;

/**
 *
 * @author temporario
 */
@Named
@ViewScoped
public class ProducaoDiariaControle implements Serializable {
    private Date dia;
    private List<Producao> lista;
    private Double total;
    private DaoProducao daoProducao;
    
    @PostConstruct
    public void inicializar(){
        dia=new Date();
        lista = new ArrayList();
        total=0.0;
        daoProducao= new DaoProducao();
    }
    public void buscarProducaoDiaria(){
        lista=daoProducao.buscarPorData(dia);
        for(Producao p : lista){
            total= total +p.getQuantidade();
        }
    }
    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public List getLista() {
        return lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
}
