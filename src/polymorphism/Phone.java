package polymorphism;

public class Phone {

	  private String Model;

	public Phone(String model) {
		
		Model = model;
	}
	  
	 public void features()
	 {
		 System.out.println("feature phone");
	 }

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}
	 
	 
}
