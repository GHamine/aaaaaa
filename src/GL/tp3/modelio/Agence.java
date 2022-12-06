package GL.tp3.modelio;

import java.util.ArrayList;
import java.util.List;

public class Agence {
    
    private String nomAgence;

    private String adresseAgence;

    private String numTelAgence;

    public List<Client> clientsList = new ArrayList<Client> ();

    public List<Voyage> voyagesList = new ArrayList<Voyage> ();

    public Agence(String nomAgence, String adresseAgence, String numTelAgence) {
        this.nomAgence = nomAgence;
        this.adresseAgence = adresseAgence;
        this.numTelAgence = numTelAgence;
    }

    public void ajouterClient(int idClient, String nomClient, String numTelClient) {

        clientsList.add(  
            new Client(idClient, nomClient, numTelClient)
        );

    }

    public void ajouterClient( Client client ) {

        clientsList.add(  client  );

    }

    public void ajouterVoyage( 
        int id, Ville depart, Ville arrive, List<Arret> arretsList,
        String dateDepart, String heurDepart, String dateArrive, String heurArrive ) {

        voyagesList.add( 
            new Voyage(id, depart, arrive, arretsList,
            dateDepart, heurDepart, dateArrive, heurArrive)
        );

    }

    public void ajouterVoyage( Voyage voyage ) {

        voyagesList.add( voyage );
    }

    public Client rechercheClient (String nomClient) {
        
        for (Client client : clientsList) {

            if ( client.getNom() == nomClient ) {
                return client;
            }
        }
        return null;
    }

    public Voyage rechercheVoyage ( int id) {

        for (Voyage voyage : voyagesList) {
            
            if ( voyage.getId() == id ) {
                return voyage;
            }
        }
        return null;
    }

    public boolean checkVoyage(Voyage voyage) {
 
        return voyage.getOuvert();
    }




    public String getNom() {
        return nomAgence;
    }

    public void setNom(String nom) {
        this.nomAgence = nom;
    }

    public String getAdresse() {
        return adresseAgence;
    }

    public void setAdresse(String adresse) {
        this.adresseAgence = adresse;
    }

    public String getNumTel() {
        return numTelAgence;
    }

    public void setNumTel(String numTel) {
        this.numTelAgence = numTel;
    }

    public List<Client> getClientsList() {
        return clientsList;
    }

    public void setClientsList(List<Client> clientsList) {
        this.clientsList = clientsList;
    }

    public List<Voyage> getVoyagesList() {
        return voyagesList;
    }

    public void setVoyagesList(List<Voyage> voyagesList) {
        this.voyagesList = voyagesList;
    }

    public String getNomAgence() {
        return nomAgence;
    }

    public void setNomAgence(String nomAgence) {
        this.nomAgence = nomAgence;
    }

    public String getAdresseAgence() {
        return adresseAgence;
    }

    public void setAdresseAgence(String adresseAgence) {
        this.adresseAgence = adresseAgence;
    }

    public String getNumTelAgence() {
        return numTelAgence;
    }

    public void setNumTelAgence(String numTelAgence) {
        this.numTelAgence = numTelAgence;
    }

    @Override
    public String toString() {
        return " Agence : nomAgence = " + nomAgence+ ", adresseAgence =" + adresseAgence 
                + ", numTelAgence = " + numTelAgence + " ";
    }


}
