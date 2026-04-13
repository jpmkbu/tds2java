package td12;


public class Main {
    static void main() {
        Transport t1 = Transport.BOAT;
        Transport t2 =  Transport.CAR;
        System.out.println(t1.equals(t2));
        switch(t1) {
            case AIRPLANE:
                System.out.println(t1);
                break;
            case BOAT:
                System.out.println(t1);
                break;
            case CAR:
                System.out.println(t1);
                break;
            case TRAIN:
                System.out.println(t1);
                break;
            case TRUCK:
                System.out.println(t1);
                break;

        }

    }

}
