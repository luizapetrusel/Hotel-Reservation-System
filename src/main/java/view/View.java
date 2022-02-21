package view;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {


    public JButton makeReservationButton;
    public JTextField nameTextField;
    public JTextField cityTextField;
    public JTextField adressTextField;
    public JTextField idTextField;
    public JTextField checkInTextField;
    public JTextField nrOfNightsTextField;
    public JTextField nrOfBedsTextField;
    JLabel billLabel;
    JLabel nameLabel;
    JLabel cityLabel;
    JLabel adressLabel;
    JLabel idLabel;
    JLabel checkInDate;
    JLabel nrOfNightsLabel;
    JLabel nrOfBedsLabel;
    JFrame frame;

    public View() {

        frame = new JFrame();
        frame.setSize(1000, 830);
        frame.setTitle("Hotel reservation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(255, 204, 153));
        frame.setResizable(false);
        frame.setLayout(null);


        //second panel
        JPanel pan = new JPanel();
        pan.setBorder(new EtchedBorder());
        frame.add(pan);
        pan.setLayout(null);
        pan.setBounds(550, 100, 300, 600);
        pan.setBackground(Color.WHITE);
        pan.setVisible(true);


        //first panel
        JPanel panel = new JPanel();
        panel.setBorder(new EtchedBorder());
        frame.add(panel);
        panel.setLayout(null);
        panel.setBounds(220, 100, 300, 500);
        panel.setBackground(Color.WHITE);
        panel.setVisible(true);


        billLabel = new JLabel();
        billLabel.setBounds(30, 0, 300, 400);
        billLabel.setForeground(new Color(255, 204, 153));
        billLabel.setFont(new Font("MV Boly", Font.BOLD, 20));
        pan.add(billLabel);
        pan.setVisible(true);


        makeReservationButton = new JButton("MAKE RESERVATION");
        makeReservationButton.setFocusable(false);
        makeReservationButton.setFont(new Font("MV Boly", Font.BOLD, 15));
        makeReservationButton.setForeground(Color.WHITE);
        makeReservationButton.setBounds(30, 400, 240, 30);
        makeReservationButton.setBackground(new Color(255, 204, 153));
        makeReservationButton.setBorderPainted(false);
        panel.add(makeReservationButton);
        makeReservationButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == makeReservationButton) {
                    //dispose();
                    //ModifyStockFrame newFrame=new ModifyStockFrame();
                }
            }
        });


        nameLabel = new JLabel("NAME");
        nameLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
        nameLabel.setForeground(new Color(255, 204, 153));
        nameLabel.setBounds(15, 30, 170, 30);
        panel.add(nameLabel);


        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Monospaced", Font.BOLD, 20));
        nameTextField.setForeground(Color.WHITE);
        nameTextField.setBackground(new Color(255, 204, 153));
        nameTextField.setBounds(105, 30, 170, 30);
        panel.add(nameTextField);


        cityLabel = new JLabel("CITY");
        cityLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
        cityLabel.setForeground(new Color(255, 204, 153));
        cityLabel.setBounds(15, 80, 170, 30);
        panel.add(cityLabel);


        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Monospaced", Font.BOLD, 20));
        cityTextField.setForeground(Color.WHITE);
        cityTextField.setBackground(new Color(255, 204, 153));
        cityTextField.setBounds(105, 80, 170, 30);
        panel.add(cityTextField);


        adressLabel = new JLabel(" ADRESS  ");
        adressLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
        adressLabel.setForeground(new Color(255, 204, 153));
        adressLabel.setBounds(5, 130, 170, 30);
        panel.add(adressLabel);

        adressTextField = new JTextField();
        adressTextField.setFont(new Font("Monospaced", Font.BOLD, 20));
        adressTextField.setForeground(Color.WHITE);
        adressTextField.setBackground(new Color(255, 204, 153));
        adressTextField.setBounds(105, 130, 170, 30);
        panel.add(adressTextField);

        idLabel = new JLabel("ID");
        idLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
        idLabel.setForeground(new Color(255, 204, 153));
        idLabel.setBounds(15, 180, 170, 30);
        panel.add(idLabel);

        idTextField = new JTextField();
        idTextField.setFont(new Font("Monospaced", Font.BOLD, 20));
        idTextField.setForeground(Color.WHITE);
        idTextField.setBackground(new Color(255, 204, 153));
        idTextField.setBounds(105, 180, 170, 30);
        panel.add(idTextField);


        checkInDate = new JLabel("CHECK IN");
        checkInDate.setFont(new Font("Monospaced", Font.BOLD, 20));
        checkInDate.setForeground(new Color(255, 204, 153));
        checkInDate.setBounds(5, 230, 170, 30);
        panel.add(checkInDate);


        checkInTextField = new JTextField();
        checkInTextField.setFont(new Font("Monospaced", Font.BOLD, 20));
        checkInTextField.setForeground(Color.WHITE);
        checkInTextField.setBackground(new Color(255, 204, 153));
        checkInTextField.setBounds(105, 230, 170, 30);
        panel.add(checkInTextField);

        nrOfNightsLabel = new JLabel("NIGHTS");
        nrOfNightsLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
        nrOfNightsLabel.setForeground(new Color(255, 204, 153));
        nrOfNightsLabel.setBounds(15, 280, 170, 30);
        panel.add(nrOfNightsLabel);


        nrOfNightsTextField = new JTextField();
        nrOfNightsTextField.setFont(new Font("Monospaced", Font.BOLD, 20));
        nrOfNightsTextField.setForeground(Color.WHITE);
        nrOfNightsTextField.setBackground(new Color(255, 204, 153));
        nrOfNightsTextField.setBounds(105, 280, 170, 30);
        panel.add(nrOfNightsTextField);


        nrOfBedsLabel = new JLabel("BEDS");
        nrOfBedsLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
        nrOfBedsLabel.setForeground(new Color(255, 204, 153));
        nrOfBedsLabel.setBounds(15, 330, 170, 30);
        panel.add(nrOfBedsLabel);

        nrOfBedsTextField = new JTextField();
        nrOfBedsTextField.setFont(new Font("Monospaced", Font.BOLD, 20));
        nrOfBedsTextField.setForeground(Color.WHITE);
        nrOfBedsTextField.setBackground(new Color(255, 204, 153));
        nrOfBedsTextField.setBounds(105, 330, 170, 30);
        panel.add(nrOfBedsTextField);


        frame.setVisible(true);


    }

    //method for printing the string from my bill label on multiple lines
    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }

    //method for adding actionlistener to my make reservation button
    public void makeReservationListener(ActionListener listenforbutton) {
        makeReservationButton.addActionListener(listenforbutton);
    }

    //method that prints the bill
    public void setTextToBillLabel(String s) {
        billLabel.setText(convertToMultiline(s));
    }


}
