import RedRover.HW11.MyString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyStringTest {
    @Test
    public void testShortenString() {
        String input = "Привет всем кто живет на луне!";

        // Проверяем сокращение до 10 символов
        String result10 = MyString.shortenString(input, 10);
        Assert.assertEquals(result10, "Привет ...");

        // Проверяем сокращение до 20 символов
        String result20 = MyString.shortenString(input, 20);
        Assert.assertEquals(result20, "Привет всем кто ж...");
    }
}
