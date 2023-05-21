import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testSub() {
		
		Main tester = new Main();
		
		/* Περίπτωση όπου a=8 > b=3 άρα περιμένουμε να τυπωθεί POSITIVE */ 
		assertEquals("POSITIVE", tester.sub(8, 3));
		
		/* a=3 < b=15 άρα περιμένουμε να τυπωθεί NEGATIVE */
		assertEquals("NEGATIVE", tester.sub(3, 15));
		
		/* a=b=20 άρα περιμένουμε να τυπωθεί ZERO */
		assertEquals("ZERO", tester.sub(20, 20));
	}
	
}
