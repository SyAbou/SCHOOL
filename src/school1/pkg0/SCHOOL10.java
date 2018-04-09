
package school1.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SCHOOL10 {

  
       Connection conect;
public SCHOOL10(){
    try{
        Class.forName("com.mysql.jdbc.Driver");}
    catch(ClassNotFoundException e1){
                                    System.err.println(e1);
    }
    try{
        conect=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_ecole","root","");
    }catch(SQLException e1){
                            System.err.println(e1);
    }
    }
    Connection obtenirconnexion(){return conect;}

    }
    