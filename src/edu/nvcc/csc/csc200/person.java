package edu.nvcc.csc.csc200;
/**
 * GNU License
 * Date: 11/17/2016
 * @author jonathanmoya123
 * Purpose:
 * Person class composes of name and age.
 */
public class person {
	private String name;
	private int age;
	/**
	 * Construct a new person with name = Jonathan and age =0.
	 */
	public person() {
		name = "Jonathan";
		age = 0;	
	}
	/**
	 * Construct a new person with the values provided from the name and age parameter.
	 * @param name the name of a person
	 * @param age the age of the person
	 */
	
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * get the name of a person
	 * @return name of a person
	 */
	
	public String getName() {
		
		return this.name;
	}
	/**
	 * Set the name of a person according to name parameter.
	 * @param name of a person
	 */
	public void setName(String name) {
		this.name=name;
		
	}
	/**
	 * 
	 * Get the age of a person
	 * @return age of a person
	 */
	public int getAge(){
		return age;
	}
	/**
	 * set the age of a person according to age parameter.
	 * @param age age of a person
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Return a name and age of a person.
	 */
	public String toString() {
		return "Nane: " + name + "Age:" + age;
	}

}
