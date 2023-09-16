import org.junit.jupiter.api.BeforeAll;
import java.util.ArrayList;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Administration admin = new Administration();
		UniClass COSC222, MATH200;
	    Teacher andrew, jennifer;
	    Student bill, ben, bob;

        //set up objects so we can test the methods of the Administration Class
    	bob = new Student(18, "Bob Maher", new String []{"COSC 222","COSC 311", "MATH 200", "MATH 220"});
        bill = new Student(19, "Bill Simmons", new String []{"COSC 222", "COSC 404", "ENGL 112"});
        ben = new Student(24, "Ben Mckenny", new String []{"COSC 222", "COSC 111", "MATH 200", "PHYS 101"});

        andrew = new Teacher(36,"Andrew Peterson",  new String []{"COSC 222", "COSC 404", "COSC 111"}, "Computer Science");
        jennifer = new Teacher(36,"Jennifer Lopez",  new String []{"MATH 200", "MATH 220"}, "Mathematics");

        COSC222 = new UniClass(new Student[]{bob,bill,ben}, andrew, "COSC 222");
        MATH200 = new UniClass(new Student[]{bob,ben}, jennifer, "MATH 200");
        
        ArrayList<Student> stuList = admin.orderStudents(COSC222, 'M');
        System.out.println(stuList);
	}

}
