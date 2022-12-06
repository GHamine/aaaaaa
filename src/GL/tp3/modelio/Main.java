package GL.tp3.modelio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
        
    public static void main(String[] args) {

        Ville ville1 = new Ville("Alger");
        Ville ville2 = new Ville("Biskra");
        Ville ville3 = new Ville("Tebessa");
        Ville ville4 = new Ville("Mila");
        Ville ville5 = new Ville("Laghouat");

        List<Arret> arretsList1 = new ArrayList<Arret> ();
        arretsList1.add( new Arret( "00:00", "03:00", ville3) ) ;
        arretsList1.add( new Arret( "04:00", "05:00", ville4) ) ;
        arretsList1.add( new Arret( "07:00", "09:00", ville5) ) ;

        Agence agence1 = new Agence("agence999", "Biskra,Biskra", "0699999999");

        Client client1 = new Client( 1, "Gherbi", "0987654321" );
        agence1.ajouterClient(client1);

        agence1.ajouterClient( new Client( 2, "Mohammed", "0987654321" ) );

        Client client3 = new Client( 3, "Amine", "0987654321" );
        agence1.ajouterClient(client3);

        agence1.ajouterClient( 4, "abcdefg", "0987654321");

        Voyage voyage1 = new Voyage( 1, ville1, ville2, arretsList1, "06-12-2022", "00:00", "06-13-2022", "12:00");
        agence1.ajouterVoyage( voyage1);

        Voyage voyage2 = new Voyage( 2, ville2, ville3, arretsList1, "06-12-2022", "00:00", "06-13-2022", "12:00");
        agence1.ajouterVoyage( voyage2 );

        if (voyage1.checkStat() == true ) {
            client1.reserve(voyage1, null);
            voyage1.setOuvert(false);
        }
        if (voyage1.checkStat() == true ) {
            client3.reserve(voyage1, null);
            voyage1.setOuvert(false);
        }
        if (voyage2.checkStat() == true ) {
            client3.reserve(voyage2, null);
            voyage2.setOuvert(false);
        }


        System.out.println(agence1);
        System.out.println("-------------------------------------------------------");
        for (Client client : agence1.getClientsList() ) {
            System.out.println(client);
        }
        System.out.println("-------------------------------------------------------");
        for (Voyage voyage : agence1.getVoyagesList() ) {
            System.out.println(voyage);
        }

        System.out.println("-------------------------------------------------------");
        for (Client client : agence1.getClientsList() ) {
            for (Reservation reservation : client.getReservationsList() ) {
                System.out.println(reservation);
            }
        }

        
    }
}
