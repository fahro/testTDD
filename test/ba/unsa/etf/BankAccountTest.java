package ba.unsa.etf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private  BankAccount acc;

    @BeforeEach
    public void setUp(){

        acc = new BankAccount();
    }

    @Test
    public void testDeposit(){

        acc.deposit(100);
        assertEquals(acc.getBalance(),100);
    }


    @Test
    public void testDepositIfNegative(){


       assertThrows(IllegalArgumentException.class, ()-> {acc.deposit(-10);});

    }


}
