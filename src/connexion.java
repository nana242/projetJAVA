
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class connexion {
    //Chemim pour charger le pilote de mysql.
    String urlpilote="com.mysql.jdbc.Driver";
    //Chemim pour acceder à la base de données
    String urlbaseDonnees="jdbc:mysql://localhost:3306/datastock";
    //On cree un objet de type connection
    java.sql.Connection con;
      public connexion()
{
    //Chargement de notre pilote
    try
    {
       Class.forName(urlpilote);
       System.out.println("Chargement de pilote reussi");
    }
catch(ClassNotFoundException e)
{
    System.out.println(e);
}

    //Connexion à la base de donnees
try
    {
        con=DriverManager.getConnection(urlbaseDonnees, "root", "");
        System.out.println("Connexion avec la base de donnees reussi");
    }
catch(SQLException ex)
{
    System.out.println(ex);
}
}
   
   //On cree une methode qui va nous retourner cette connexion
  public java.sql.Connection ObtenirConnexion()
  {
      return con;
    
}
}
