package model;

import java.util.ArrayList;

public class Hotel implements HotelChain {
    private String name;
    private String location;
    private Integer nrOfStars;
    private Manager manager;
    private JobSeeker employees;
    private Integer nrOf2BedRooms; //number of rooms with 2 beds
    private Integer nrOf3BedRooms; //number of rooms with 3 beds

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setEmployees(JobSeeker employees) {
        this.employees = employees;
    }

    //methods from interface HotelChain
    public String getHotelName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getNrOfStars() {
        return this.nrOfStars;
    }

    public void setNrOfStars(Integer nrOfStars) {
        this.nrOfStars = nrOfStars;
    }

    public Integer getNrOf2BedRooms() {
        return nrOf2BedRooms;
    }

    public void setNrOf2BedRooms(Integer nrOf2BedRooms) {
        this.nrOf2BedRooms = nrOf2BedRooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNrOf3BedRooms() {
        return nrOf3BedRooms;
    }

    public void setNrOf3BedRooms(Integer nrOf3BedRooms) {
        this.nrOf3BedRooms = nrOf3BedRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", nrOfStars=" + nrOfStars +
                ", manager=" + manager.getName() +
                ", employees=" + employees +
                ", nrOf2BedRooms=" + nrOf2BedRooms +
                ", nrOf3BedRooms=" + nrOf3BedRooms +
                '}';
    }
}

