package model;

public class Room {
    private Integer nrOfBeds;
    private Integer floorNumber;
    private Boolean occupied;
    private Float pricePerNight;
    private Integer roomNumber;


    public Room(Integer nrOfBeds, Integer floorNumber, Float pricePerNight, Integer roomNumber) {
        this.nrOfBeds = nrOfBeds;
        this.floorNumber = floorNumber;
        this.pricePerNight = pricePerNight;
        this.roomNumber = roomNumber;
    }

    public Integer getNrOfBeds() {
        return nrOfBeds;
    }

    public void setNrOfBeds(Integer nrOfBeds) {
        this.nrOfBeds = nrOfBeds;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Float getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(Float pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

}
