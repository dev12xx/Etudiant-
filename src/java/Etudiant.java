public class Etudiant {
    private String nom;
    private double nombre1; 
    private double nombre2;
    
    public Etudiant(String nom, double nombre1, double nombre2) {
        this.nom = nom;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }
    
 
    public String getNom() {
        return nom;
    }
    
    public double getNombre1() {
        return nombre1;
    }
    
    public double getNombre2() {
        return nombre2;
    }
    
    
    public double calculerMoyenne() {
        return (nombre1 + nombre2) / 2.0;
    }
}