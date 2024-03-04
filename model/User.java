package Lesson_3_4.model;

public abstract class User {
    
    private String firstName;

    private String secondName;

    private String lastname;

    public User(String firstName, String secondName, String lastname) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", secondName=" + secondName + ", lastname=" + lastname + "]";
    }


    
}
