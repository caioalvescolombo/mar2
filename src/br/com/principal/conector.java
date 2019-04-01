
package br.com.principal;
import java.sql.*;
    public class conector {
    private Connection con;
    private PreparedStatement stnt;
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
    
    public void alterargeral(Geral geral){
        String sql ="update tbmembros set nomemem=?,endmem=?,telemem=?,cpfmem=?,ufmem=?,resmem=?,emailmem=?,empremem=?,bairromem=?,cidademem=? where idmem=?";
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
        } catch (Exception e) {
        }
    }
    
    public void inseriraluno(Geral geral, Aluno aluno,Professor professor, Turma turma){
    String sql="insert into tbaluno(regialu,imgalu,idmem,idtur)values(?,?,?,?)";
        try {
            stnt = con.prepareStatement(sql);
            stnt.setDouble(1,aluno.getRegistro());
            //stnt.setByte(2,aluno.getImagem());
            stnt.setInt(3,geral.getIdgeral());
            stnt.setInt(4,turma.getIdturma());
            stnt.execute();
        } catch (Exception e) {
        }
    
    }
     
    public void alteraraluno(Geral geral, Aluno aluno,Professor professor, Turma turma){
    String sql="update tbaluno set regialu=?,imgalu=?,idmem=?,idtur=?";
    
        try {
            stnt= con.prepareStatement(sql);
            stnt.setDouble(1,aluno.getRegistro());
           // stnt.setByte(2,aluno.getImagem());
            stnt.setInt(3,geral.getIdgeral());
            stnt.setInt(4,turma.getIdturma());
            stnt.execute();
        } catch (Exception e) {
        }
    
    }
    
}

