package model;

public class InnapropiateAgeException extends Exception {
    public void getMessage(String mess) {
        System.out.println("you are too young to work for us!!!");
    }
}

