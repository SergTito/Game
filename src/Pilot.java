public class Pilot {
    private final String firstName;
    private final String lastName;


    public Pilot(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "\nИмя: " + getFirstName() + "\nФамилия: " + getLastName();
    }
}
