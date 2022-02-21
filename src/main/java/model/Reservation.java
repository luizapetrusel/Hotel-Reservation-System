package model;

public class Reservation {
    private Client client;
    private Employee employee; //the employee that made the reservation
    private String checkInDate;
    private Room room;
    private Integer nrOfNightsAccommodated;


    public Reservation(Client client, String period, Room room) {
        this.client = client;
        this.checkInDate = period;
        this.room = room;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getPeriod() {
        return checkInDate;
    }

    public void setPeriod(String period) {
        this.checkInDate = period;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Integer getNrOfNightsAccommodated() {
        return nrOfNightsAccommodated;
    }

    public void setNrOfNightsAccommodated(Integer nrOfNightsAccommodated) {
        this.nrOfNightsAccommodated = nrOfNightsAccommodated;
    }

    public Float calculateBill() {
        return this.room.getPricePerNight() * this.getNrOfNightsAccommodated();
    }

    public void tellPrice() {
        System.out.println(calculateBill());
    }

}
