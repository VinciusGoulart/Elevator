import java.util.Locale;
import java.util.Scanner;

public class Elevator {

    private int currentFloor = 0;
    private int totalFloors;

    private int capacity;
    private int amountPerson = 0;



    public Elevator() {

    }

    public Elevator(int totalFloors, int capacity) {
        this.currentFloor = 0;
        this.totalFloors = totalFloors;
        this.capacity = capacity;
        this.amountPerson = 0;
    }

    public Elevator(int currentFloor, int totalFloors, int capacity, int amountPerson) {
        this.currentFloor = currentFloor;
        this.totalFloors = totalFloors;
        this.capacity = capacity;
        this.amountPerson = amountPerson;
    }


    public void initialize(double maxCapacity, double totalFloors) {
        this.capacity += maxCapacity;
        this.totalFloors += totalFloors;
        System.out.println();

    }

    public void enter(int increasePerson) {

        if (capacity > amountPerson && increasePerson <= (capacity - amountPerson)) {
            this.amountPerson += increasePerson;

        } else {
            this.amountPerson = capacity;
            System.out.println("The elevator is full");
        }
    }

    public void out(int decreasePerson) {
        if (amountPerson > 0 && decreasePerson <= amountPerson) {
            this.amountPerson -= decreasePerson;
        } else {
            amountPerson = 0;
        }

    }

    public boolean up(int choose) {
        if (currentFloor >= 0 && currentFloor <= totalFloors && choose <= totalFloors && choose > currentFloor) {
            this.currentFloor = choose;
            return true;
        } else {
            System.out.println("This floor doesn't exist");
            return false;
        }

    }

    public boolean down(int choose) {
        if (currentFloor > 0 && choose < currentFloor) {
            this.currentFloor = choose;
            return true;
        } else {
            System.out.println("This floor doesn't exist");
            return false;
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAmountPerson() {
        return amountPerson;
    }

    public void setAmountPerson(int amountPerson) {
        this.amountPerson = amountPerson;
    }

    @Override
    public String toString() {
        return "Welcome, " +
                "your current floor is " + currentFloor +
                ", the highest floor is " + totalFloors +
                ", max person capacity in elevator is: " + capacity +
                ", current person in elevator: " + amountPerson;
    }
}

