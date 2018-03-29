
package school1.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SCHOOL10 {

  
       Connection con;
public SCHOOL10(){
    try{
        Class.forName("com.mysql.jdbc.Driver");}
    catch(ClassNotFoundException e){
                                    System.err.println(e);
    }
    try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_ecole","root","");
    }catch(SQLException e){
                            System.err.println(e);
    }
    }
    Connection obtenirconnexion(){return con;}

    }
    