/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testunitaire;

/**
 *
 * @author itu
 */
public class Personne {

    private int idpersonne;
    private String nom;
    private String prenom;

    public Personne() {
    }

    public int getIdpersonne() {
        return idpersonne;
    }

    public void setIdpersonne(int idpersonne) {
        this.idpersonne = idpersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCol() {
        String args = "'" + nom + "','" + prenom + "'";
        return args;
    }
    public String getValue() {
        String valC = "nom,prenom";
        return valC;
    }
     public String Update()
	{
		return "prenom='"+prenom+"'";
	}

}
