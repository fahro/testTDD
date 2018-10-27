package ba.unsa.etf;

public class BankAccount {


    public int getBalance() {
        return balance;
    }

    private int balance;

    public void deposit(int i) {
        if(i<0) throw new IllegalArgumentException("bla bal");


        if(balance<0){
            System.out.println("bla bla");
        }
         balance+=i;
    }
    
}
