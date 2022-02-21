package model;

public class JobSeeker implements Person {
    private String name;
    private Integer age;
    private String gender;
    private String education;
    private TopSkill topSkill;
    private Boolean status; // false or true; false means that a manager doesn't hire him/her,true means the managers hires him/her


    public JobSeeker(String name, Integer age, String gender, String education) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.education = education;

    }

    //methods  from Person interface
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TopSkill getTopSkill() {
        return this.topSkill;
    }

    public void setTopSkill(TopSkill topSkill) {
        this.topSkill = topSkill;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


    public void applyForJob() {
        System.out.println("These are the main things you should know about myself:\n");
        System.out.println(this.toString());
    }


    //I implemented the toString() method for displaying all the atributtes for an object of type JobSeeker
    @Override
    public String toString() {
        return "JobSeeker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", education='" + education + '\'' +
                ", topSkill=" + topSkill +
                '}';
    }
}
