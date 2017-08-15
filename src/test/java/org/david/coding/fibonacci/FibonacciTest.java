package org.david.coding.fibonacci;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

/**
 * Created by rapissal on 15/08/2017.
 *
 */
public class FibonacciTest {

    Fibonacci fib = new Fibonacci();


    @Test
    public void calculateTest1(){

        long expected = 0;
        long actual = fib.calculate(0);

        assertEquals(expected, actual);

    }

    @Test
    public void calculateTest2(){
        long expected = 1;
        long actual = fib.calculate(2);

        assertEquals(expected, actual);

    }

    @Test
    public void calculateTest10(){
        long expected = 55;
        long actual = fib.calculate(10);

        assertEquals(expected, actual);

    }

    @Test
    public void calculateTest20(){
        long expected = 6765;
        long actual = fib.calculate(20);

        assertEquals(expected, actual);

    }

    @Test
    public void readFileTest(){
        List<Integer>  numbers = fib.readFile("src/test/resources/fibonacci_test.txt");
        assertTrue(numbers.size()>0);
        assertEquals(7, numbers.size() );
    }

    @Test
    public void isNumberTest(){
        // todo test with : 1, tt, 178g, 77, % ^,
        assertTrue(1==0);
    }

    @Test
    public void writeFile(){
        assertTrue(1==0);
    }

}
