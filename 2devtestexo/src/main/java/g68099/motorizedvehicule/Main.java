package g68099.motorizedvehicule;

public class Main {
    static void main() {

        Vehicule jp = new Vehicule(50, "audi");
        Vehicule carmel = new Vehicule(50,"audi");
        System.out.println(jp);

        jp.ride(100);
        System.out.println(jp);

        jp.fillUpgaz();
        System.out.println(jp);

        jp.ride(500);
        System.out.println(jp);

        jp.ride(700);
        System.out.println(jp);

        System.out.println(jp.equals(carmel));
        jp.fillUpgaz();

        System.out.println(jp.equals(carmel));
    }
}
