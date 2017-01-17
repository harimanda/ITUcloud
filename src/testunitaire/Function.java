package testunitaire;

import connexion.ConnectBase;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Function {

    ConnectBase con = new ConnectBase();
    Connection c = con.connect();
    ResultSet resultats = null;
    Statement stmt = null;

    public int insertToTable(Object o, String nomTable) throws Exception {
        c = con.connect();
        int status = 0;
        Method met = o.getClass().getMethod("getCol");
        String valCol = (String) met.invoke(o, null);
        Method met1 = o.getClass().getMethod("getValue");
        String valueCol = (String) met1.invoke(o, null);
        String requete = "INSERT INTO " + nomTable + "( " + valueCol + ") VALUES (" + valCol + ")";
        try {

            stmt = c.createStatement();
            stmt.executeUpdate(requete);
            status = 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return status;
    }
     public boolean verifEmploye(String employe){
          
         boolean bool=false; 
             try
              {
                Statement stm = c.createStatement ();
                ResultSet rs = stm.executeQuery("select idpersonne from personne where nom = '"+employe+"'");
                while(rs.next()){
                    if(rs.getString("idpersonne")!=null){
                        bool = true;
                    }
                    else{
                        bool = false;
                    }
                }
               }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
             return bool;
    }
    public int updateToTable(Object o, String nomTable, String[] nomColFiltre, String[][] filtre) throws Exception {
        String where = "";
        c = con.connect();
        int status = 0;
        Method met = o.getClass().getMethod("Update");
        String valCol = (String) met.invoke(o, null);
        String requete = "UPDATE " + nomTable + " SET " + valCol + " " + where;
        for (int i = 0; i < nomColFiltre.length; i++) {
            where = " WHERE ";
            where += nomColFiltre[i] + filtre[0][i] + filtre[1][i];
            if (i != nomColFiltre.length - 1) {
                where = where + " AND ";
            }
        }
        requete = requete + where;
        
        try {
            stmt = c.createStatement();            
            stmt.executeUpdate(requete);
            String comm = "commit";
            stmt.executeUpdate(comm);
            c.close();
            status = 1;

            //resultats.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

}
