package GL.tp3.modelio;

import java.util.ArrayList;
import java.util.List;

public class Ville {
    
    private String nomVille;

    public List<Arret> arretsList = new ArrayList<Arret> ();

    public List<Voyage> voyageDepartList = new ArrayList<Voyage> ();

    public List<Voyage> voyageArriveList = new ArrayList<Voyage> ();


    public Ville(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public List<Arret> getArretsList() {
        return arretsList;
    }

    public void setArretsList(List<Arret> arretsList) {
        this.arretsList = arretsList;
    }

    public List<Voyage> getVoyageDepartList() {
        return voyageDepartList;
    }

    public void setVoyageDepartList(List<Voyage> voyageDepartList) {
        this.voyageDepartList = voyageDepartList;
    }

    public List<Voyage> getVoyageArriveList() {
        return voyageArriveList;
    }

    public void setVoyageArriveList(List<Voyage> voyageArriveList) {
        this.voyageArriveList = voyageArriveList;
    }

    @Override
    public String toString() {
        return " Ville = " + nomVille + "  ";
    }



}
