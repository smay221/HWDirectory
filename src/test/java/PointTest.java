import com.artem.geometry.Point;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PointTest {
    @Test
    public void firstTest(){
        Point testPoint = new Point(0,0,0);
        Point testPoint2 = new Point(1,0,0);
        Point testPlus = testPoint.plus(testPoint2);
        Assertions.assertEquals(0, testPlus.getZ());
        Assertions.assertEquals(1, testPlus.getX());
        Assertions.assertEquals(0, testPlus.getY());

    }
    @Test
    public void SecondTest(){
        Point testPoint = new Point(12,0,6);
        Point testPoint2 = new Point(1,2,0);
        Point testPlus = testPoint.plus(testPoint2);
        Assertions.assertEquals(6, testPlus.getZ());
        Assertions.assertEquals(13, testPlus.getX());
        Assertions.assertEquals(2, testPlus.getY());

    }
    @Test
    public void ThirdTest(){
        Point testPoint = new Point(20,0,2);
        Point testPoint2 = new Point(1,0,0);
        Point testPlus = testPoint.plus(testPoint2);
        Assertions.assertEquals(2, testPlus.getZ());
        Assertions.assertEquals(21, testPlus.getX());
        Assertions.assertEquals(0, testPlus.getY());

    }
    @Test
    public void FourTest(){
        Point testPoint = new Point(261,2,46);
        Point testPoint2 = new Point(32,0,0);
        Point testPlus = testPoint.plus(testPoint2);
        Assertions.assertEquals(46, testPlus.getZ());
        Assertions.assertEquals(293, testPlus.getX());
        Assertions.assertEquals(2, testPlus.getY());

    }
    @Test
    public void FiveTest(){
        Point testPoint = new Point(500,3,42);
        Point testPoint2 = new Point(1,0,1);
        Point testPlus = testPoint.plus(testPoint2);
        Assertions.assertEquals(43, testPlus.getZ());
        Assertions.assertEquals(501, testPlus.getX());
        Assertions.assertNotEquals(6, testPlus.getY());

    }
    @Test
    public void SixTest(){
        Point testPoint = new Point(10, 5, 3);
        Point testPoint2 = new Point(2, 2, 2);
        Point testResult = testPoint.minus(testPoint2);
        Assertions.assertEquals(8, testResult.getX());
        Assertions.assertEquals(3, testResult.getY());
        Assertions.assertEquals(1, testResult.getZ());

    }
    @Test
    public void SevenTest(){
        Point testPoint = new Point(-20, 322, 133);
        Point testPoint2 = new Point(2, 22, 1);
        Point testResult = testPoint.minus(testPoint2);
        Assertions.assertEquals(-22, testResult.getX());
        Assertions.assertEquals(300, testResult.getY());
        Assertions.assertEquals(132, testResult.getZ());
    }
    @Test
    public void EightTest(){
        Point testPoint = new Point(10, 5, 5);
        Point testPoint2 = new Point(-2, -2, -2);
        Point testResult = testPoint.minus(testPoint2);
        Assertions.assertEquals(12, testResult.getX());
        Assertions.assertEquals(7, testResult.getY());
        Assertions.assertEquals(7, testResult.getZ());

    }
    @Test
    public void NineTest(){
        Point testPoint = new Point(100,100,100);
        Point testPoint2 = new Point(100,100,100);
        double testResult = testPoint.distance(testPoint2);
        Assertions.assertEquals(0.0, testResult);

    }
    @Test
    public void TenTest(){
        Point testPoint = new Point(-14,9,-19);
        Point testPoint2 = new Point(-4,4,-9);
        double testResult = testPoint.distance(testPoint2);
        Assertions.assertEquals(15.0, testResult);

    }
}
