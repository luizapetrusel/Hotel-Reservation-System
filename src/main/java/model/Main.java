package model;


import controller.Controller;
import view.View;

public class Main {
    public static void main(String[] args) throws InnapropiateAgeException {
/*
        Room room1=new Room();
        room1.setFloorNumber(12);
        room1.setRoomNumber(1);
        room1.setPricePerNight(80f);
        room1.setOccupied(false);
        room1.setNrOfBeds(2);

        Employee employee1=new Employee("Lulu");

        Client client1= new Client();
        client1.setAdress("Criz");
        client1.setCity("fff");
        client1.setName("fff");
        client1.setIdentityCardNumber(12);
        Reservation reservation1=new Reservation(client1,"6",room1);
        reservation1.setPeriod("12-03-2021");
        reservation1.setEmployee(employee1);
        reservation1.setNrOfNightsAccommodated(3);


        GenerateBill g=new GenerateBill();
        g.generate(reservation1);

        //here I created a hotel
        Hotel myHotel=new Hotel();
        myHotel.setName(HotelNames.RoadSide.name());
        myHotel.setLocation("Poiana Brasov,Romania");
        myHotel.setNrOf2BedRooms(30);
        myHotel.setNrOf3BedRooms(15);


        //here I will create a Manager for my hotel
        Manager manager=new Manager();
        manager.setName("Jane Miller");
        manager.setEmploymentDate("11-02-2017");

        //here I set the manager for my hotel
        myHotel.setManager(manager);

        //here I displayed the information about my hotel
        System.out.println("This is my hotel:");
        System.out.println(myHotel);
*/
        View clientFrame = new View();
        Model model = new Model();
        Controller controller = new Controller(clientFrame, model);

        Hotel myHotel=new Hotel();
        myHotel.setName(HotelNames.RoadSide.name());
        myHotel.setLocation("Poiana Brasov,Romania");
        myHotel.setNrOfStars(5);
        myHotel.setNrOf2BedRooms(30);
        myHotel.setNrOf3BedRooms(15);

        Manager manager = new Manager();
        manager.setName("Ion Popescu");
        manager.setEmploymentDate("12-01-2020");
        myHotel.setManager(manager);


        JobSeeker jobSeeker1 = new JobSeeker("Pop Maria", 22, "female", "student");
        jobSeeker1.setTopSkill(TopSkill.COOKINGKNOLEDGE);
        manager.hireChef(jobSeeker1);
        myHotel.setEmployees(jobSeeker1);

        System.out.println("This is my hotel:");
        System.out.println(myHotel);


    }
}
