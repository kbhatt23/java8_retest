package bean;

import java.util.List;

public class Player  implements Comparable<Player>{
	private String[] arrayEntries={"entry1","entry2","entry3","entry4"};
	private int goals;
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public String[] getArrayEntries() {
		return arrayEntries;
	}
	public void setArrayEntries(String[] arrayEntries) {
		this.arrayEntries = arrayEntries;
	}
	public Player() {
		
	}
public Player(String name) {
		this.name=name;
	}
public Player(String name, int age) {
	this.name=name;
	this.age=age;
}

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPlayerGood() {
		return this.getCategoryLevel() == CategoryLevel.A || this.getCategoryLevel() == CategoryLevel.B;
	}
	public Player(String name, int jersey, List<String> hobbies, int age, CategoryLevel categoryLevel,int goals) {
		super();
		this.name = name;
		this.jersey = jersey;
		this.hobbies = hobbies;
		this.age = age;
		this.categoryLevel = categoryLevel;
		this.goals=goals;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", jersey=" + jersey + ", hobbies=" + hobbies + ", age=" + age
				+ ", categoryLevel=" + categoryLevel + "]"
				+ ", arrayEntries=" + arrayEntries + "]"
				+ ", goals=" + goals + "]";
	}
	public int getJersey() {
		return jersey;
	}
	public void setJersey(int jersey) {
		this.jersey = jersey;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public CategoryLevel getCategoryLevel() {
		return categoryLevel;
	}
	public void setCategoryLevel(CategoryLevel categoryLevel) {
		this.categoryLevel = categoryLevel;
	}
	private int jersey;
	private List<String> hobbies;
	private int age;
	//A,B,C
	private CategoryLevel categoryLevel;
	
	public void print() {
		System.out.println(this.getName());
	}
	
	@Override
	public int hashCode() {
		return this.name.length();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean isEqual = false;
		if(obj instanceof Player && ((Player)obj).getName().equals(this.getName())) {
			isEqual=true;
		}
		return isEqual;
	}
	@Override
	//reverse sort
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return o.getName().compareTo(this.getName());
	}
}
