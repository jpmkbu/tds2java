package g68099.motorizedvehicule;

public class Moto extends Vehicule{
    public Moto(double maxTank, String brand) {
        super(maxTank, brand);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tank=" + tank +
                '}';
    }
}
