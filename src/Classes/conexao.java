package  Classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexao{
public Connection con;
public ResultSet resultset;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/dbstandcar";
    private static final String USER = "root";
    private static final String PASS = "";

    public Connection getConnection() {
        try {
            Class.forName(DRIVER);

            con =DriverManager.getConnection(URL , USER, PASS);

        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro de coneção: ", ex);
            
        }
        return con;
    }
    
    
    
    

    public void closeConnection() {
       
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao Desconectar a base de dados");
            }

        
    }
     
    }
    

