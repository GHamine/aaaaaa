package GL.tp3.modelio;

import java.util.ArrayList;
import java.util.List;

public class Passager {
    
    public List<Reservation> reservationsList = new ArrayList<Reservation> ();

    public List<Reservation> getReservationsList() {
        return reservationsList;
    }

    public void setReservationsList(List<Reservation> reservationsList) {
        this.reservationsList = reservationsList;
    }

}
