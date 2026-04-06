package g68099.motorizedvehicule;

import java.util.Objects;

public class Vehicule {
    private String brand;
    private double maxTank;
    protected double tank;

    public void setTank(double tank) {
        this.tank = tank;
    }

    public Vehicule(double maxTank, String brand) {
        this.maxTank = maxTank;
        this.brand = brand;
        this.tank = maxTank;
    }

    public double getMaxTank() {
        return maxTank;
    }

    public double getTank() {
        return tank;
    }

    public String getBrand() {
        return brand;
    }

    void fillUpgaz(){
        tank = maxTank;
    }

    void ride(int distance) {
        System.out.println("je roule sur "+distance+"km");
        tank=tank-0.1*distance;
        if(tank==0){
            System.out.println("je suis en panne seche");

        } else {
            this.tank = tank - (distance * 0.1);
        }

    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return Double.compare(maxTank, vehicule.maxTank) == 0 && Double.compare(tank, vehicule.tank) == 0 && Objects.equals(brand, vehicule.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, maxTank, tank);
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "brand='" + brand + '\'' +
                ", maxTank=" + maxTank +
                ", tank=" + tank +
                '}';
    }
}
