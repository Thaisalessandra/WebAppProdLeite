package controle;

import dao.Dao;
import dao.DaoCavalo;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Cavalo;
import util.Util;



@Named
@ViewScoped
public class GerenciarCavaloControle implements Serializable {
    private Cavalo novoCavalo; 
    private Dao<Cavalo> dao; 
    private List<Cavalo> lista; 
    
    @PostConstruct
    public void inicializar(){
        novoCavalo = new Cavalo();
        dao = new Dao(Cavalo.class);
        lista = dao.listarTodos(); 
    }
    
    public String salvar(){
        boolean existe = new DaoCavalo().jaExiste(novoCavalo.getNome()); 
        if (existe){
            Util.mostrarErro("Cavalo já existe");
            return null; 
        }
        dao.inserir(novoCavalo);
        novoCavalo = new Cavalo();
        Util.mostrarSucesso("Cavalo cadastrado!");
        return null; 
    }
    
    public void excluir(Cavalo excluido){
        dao.excluir(excluido.getId());
        lista = dao.listarTodos(); 
    }

    public Cavalo getNovoCavalo() {
        return novoCavalo;
    }

    public void setNovoCavalo(Cavalo novoCavalo) {
        this.novoCavalo = novoCavalo;
    }

    public List<Cavalo> getLista() {
        return lista;
    }

    public void setLista(List<Cavalo> lista) {
        this.lista = lista;
    }
    
    
    
    
}