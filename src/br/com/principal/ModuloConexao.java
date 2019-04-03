
package br.com.principal;
import java.sql.*;
public class ModuloConexao {
        public static Connection conectar (){
        java.sql.Connection conexao = null;
        String USER="root";
        String PASS="";
        String URL="jdbc:mysql://localhost:3306/mar";
        String Drive="com.mysql.jdbc.Driver";
        
        try {
            Class.forName(Drive);
            conexao = DriverManager.getConnection(URL,USER,PASS);
            return conexao;
        } catch (Exception e) {
            return null;
        }  
    }
}

        
    

