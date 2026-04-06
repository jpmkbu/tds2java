package g68099.motorizedvehicule;

public class Car extends Vehicule{
    int nSeats;

    public Car(double maxTank, String brand, int nSeats) {
        super(maxTank, brand);
        this.nSeats = nSeats;
    }

    @Override
    public String toString() {
        return super.toString() +  "Car{" +
                "nSeats=" + nSeats +
                '}';
    }


}
