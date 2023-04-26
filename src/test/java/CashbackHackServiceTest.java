import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void calculateCashLess1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected,actual);

    }

    @Test
    public void calculateCash1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }

    @Test
    public void calculateCash0() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }

    @Test
    public void calculateCash1() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }

    @Test
    public void calculateCash999() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }



}