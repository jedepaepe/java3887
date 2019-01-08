/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jedepaepe
 */
public class Employe extends Personne {
    private double salaire;

    public Employe(double salaire, String nom) {
        super(nom);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
    /**
     * Exemple de ré-écriture d'une méthode de la classe mère
     * @return 
     */
    // @Override est une annotation au compilateur qui dit
    //      cette méthode ré-écrit une méthode de la classe mère
    //      cette annotation est optionnelle
    @Override
    public String getNom() {
        if(salaire > 5000) {
            return "ghost";
        }
        System.out.println("getNom appelé sur l'employé : " + super.getNom());
        return super.getNom();
    }
    
}
