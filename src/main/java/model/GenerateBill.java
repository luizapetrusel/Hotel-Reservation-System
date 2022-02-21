package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateBill {
    public String generate(Reservation reservation) {
        String s = "";
        try {
            File myObj = new File("yourBill.txt");
            FileWriter myWriter = new FileWriter("yourBill.txt");
            myWriter.write("This is your Bill:\n" + "Name:" + reservation.getClient().toString() + "\n" + "City:" + reservation.getClient().getCity() + "\n"
                    + "Adress:" + reservation.getClient().getAdress() + "\n" + "Identity card number:" + reservation.getClient().getIdentityCardNumber() + "\n"
                    + "Check In Date:" + reservation.getPeriod() + "\n" + "Room number:" + reservation.getRoom().getRoomNumber() + "\n"
                    + "Price per night:" + reservation.getRoom().getPricePerNight() + "\n" + "Number of nights accomodated:" + reservation.getNrOfNightsAccommodated()
                    + "\n" + "Total:" + reservation.calculateBill() + "\n");
            s = s + "This is your Bill:\n" + "Name:" + reservation.getClient().getName() + "\n" + "ID:" + reservation.getClient().getIdentityCardNumber() + "\n" + "City:" + reservation.getClient().getCity() + "\n"
                    + "Adress:" + reservation.getClient().getAdress() + "\n" + "Identity card number:" + reservation.getClient().getIdentityCardNumber() + "\n"
                    + "Check In Date:" + reservation.getPeriod() + "\n" + "Room number:" + reservation.getRoom().getRoomNumber() + "\n"
                    + "Price per night:" + reservation.getRoom().getPricePerNight() + "\n" + "Number of nights accomodated:" + reservation.getNrOfNightsAccommodated()
                    + "\n" + "Total:" + reservation.calculateBill() + "\n";
            myWriter.close();
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return s;
    }
}
