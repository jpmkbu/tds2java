package td08;

public class BankAccount {
    private String owner;
    private double balance;
    public BankAccount (String owner, double balance) {
        this.owner = owner;
         this.balance = balance;



    }


    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

  @Override
    public String toString() {
       return "BankAccount{" +
               "owner='" + owner + '\'' +
            ", balance=" + balance +
              '}';
    }

    public void deposit(double  amount) {
        if(amount<= 0){
            throw new IllegalArgumentException(" le montant doit être strictement positif");
        }

        this.balance = balance+amount;
    }

    public void withdrow(double amount){
        if (amount<=0 && balance<amount){
            throw new IllegalArgumentException("le solde doit être supérieur au montant");
        }
        this.balance = balance - amount;
    }


}
