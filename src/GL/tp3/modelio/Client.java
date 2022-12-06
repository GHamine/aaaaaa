package GL.tp3.modelio;

import java.util.ArrayList;
import java.util.List;

public class Client {
    
    private int idClient;

    private String nomClient;

    private String numTelClient;

    public List<Reservation> reservationsList = new ArrayList<Reservation> ();

    public List<Agence> agencesList = new ArrayList<Agence> ();

    Reservation res ;

    public Client(int idClient, String nomClient, String numTelClient) {
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.numTelClient = numTelClient;
    }

    public void reserve( Voyage voyage, Passager passager) {
        
        res = new Reservation( voyage , passager, this  );
        reservationsList.add( res );
        voyage.setReservationsList( voyage.getReservationsList() , res );
    }

    public void confirmer() {
        
    }

    public void annuler() {
        reservationsList.remove( res );
    }

    public int getId() {
        return idClient;
    }

    public void setId(int id) {
        this.idClient = id;
    }

    public String getNom() {
        return nomClient;
    }

    public void setNom(String nom) {
        this.nomClient = nom;
    }

    public String getNumTel() {
        return numTelClient;
    }

    public void setNumTel(String numTel) {
        this.numTelClient = numTel;
    }

    public List<Reservation> getReservationsList() {
        return reservationsList;
    }

    public void setReservationsList(List<Reservation> reservationsList) {
        this.reservationsList = reservationsList;
    }

    public List<Agence> getAgencesList() {
        return agencesList;
    }

    public void setAgencesList(List<Agence> agencesList) {
        this.agencesList = agencesList;
    }

    @Override
    public String toString() {
        return " Client : idClient = " + idClient + ", nomClient = " + nomClient
                + ", numTelClient = " + numTelClient + " ";
    }

    

}
