package Move;

public class PullingStrength extends Exercise{
	public PullingStrength() {
		this.getMoveList().add("Chinups");
		this.getMoveList().add("Commando Pullups");
		this.getMoveList().add("Closegrip Pullups");
		this.getMoveList().add("Pullups");
		this.getMoveList().add("Widegrip Pullups");
		
		this.getDefinitionList().add("15 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		
		while(this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
		
	}
}
