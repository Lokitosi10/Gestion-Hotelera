package DAO;

import java.sql.*;

import Data.DBConnection;
import Logic.Person;

/**
 *
 * @author Julian Sanchez
 */

public class PersonDAO {
    
    private DBConnection connection;
    private Person person;

    /*Constructor*/
    public PersonDAO() {    
        connection = new DBConnection();
        person = new Person();
    }
    
    /*Setters*/
    public void setPerson(Person person) {
        this.person = person;
    }
    
    /*Getters*/
    public String getMessage() {
        return connection.getMessage();
    }
    
    public Person getPerson(){
        return person;
    }
    
    public ResultSet getPersonByID (int id, String type) throws SQLException {
        PreparedStatement pState = connection.getConnection().prepareStatement("SELECT k_numeroid, k_tipo, n_nombre1, " 
            +"n_nombre2, n_apellido1, n_apellido2  FROM persona WHERE k_numeroid = ? AND k_tipo = ?" );
        
        pState.setInt(1, id); 
        pState.setString(2, type);
        ResultSet res = pState.executeQuery();
        return res;
    }
    
    /* CRUD */
    public void insertPerson() {
      try {
      
        PreparedStatement pState = connection.getConnection().prepareStatement("INSERT INTO persona (k_numeroid, k_tipo, n_nombre1, "
            + "n_nombre2, n_apellido1, n_apellido2 ) values(?,?,?,?,?,?)");
        
            pState.setInt(1, person.getK_numeroid());
            pState.setString(2, person.getK_tipo());
            pState.setString(3, person.getN_nombre1());
            pState.setString(4, person.getN_nombre2());
            pState.setString(5, person.getN_apellido1());
            pState.setString(6, person.getN_apellido2());
            
            pState.executeUpdate();
      } catch (SQLException e) {
          System.out.println("ERROR: " + e);
      }
    }
    
    public void updatePerson() {
        try {
            PreparedStatement pState = connection.getConnection().prepareStatement("UPDATE persona SET  n_nombre1 = ?, n_nombre2 = ?,"
                + "n_apellido1 = ?, n_apellido2 = ? WHERE k_numeroid = ? AND k_tipo = ?" );
            
            pState.setString(1, person.getN_nombre1());
            pState.setString(2, person.getN_nombre2());
            pState.setString(3, person.getN_apellido1());
            pState.setString(4, person.getN_apellido2());
            
            /* Llave compuesta */
            pState.setInt(5, person.getK_numeroid());
            pState.setString(6, person.getK_tipo());
            
            pState.executeUpdate();

        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
        }
    }
    
    public void deletePerson() {}
}