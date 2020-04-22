
/**
 * Write a description of class Generics here.
 *
 * @Christina, Mansi and Anya
 * @04/21/20
 */
public abstract class Generics {
	public static final String type = "Generic";
	private String subType;

	protected void setType(String type) {
		this.subType = type;
	}
	
	public String getType() {
		return subType;
	}
	
	// force toString
	public abstract String toString();
	
	// object comparison
	public int compareTo(Object o) {
	
		return this.toString().compareTo(o.toString());
	}

}
