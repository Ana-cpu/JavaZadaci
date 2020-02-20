package loopexample;
import loopexample.CalculatorInLoop;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.corba.se.spi.orbutil.fsm.Input;

class CalculatorInLoopTest {
	
	CalculatorInLoop calc = new  CalculatorInLoop();

	@Test
	void test() {
		CalculatorInLoop calc = new CalculatorInLoop();

        assertTrue(calc.doMath("1", 5, 7) == 12.0);
        assertTrue(calc.doMath("2", 5, 7) == -2.0);
        assertTrue(calc.doMath("3", 5, 7) == (5.0/7.0));
        assertTrue(calc.doMath("4", 5, 7) == (5.0*7.0));
        
    }

}
