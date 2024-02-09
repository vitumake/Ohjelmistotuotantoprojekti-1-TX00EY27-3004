

import org.junit.Test;

import tel.kontra.Account;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void testDeposit() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.0);
    }

    @Test
    public void testWithdraw() {
        Account account = new Account();
        account.deposit(200.0);
        double withdrawn = account.withdraw(100.0);
        assertEquals(100.0, account.getBalance(), 0.0);
        assertEquals(100.0, withdrawn, 0.0);
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        Account account = new Account();
        account.deposit(100.0);
        double withdrawn = account.withdraw(200.0);
        assertEquals(100.0, account.getBalance(), 0.0);
        assertEquals(0.0, withdrawn, 0.0);
    }

    @Test
    public void testGetBalance() {
        Account account = new Account();
        assertEquals(0.0, account.getBalance(), 0.0);
    }
}