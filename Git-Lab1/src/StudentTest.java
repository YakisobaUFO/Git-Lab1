import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * TODO: complete the following test, base the tests off of what was shown earlier test classes
 */
public class StudentTest {

    static Student bill, ben, bob;

    @BeforeAll
    static void initialize(){
        bob = new Student(18, "Bob Maher", new String []{"COSC 222","COSC 311", "MATH 200", "MATH 220"});
        bill = new Student(19, "Bill Cosby", new String []{"COSC 222", "COSC 404", "ENGL 112"});
        ben = new Student(24, "Ben Mckenny", new String []{"COSC 222", "COSC 111", "MATH 200", "PHYS 101"});
    }
    
	@Test
	void testGetClasses() {
		 //TODO: test that the classes array returned is correct
		String[] strExpectedBob = {"COSC 222","COSC 311", "MATH 200", "MATH 220"};
		String[] strExpectedBill = {"COSC 222", "COSC 404", "ENGL 112"};
		String[] strExpectedBen = {"COSC 222", "COSC 111", "MATH 200", "PHYS 101"};
		assertArrayEquals(bob.getClasses(), strExpectedBob );
		assertArrayEquals(bill.getClasses(), strExpectedBill );
		assertArrayEquals(ben.getClasses(), strExpectedBen );
	}

	@Test
	void testGetAge() {
		//TODO: test that the age returned is correct
		assertEquals(bob.getAge(),18);
		assertEquals(bill.getAge(),19);
		assertEquals(ben.getAge(),24);
		
	}
}