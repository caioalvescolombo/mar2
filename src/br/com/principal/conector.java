
package br.com.principal;
import java.sql.*;

import net.proteanit.sql.DbUtils;
    public class conector {
    private Connection con;
    private PreparedStatement stnt;
    private ResultSet rs;
    private final String USER="root";
    private final String PASS="";
    private final String URL="jdbc:mysql://localhost:3306/mar";
    private final String Drive="com.mysql.jdbc.Driver";
    
    public void conectar (){
        try {
            Class.forName(Drive);
            con = DriverManager.getConnection(URL,USER,PASS);
            
        } catch (Exception e) {
            
        }  
        
        
    }
    public void inserirgeral (Geral geral){
        String sql ="insert into tbgeral(nome,ende,tele,cpf,uf,mem,email,empre,bairro,cidade) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            stnt = con.prepareStatement(sql);
            stnt.setString(1,geral.getNome());
            stnt.setString(2,geral.getEndereco());
            stnt.setDouble(3,geral.getTelefone());
            stnt.setDouble(4,geral.getCpf());
            stnt.setString(5,geral.getUf());
            stnt.setString(6,geral.getMembro());
            stnt.setString(7,geral.getEmail());
            stnt.setString(8,geral.getEmpresa());
            stnt.setString(9,geral.getBairro());
            stnt.setString(10,geral.getCidade());
            stnt.execute();      
        } 
        catch (Exception e) {}
    } 
    
    public void inserirevento(Evento evento){
    String sql = "insert into tbevento(nomeeve)values(?)";
        try {
            stnt = con.prepareStatement(sql);
            stnt.setString(1,evento.getNome());
            stnt.execute();
        } catch (Exception e) {
        }
    
    }
    public void inserirparticipante(Geral geral , Evento evento){
    String sql = "insert into tbparticipantes(id,ideve)values(?,?)";
        try {
            stnt = con.prepareStatement(sql);
            stnt.setInt(1,geral.getIdgeral());
            stnt.setInt(2,evento.getIdvento());
            stnt.execute();
        } catch (Exception e) {
        }
    //teste
    }    
    
    public void inserirprofessor(Geral geral){
    String sql = "insert into tbprofessor (id) values(?)";
        try {
            stnt= con.prepareStatement(sql);
            stnt.setInt(1,geral.getIdgeral());
            stnt.execute();
            
        } catch (Exception e) {
        }
    
    }
    }

