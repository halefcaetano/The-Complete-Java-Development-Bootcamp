import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPassport(){
        return Arrays.copyOf(passport, passport.length);
    }

    public void setPassport(){
        passport[0] = name;
        passport[1] = nationality;
        passport[2] = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean applyPassport(){
        int number = (int) (Math.random() * 2);
        return number == 1;
    }

    public void chooseSeat(){
        seatNumber = (int) (Math.random() * 11 + 1);
    }

    public String toString(){
        return "Name: " + name + "\n" + "Nationality: " + 
        nationality + "\n" + "Date of Birth: " + 
        dateOfBirth + "\n" + "Seat Number: " +
        seatNumber + "\n" + "Passport: " + 
        Arrays.toString(passport) + "\n";
        
    }
    
}
