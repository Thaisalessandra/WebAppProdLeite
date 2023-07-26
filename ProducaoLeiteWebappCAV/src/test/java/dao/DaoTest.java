///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package dao;
//
//import java.util.Date;
//import java.util.List;
//import javax.xml.crypto.Data;
//import modelo.Producao;
//import modelo.Usuario;
//import modelo.Vaca;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
///**
// *
// * @author temporario
// */
//public class DaoTest {
//    
//    public DaoTest() {
//    }
//    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }
////     @Test
////   public void testInserirUsuario() {
////       Usuario novo = new Usuario();
////       novo.setNome("Thais alessandra");
////        novo.setLogin("Thaiss");
////        novo.setSenha("12346");
////        Dao<Usuario> dao = new Dao(Usuario.class);
////        dao.inserir(novo);
////    }
//    
////    @Test
////    public void testListarUsuarios(){
////        Dao<Usuario> dao = new Dao(Usuario.class); 
////        List<Usuario> lista = dao.listarTodos(); 
////        for(Usuario u : lista){
////            System.out.println("Nome: " + u.getNome());
////       }
////    }
////
////
////    @Test
////    public void testInserirUsuario(){
////        Usuario novo = new Usuario();
////        novo.setNome("Thss");
////        novo.setLogin("taaysalessand");
////        novo.setSenha("1");
////        Dao<Usuario> dao= new Dao(Usuario.class);
////        dao.inserir(novo);
////        
////        
////    }
////    @Test
////    public void testInserirUsuario(){
////        Usuario novo = new Usuario();
////        novo.setNome("Caio");
////        novo.setLogin("taaysalessand");
////        novo.setSenha("123456");
////        Dao<Usuario> dao= new Dao(Usuario.class);
////        dao.inserir(novo);
////        
////        
////    }
////    @Test
////    public void testListarUsuario(){
////        Dao<Usuario> dao = new Dao(Usuario.class);
////        List<Usuario> lista = dao.listarTodos();
////        for(Usuario u: lista){
////            System.out.println("Nome:"+ u.getNome());
////        }
////    }}
////    @Test
////    public void testInserirVaca(){
////        Vaca vacanew = new Vaca();
////        vacanew.setNome("mumuzinha");
////        vacanew.setRaca("Isadora");
////        Dao<Vaca> dao= new Dao(Vaca.class);
////        dao.inserir(vacanew);
////    }
////    @Test
////    public void testListarVacas(){
////        Dao<Vaca> dao = new Dao(Vaca.class);
////        List<Vaca> lista = dao.listarTodos();
////        for(Vaca u: lista){
////            System.out.println("Nome:"+ u.getNome());
////        }
////    }
////    @Test
////    public void testProducao(){
////        Dao<Vaca> daoVaca = new Dao(Vaca.class);
////        Vaca vaca = daoVaca.buscarPorCodigo(1);
////        
////        Producao producao = new Producao();
////        producao.setDataProducao(new Date());
////        producao.setVaca(vaca);
////        producao.setQuantidade(7.0);
////        Dao<Producao> daoProducao = new Dao(Producao.class);
////        daoProducao.inserir(producao);
////        
////    }
//    }
