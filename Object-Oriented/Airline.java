public class Airline {

    Person[] people;

    public Airline(){
        this.people = new Person[11];
    }

    public Person getPerson(int index){
        Person person = people[index];
        return new Person(person);
    }

    public void setPerson(Person person){
        int index = person.getSeatNumber() - 1;
        people[index] = new Person(person);
    }

    public void createReservation(Person person) {

        while (people[person.getSeatNumber() - 1] != null){
            System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another seat.\n");
            person.chooseSeat();
        }
        int index = person.getSeatNumber() - 1;  
        people[index] = new Person(person);      
        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".\n");
    }


}
