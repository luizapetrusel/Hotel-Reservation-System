package model;

public class Client implements Person {
    private String name;
    private String city;
    private String adress;
    private String gender;
    private Integer identityCardNumber;
    private Reservation reservation;


    public Client(String name, String city, String adress, Integer identityCardNumber) {
        this.name = name;
        this.city = city;
        this.adress = adress;
        this.identityCardNumber = identityCardNumber;
    }

    //methods from Person interface
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOcupation() {
        return null;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String sex) {
        this.gender = gender;
    }

    public Integer getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(Integer identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }





    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                '}';
    }
}

