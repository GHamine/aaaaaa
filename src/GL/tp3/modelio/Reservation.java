package GL.tp3.modelio;

public class Reservation {

    public Voyage voyage ;

    public Passager passager ;

    public Client client ;
    
    public Reservation(Voyage voyage, Passager passager, Client client) {
        this.voyage = voyage;
        this.client = client;
        this.passager = passager;
    }

    public Reservation(Voyage voyage) {
        this.voyage = voyage;
    }

    public Voyage getVoyage() {
        return voyage;
    }

    public void setVoyage(Voyage voyage) {
        this.voyage = voyage;
    }

    public Passager getPassager() {
        return passager;
    }

    public void setPassager(Passager passager) {
        this.passager = passager;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "\n Reservation : \n\t " + client.toString()  + " \n\t " + voyage.toString() + " ";
    }
    

}
