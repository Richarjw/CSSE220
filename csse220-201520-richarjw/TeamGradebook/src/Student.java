import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Double> grades;
	//TODO: You'll probably need to have some more fields here
	
	/**
	 * makes a new student object
	 * 
	 * @param newName the name of the student
	 */
	public Student(String newName) {
		//DONE: initialize fields here
		this.name = newName;
		this.grades = new ArrayList<Double>();
	}

	/**
	 * gets the name of the student
	 * 
	 * @return the name of the student
	 */
	public String getName() {
		// TODO your code here
		return this.name;
	}
	
	/**
	 * Adds a given grade to grade arraylist
	 *
	 * @param grade
	 */
	public void addGrade(Double grade)
	{
		this.grades.add(grade);
	}
	/**
	 * Returns all grades of the student
	 *
	 * @return
	 */
	public ArrayList<Double> getGrades()
	{
		return this.grades;
	}
	//TODO: You'll need to add some new methods here
}
