public class Main {
    static void main() {
//        BankAccount jp = new BankAccount("jp",1000);
//        System.out.println(jp.getOwner() + " " + jp.getBalance());
//        jp.setOwner("Carmel");
//        jp.withdrow(500);
//        System.out.println(jp.getOwner() + jp.getBalance() );



        Student jp = new Student("jp",68099,16);
        System.out.println(jp.getName() + " " + jp.getId() + " " + jp.getGrade());
        jp.setGrade(9);
        System.out.println(jp.getName() + " " + jp.getId() + " " + jp.isPassing());
    }
}
