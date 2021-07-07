
public class Project {
	
	
	protected String nombre ;
	
	
	protected String descripcion;
	
	protected double initialCost; 
	
	
	/**
	 * constructor
	 **/
	public Project() { 
		
	}
	
	/**
	 * @param nombre
	 */
	public Project(String name) {
		
	}
	
	/**
	 * @param nombre
	 * @param descripcion
	 */
	public Project(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	/**
	 * @param nombre
	 * @param descripcion
	 */
	public String elevatorPitch() {
		
		String cadena = this.nombre.concat("("+this.initialCost+")").concat(this.descripcion);
		return cadena;
		
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the initialCost
	 */
	public double getInitialCost() {
		return initialCost;
	}

	/**
	 * @param initialCost the initialCost to set
	 */
	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}

	
	

}
