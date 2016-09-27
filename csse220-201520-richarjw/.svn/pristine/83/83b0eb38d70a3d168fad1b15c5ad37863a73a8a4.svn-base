import java.util.ArrayList;


public class Team {
	private ArrayList<Student> teamStudents;
	private String teamName;
	private ArrayList<Double> teamGrade;
	// You'll need to add methods, constructors and fields here
	/**
	 * Constructor for class Team.
	 *
	 * @param newName
	 * @param teamArray
	 */
	public Team(String newName, ArrayList<Student> teamArray)
	{
		this.teamName = newName;
		this.teamStudents = teamArray;
		this.teamGrade = new ArrayList<Double>();
	}
	/**
	 * Returns the students on the team.
	 *
	 * @return
	 */
	public ArrayList<Student> getMembers() 
	{
		return this.teamStudents;
	}
	/**
	 * Returns Team name.
	 *
	 * @return
	 */
	public String getName()
	{
		return this.teamName;
	}
	/**
	 * Add Grades to the team.
	 *
	 * @param grade
	 */
	public void addGrade(Double grade)
	{
		this.teamGrade.add(grade);
		for(Student i : this.teamStudents)
		{
			i.addGrade(grade);
		}
	}
	/**
	 * gets the average grade for the team.
	 *
	 * @return
	 */
	public double getTeamAverage()
	{
		double sum = 0.0;
		if(this.teamGrade.size() == 0)
		{
			return 0.0;
		}
		for(double i : this.teamGrade)
		{
			sum = sum + i;
		}
		double average = sum/this.teamGrade.size();
		return average;
	}
}
