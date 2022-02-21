package model;

public class Manager implements Person {
    private final String ocupation = "Manager"; //the ocupation for objects of type Manager is always "Manager", so I set it final(non-changeable)
    private String name;
    private String employmentDate;

    //methods from interface Person
    public String getName() {
        return this.name;
    }

    //getters and setters for the atributes(we need getters and setter bc are private)
    public void setName(String name) {
        this.name = name;
    }

    public String getOcupation() {
        return this.ocupation;
    }

    public TopSkill getTopSkill() {
        return TopSkill.LEADERSHIP;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public void hireReceptionist(JobSeeker person) throws InnapropiateAgeException {
        if (person.getTopSkill() == TopSkill.COMUNICATIVE ) {
            if (person.getAge() > 18) {
                person.setStatus(true);
            } else {
                throw new InnapropiateAgeException();
            }

        } else {
            person.setStatus(false);
        }

        if (person.getStatus() == true) {
            System.out.println("Congratulations! You are hired");
        }

    }

    public void hireChef(JobSeeker person) throws InnapropiateAgeException {
        if (person.getTopSkill() == TopSkill.COOKINGKNOLEDGE ) {
            if (person.getAge() > 18) {
                person.setStatus(true);
            } else {
                throw new InnapropiateAgeException();
            }


        } else {
            person.setStatus(false);
        }

        if (person.getStatus() == true) {

            System.out.println("Congratulations! You are hired");
        }
    }

    public void hireCleaningPerson(JobSeeker person) throws InnapropiateAgeException {
        if (person.getTopSkill() == TopSkill.HARDWORKING ) {
            if (person.getAge() > 18) {
                person.setStatus(true);
            } else {
                throw new InnapropiateAgeException();
            }

        } else {
            person.setStatus(false);
        }

        if (person.getStatus() == true) {
            System.out.println("Congratulations! You are hired");
        }

    }


    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", ocupation='" + ocupation + '\'' +
                ", employmentDate='" + employmentDate + '\'' +
                '}';
    }
}
