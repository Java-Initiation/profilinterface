package models;

import interfaces.IPersonne;

import java.util.Date;

public class Personne implements IPersonne {

    private int id;
    private String nom, prenom;
    private Date dateNaissance;
    private double salaire;
    private Profil profil;

    @Override
    public void affiche() {
    }

    @Override
    public double calculerSalaire() {
        return salaire;
    }

}
