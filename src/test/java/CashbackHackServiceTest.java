import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void testCash () {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}
