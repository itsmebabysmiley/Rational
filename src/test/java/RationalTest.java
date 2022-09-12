import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }

    @Test
    public void testSubtract(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
    }

    @Test
    public void testMultiply(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(8,x.denominator);
    }

    @Test
    public void testDivide(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1,x.denominator);
    }

    @Test
    public void testEquals(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        boolean isEqual = x.equals(y);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void testCompareTo(){
        Rational x = new Rational();
        Rational y = new Rational();
        //equal
        x.numerator = 1;
        x.denominator = 2;
        y.numerator = 1;
        y.denominator = 2;
        long result1 = x.compareTo(y);
        Assert.assertEquals(0, result1);
        //more than
        x.numerator = 1;
        x.denominator = 2;
        y.numerator = 1;
        y.denominator = 3;
        long result2 = x.compareTo(y);
        Assert.assertEquals(1, result2);
        //less than
        x.numerator = 1;
        x.denominator = 3;
        y.numerator = 1;
        y.denominator = 2;
        long result3 = x.compareTo(y);
        Assert.assertEquals(-1, result3);
    }
    @Test
    public void testToString(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        String result = x.toString();
        Assert.assertEquals("1/2", result);
    }

}
