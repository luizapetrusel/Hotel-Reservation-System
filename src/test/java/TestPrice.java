import model.Client;
import model.Reservation;
import model.Room;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPrice {

    @Test
    public void TestPrice(){
        Room room=new Room(2,1,80f,1);
        Client client=new Client("Petrusel","Cluj","Republicii",1234);
        Reservation r=new Reservation(client,"20-05-2021",room);
        r.setNrOfNightsAccommodated(5);

        assertEquals(400f,r.calculateBill());

    }
}
