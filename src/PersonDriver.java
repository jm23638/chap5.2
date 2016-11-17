import edu.nvcc.csc.csc200.person;

public class PersonDriver {

	public static void main(String[] args) {
		person jonathan = new person();
		System.out.println(jonathan);
		jonathan.setName("Jonathan");
		jonathan.setAge(18);
		System.out.println(jonathan.getName());
		System.out.println(jonathan.getAge());
		
		person celeste = new person("Celeste", 45);
		
		if(jonathan.getName().equals(celeste.getName()) && jonathan.getAge() == celeste.getAge()){
			System.out.println("Two perosons name and age are equal.");
		} else {
			System.out.println("Two persons name and age are not equal.");
		}
		
		if(jonathan.getAge() < celeste.getAge()){
			System.out.println("Celeste is older!");
		} else {
			System.out.println("Jonathan is younger!");
		}
	}

}
