import java.util.ArrayList;

/**
 * an administrative body that has functions involving classes, students, profs ect...
 */
public class Administration {

    /**
     * returns an arraylist of students who's last name begins with the given character
     * students can be assumed to have only 1 first and last name, separated by a space
     * @param class1 class who's students we are inspecting
     * @param start character we are concerned with
     */
    public ArrayList<Student> orderStudents(UniClass class1, char start){
        ArrayList<Student> list = new ArrayList<>();
        start = Character.toLowerCase(start);
        //TODO: Write the method described above
        String lName;  // last name of the student
        for(Student stu: class1.getStudents()) {
        	// Get the last name of the student
        	// The last name is the substring of the student name at index from ' '+1.
        	lName = stu.getName().substring(stu.getName().indexOf(' ') +1 );
        	if (Character.toLowerCase(lName.charAt(0)) == start) 
        		list.add(stu);
        }
        if (list.size()>0)
        	return list;
        else
        	return null;
    }

    /**
     * compares two lists of students and returns the common students (or set intersection)
     * @param class1 list of students
     * @param class2 second list of students
     */
    public ArrayList<Student> intersection(Student[] class1, Student[] class2){
        ArrayList<Student> list = new ArrayList<>();
        //TODO: alter method to account for empty lists in some way
        if (class1.length>0 && class2.length>0) {
	        for (Student stud1: class1){
	            for (Student stud2: class2){
	
	                if(stud1.equals(stud2) && !list.contains(stud1)){
	                    list.add(stud1);
	                }
	
	
	            }
	        }
	        return list;
        }
        return null;
    }
}
