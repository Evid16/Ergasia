import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testSub() {
		
		Main tester = new Main();
		
		/* Περίπτωση όπου a=5 > b=4 άρα περιμένουμε να τυπωθεί POSITIVE */ 
		assertEquals("POSITIVE", tester.sub(5, 4));
		
		/* a=2 < b=6 άρα περιμένουμε να τυπωθεί NEGATIVE */
		assertEquals("NEGATIVE", tester.sub(2, 6));
		
		/* a=b=10 άρα περιμένουμε να τυπωθεί ZERO */
		assertEquals("ZERO", tester.sub(10, 10));
	}
	
}
