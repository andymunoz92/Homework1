class Ship{
    protected String ship;
    protected String built;
    public Ship(String ship, String built){
        this.ship = ship;
        this.built = built;
    }

    // Accessors
    public String getShip() {
        return ship;
    }
    public String getBuilt() {
        return built;
    }

    // Mutators
    public void setShip(String ship) {
        this.ship = ship;
    }
    public void setBuilt(String built) {
        this.built = built;
    }

    public void print(){
        System.out.println("Ship name: " + ship + "\nYear built: " + built);
    }
}

class CruiseShip extends Ship{
    private int maxPassengers;
    public CruiseShip(String ship, String built, int maxPassengers){
        super(ship, built);
        this.maxPassengers = maxPassengers;
    }

    // Accessors
    public int getMaxPassengers() {
        return maxPassengers;
    }

    // Mutators
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void print(){
        System.out.println("Ship name: " + ship + "\nYear built: " +
                built + "\nMax # of passengers: " + maxPassengers);
    }

}

class CargoShip extends Ship{
    private int capacity;

    public CargoShip(String ship, String built, int capacity){
        super(ship, built);
        this.capacity = capacity;
    }

    // Accessors
    public int getCapacity() {
        return capacity;
    }

    // Mutators
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void print(){
        System.out.println("Ship name: " + ship + "\nYear built: " +
                built + "\nCargo capacity in tonnage: " + capacity);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("El Capitan", "2005");
        ships[1] = new CruiseShip("Titanic", "1911", 3547);
        ships[2] = new CargoShip("The Bronco", "2024", 37700);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}
