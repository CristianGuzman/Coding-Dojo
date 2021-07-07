import java.util.ArrayList;

public class Portfolio {
	
	protected ArrayList<Project> projects;
	
	
	/**
	 * @param
	 */
	public Portfolio() {
		
	}
	
	/**
	 * @param projects
	 */
	public Portfolio(ArrayList<Project> projects) {
		super();
		this.projects = projects;
	}
	
	public double getPortfolioCost () {
		
		double costot = 0;
		for (Project project : projects) {
			costot += project.getInitialCost();
		}
		
		return costot;
		
	}

	/**
	 * @return the projects
	 */
	public ArrayList<Project> getProjects() {
		return projects;
	}

	/**
	 * @param projects the projects to set
	 */
	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}
	
	

}
