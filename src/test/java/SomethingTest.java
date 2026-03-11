import RedRover.HW11.Something;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SomethingTest {
    @Test
    public void testAdd() {
        int result = Something.Add(2, 2);
        Assert.assertEquals(result, 4);
    }
    @Test
    public void testSubstract() {
        int result = Something.Substract(6, 2);
        Assert.assertEquals(result, 4);
    }
    @Test
    public void Multiply() {
        int result = Something.Multiply(2, 2);
        Assert.assertEquals(result, 4);
    }
    @Test
    public void Divide() {
        int result = Something.Divide(2, 2);
        Assert.assertEquals(result, 1);

    }
}
