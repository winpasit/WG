package major;


public class User {
	private double weight;
	private int dayPerWeek;
	private String bodyShape;
	private String name;
	
	public User() {

	}

	
	//getter->
	public double getWeight() {
		return this.weight;
	}
	
	public int getDayPerWeek() {
		return this.dayPerWeek;
	}
	
	public String getBodyShape() {
		return this.bodyShape;
	}
	
	public String getName() {
		return this.name;
	}
	//<-getter
	
	//setter->
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setDayPerWeek(int dayPerWeek) {
		this.dayPerWeek = dayPerWeek;
	}
	
	public void setBodyShape(String bodyShape) {
		this.bodyShape = bodyShape;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
