package GL.tp3.modelio;

import java.util.ArrayList;
import java.util.List;

public class Voyage {

    private int id;
    
    public Ville depart;

    public Ville arrive;

    private String dateDepart;

    private String heurDepart;

    private String dateArrive;

    private String heurArrive;
    
    public List<Arret> arretsList = new ArrayList<Arret> ();

    public List<Reservation> reservationsList = new ArrayList<Reservation> ();

    public List<Agence> agencesList = new ArrayList<Agence> ();

    private Boolean ouvert = true;
    

    public Voyage(int id, Ville depart, Ville arrive, List<Arret> arretsList, 
        String dateDepart, String heurDepart, String dateArrive, String heurArrive ) {

        this.id = id;
        this.depart = depart;
        this.arrive = arrive;
        this.dateDepart = dateDepart;
        this.heurDepart = heurDepart;
        this.dateArrive = dateArrive;
        this.heurArrive = heurArrive;
        this.arretsList = arretsList;
        
        for (Arret arret : arretsList) {
            arret.voyage = this;
        }
    }


    public boolean checkStat() {
        return ouvert;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Arret> getArretsList() {
        return arretsList;
    }

    public void setArretsList(List<Arret> arretsList) {
        this.arretsList = arretsList;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getHeurDepart() {
        return heurDepart;
    }

    public void setHeurDepart(String heurDepart) {
        this.heurDepart = heurDepart;
    }

    public String getDateArrive() {
        return dateArrive;
    }

    public void setDateArrive(String dateArrive) {
        this.dateArrive = dateArrive;
    }

    public String getHeurArrive() {
        return heurArrive;
    }

    public void setHeurArrive(String heurArrive) {
        this.heurArrive = heurArrive;
    }

    public List<Reservation> getReservationsList() {
        return reservationsList;
    }

    public void setReservationsList(List<Reservation> reservationsList) {
        this.reservationsList = reservationsList;
    }    
    public void setReservationsList(List<Reservation> reservationsList ,Reservation res) {
        reservationsList.add( res );
        this.reservationsList = reservationsList;
    }

    public List<Agence> getAgencesList() {
        return agencesList;
    }

    public void setAgencesList(List<Agence> agencesList) {
        this.agencesList = agencesList;
    }

    public List<Arret> getArret() {
        return arretsList;
    }

    public void setArret(List<Arret> arret) {
        this.arretsList = arret;
    }

    public Ville getArrive() {
        return arrive;
    }

    public void setArrive(Ville arrive) {
        this.arrive = arrive;
    }

    public Ville getDepart() {
        return depart;
    }

    public void setDepart(Ville depart) {
        this.depart = depart;
    }


    public Boolean getOuvert() {
        return ouvert;
    }



    public void setOuvert(Boolean ouvert) {
        this.ouvert = ouvert;
    }


    @Override
    public String toString() {
        return " Voyage : idVoyage =" + id + ", depart ="+ depart  + ",arrive = " + arrive
                + ", dateArrive = " + dateArrive + ", dateDepart = " + dateDepart + ", heurArrive = "
                + heurArrive + ", heurDepart = " + heurDepart +  ", ouvert = " + ouvert + "]";
    }



    
}
