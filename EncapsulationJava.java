package JavaNewProgram.JavaNewProgramDemo;

// Assignment 119 WAP on Encapsulation
class Programmer {
	private String name;
	private int id;
	// Getter and Setter for name
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class EncapsulationJava {

	public static void main(String[] args) {

		        Programmer p = new Programmer();
		        p.setName("Geek"); 
		        p.setId(23);
		        System.out.println("Id=> " + p.getId());
		        System.out.println("Name=> " + p.getName());
	}

}
