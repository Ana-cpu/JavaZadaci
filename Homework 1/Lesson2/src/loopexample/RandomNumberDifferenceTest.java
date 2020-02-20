package loopexample;
import loopexample.RandomNumberDifference;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.corba.se.spi.orbutil.fsm.Input;

class RandomNumberDifferenceTest {

	@Test
	void test() {
		RandomNumberDifferenceTest random = new RandomNumberDifferenceTest();

        assertTrue(random.getInput() == "Incredible, you enter expected number");
        assertTrue(random.getInput() == "Good catch, You were so good:");
        assertTrue(random.getInput() == ("More lucky next time"));
       
    }

}
