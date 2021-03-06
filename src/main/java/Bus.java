import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public void addPassenger(Person passenger) {
        if (getPassengerCount() < this.capacity) {
            passengers.add(passenger);
        }
    }

    public void removePassenger(Person passenger){
        passengers.remove(passenger);
    }


}
