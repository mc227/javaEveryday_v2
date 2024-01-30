package mark.task.task20.task2002;

import java.util.Date;
public class User {
    private String firstName;
    private String lastName;
    private Date birthdate;
    private Boolean isMale;
    private Country country;

    public static enum Country {
        UNITED_STATES("United States"),
        UNITED_KINGDOM("United Kingdom"),
        OTHER("Other");

        private String name;

        private Country(String name){
            this.name = name;
        }

        public String getDisplayName() {
            return this.name;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}

