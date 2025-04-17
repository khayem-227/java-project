/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.absence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author najar
 */
public class Connexion {
    public Connexion(){
        
    }
    public Connection maConnexion(){
        Connection con=null;
         try {
   Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println(" driver chargé");
}
catch(ClassNotFoundException ex) {
   System.out.print("Error: unable to load driver class!");

}
  try{
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_absence","root","");
   System.out.println("bd  connecté");
  }catch(SQLException e){
      System.out.println("impossible de connecter a la base etudiant");
  } 
return con;
    }

  
  
    }
    
