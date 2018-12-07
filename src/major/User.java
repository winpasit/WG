package major;


public class User {
	private int weight;
	private int height;
	private String bodyShape;
	private String name;
	
	public User() {

	}

	
	//getter->
	public int getWeight() {
		return this.weight;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public String getBodyShape() {
		return this.bodyShape;
	}
	
	public String getName() {
		return this.name;
	}
	//<-getter
	
	//setter->
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setBodyShape(String bodyShape) {
		this.bodyShape = bodyShape;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
