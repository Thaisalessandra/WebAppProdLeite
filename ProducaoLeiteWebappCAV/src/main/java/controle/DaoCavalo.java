package controle;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import modelo.Cavalo;
import util.JpaUtil;

/**
 *
 * 
 * Métodos adicionais específicos de Usuario que não existem na classe genérica Dao.java
 */

public class DaoCavalo implements Serializable{
    EntityManager manager;
    
 
    public boolean jaExiste(String nome) {
        Cavalo temp = null;
        boolean existe = false; 
        manager = JpaUtil.getEntityManager();
        String sql = "SELECT v FROM Cavalo v WHERE v.nome = :nome";
        TypedQuery<Cavalo> query = manager.createQuery(sql, Cavalo.class);
        query.setParameter("nome", nome);
        try {
            temp = query.getSingleResult();
            existe = true; 
        } catch (Exception e) {  
            temp = null; 
        } finally {
            manager.close();
        }
        return existe;
    }
    public Cavalo buscarPorNome(String nome){
     EntityManager manager = JpaUtil.getEntityManager();
        TypedQuery<Cavalo> query = 
                (TypedQuery<Cavalo>) manager.createQuery("SELECT v FROM Cavalo v WHERE v.nome = :nome ");
        query.setParameter("nome", nome);
        try {
            if (query.getSingleResult() != null) {
                return query.getSingleResult();
            } else {
                return null;
            }
        } catch (NoResultException e) {
            return null;
        } 
    }

  
}