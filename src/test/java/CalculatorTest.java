import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    @Test
    public void addWhen4Plus3ThenReturn7(){
        //GIVEN
        int a = 4;
        int b = 3;

        //WHEN
        int actual = Calculator.add(a,b);

        //THEN
        int expected = 7;

        assertEquals(expected, actual);
    }
    @Test
    public void checkEvenNumber5Iseven(){
        int a = 5;
        boolean actual = Calculator.checkEven(a);
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void multiplyWhen2Multiply7Equals14(){
        int a = 2;
        int b = 7;
        int actual = Calculator.multiply(a,b);
        int expected = 14;
        assertEquals(expected, actual);
    }
    //test2commit
    @Test
    public void stringToUppercaseWhentestbecomesTEST(){
        String test = "test";
        String actual = Calculator.stringToUppercase("test");
        String expected = "TEST";
        assertEquals(expected, actual);
    }
    @Test
    public void isPositiveWhenNumberMinus6IsPositiv(){
        int a = -6;
        boolean actual = Calculator.isPositive(-6);
        boolean expected = false;
        assertEquals(expected, actual);
    }

}
