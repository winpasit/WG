
public class User {
	private double weight;
	private int dayPerWeek;
	private String bodyShape;
	//private String name;
	
	public User(double weight,int day,String bd) {
		this.weight = weight;
		this.dayPerWeek = day;
		this.bodyShape = bd;
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
	//<-getter
	
}
