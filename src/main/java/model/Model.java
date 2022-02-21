package model;

public class Model {
    private Room room;
    private Client client;
    private Reservation reservation;

    public void setInfoAboutClient(String name, String city, String adress, int id) {
        client = new Client(name, city, adress, id);
    }

    public Reservation setInfoAboutReservation(String checkin, int nrOfNights, int nrOfBeds) {
        room = new Room(nrOfBeds, 1, 80f, 1);

        reservation = new Reservation(client, checkin, room);
        reservation.setNrOfNightsAccommodated(nrOfNights);
        return reservation;
    }


}
