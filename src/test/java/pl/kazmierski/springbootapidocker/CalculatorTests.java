package pl.kazmierski.springbootapidocker;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    //BDD
    @Test
    public void should_add_two_numbers() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(10, 15);

        //then
        Assert.assertEquals(result,25);
    }

    @Test
    public void should_no_add_two_numbers() {
        //given
        Calculator calculator = new Calculator();

        //then
        Assert.assertNotEquals(calculator.add(10,20),25);
    }

    @Test
    public void should_divide_two_number() {
        //given
        Calculator calculator = new Calculator();

        //then
        Assert.assertEquals(calculator.divide(100,10),10,0);
    }

    @Test(expected = ArithmeticException.class)
    public void should_no_divide_by_zero() {
        //given
        Calculator calculator = new Calculator();

        //then
        Assert.assertEquals(calculator.divide(100,0),10,0);
    }
}
