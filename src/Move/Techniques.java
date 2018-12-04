package Move;

public class Techniques extends Exercise{
	public Techniques() {
		this.getMoveList().add("muscleups");
		this.getMoveList().add("handStand");
		this.getMoveList().add("fullPlanche");
		this.getMoveList().add("humanFlag");
		this.getMoveList().add("frontLever");
		
		for(int  i = 0 ; i < this.getMoveList().size() ; i++) {
			this.getDefinitionList().add("10 mins");
		}
	}
}
