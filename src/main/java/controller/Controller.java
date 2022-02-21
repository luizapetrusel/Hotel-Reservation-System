package controller;

import model.GenerateBill;
import model.Model;
import model.Reservation;
import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private final View theView;
    private final Model theModel;

    public Controller(View theView, Model theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.makeReservationListener(new Listener());

    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = theView.nameTextField.getText();
            String city = theView.cityTextField.getText();
            String adress = theView.adressTextField.getText();
            int id = Integer.parseInt(theView.idTextField.getText());
            theModel.setInfoAboutClient(name, city, adress, id);

            String checkin = theView.checkInTextField.getText();
            int nrOfNights = Integer.parseInt(theView.nrOfNightsTextField.getText());
            int nrOfBeds = Integer.parseInt(theView.nrOfBedsTextField.getText());
            Reservation r = theModel.setInfoAboutReservation(checkin, nrOfNights, nrOfBeds);


            GenerateBill bill = new GenerateBill();
            String s = bill.generate(r);
            theView.setTextToBillLabel(s);

            System.out.println(s);
        }
    }
}
