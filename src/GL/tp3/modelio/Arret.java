package GL.tp3.modelio;


public class Arret {

    private String heurDepart;

    private String heurArrive;

    public Voyage voyage ;

    public Ville ville ;

    public Arret(String heurDepart, String heurArrive, Ville ville) {
        this.heurDepart = heurDepart;
        this.heurArrive = heurArrive;
        this.ville = ville;
    }
    

    public Arret(String heurDepart, String heurArrive, Voyage voyage, Ville ville) {
        this.heurDepart = heurDepart;
        this.heurArrive = heurArrive;
        this.voyage = voyage;
        this.ville = ville;
    }


    public String getHeurDepart() {
        return heurDepart;
    }

    public void setHeurDepart(String heurDepart) {
        this.heurDepart = heurDepart;
    }

    public String getHeurArrive() {
        return heurArrive;
    }

    public void setHeurArrive(String heurArrive) {
        this.heurArrive = heurArrive;
    }

    public Voyage getVoyage() {
        return voyage;
    }

    public void setVoyage(Voyage voyage) {
        this.voyage = voyage;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return " Arret : heurArrive = " + heurArrive + ", heurDepart = " + heurDepart + ", ville = " + 
        ville + ", voyage = " + voyage + " ";
    }

    

}
