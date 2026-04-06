package g68099.motorizedvehicule;

public class HybridCar extends Car {
    public HybridCar(double maxTank, String brand, int nSeats) {
        super(maxTank, brand, nSeats);
    }

    @Override
    public void ride(int distance){
        if(getTank() == 0){
            System.out.println("je suis en panne de sèche");
        } else {
            setTank(getTank() - (distance * 0.05));
        }
    }
}
