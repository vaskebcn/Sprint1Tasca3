package tasca3n1exercici1;

public class Month {
	
	private String name;
	
	public Month(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Month [name=" + this.name + "]";
	}
	

}
