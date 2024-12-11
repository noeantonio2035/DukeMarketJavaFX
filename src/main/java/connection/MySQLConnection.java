package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *gerencia a conexão com o banco de dados. possui as instruções necessárias
 * para conectar ao banco.
 *
 */
public class MySQLConnection {
    //define strings de conexção com o banco
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://172.16.0.30:3306/nas_dukemarket";
    
    private static final String USER = "noe";
    private static final String PASS = "senai";
    
    //cria conexão com o banco de dados my sql
    //@ return
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        }catch (SQLException ex){
            throw new RuntimeException("Erro na conexão com o banco de dados. verifique!", ex);
        }catch(ClassNotFoundException ex){
            throw new RuntimeException("Falha na carga do driver! ", ex);
        }
    }
    //fecha a conexão com o banco de dados.
    //@param conn Connection a ser fechada.
    public static void closeConnection(Connection conn){
        try{
            if(conn != null){
                conn.close();
            }
        }catch(SQLException ex){
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //fecha a conexão com o banco de dados
    //@param conn conexão
    //@param stmt statement
    public static void closeConnection(Connection conn, PreparedStatement stmt){
        closeConnection(conn);
        try{
            if(stmt != null){
                stmt.close();
            }
        }catch(SQLException ex){
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs){
        try{
            if(rs != null){
                rs.close();
            }
        }catch(SQLException ex){
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

