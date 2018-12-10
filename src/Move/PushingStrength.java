package Move;

public class PushingStrength extends Exercise {

	public PushingStrength() {
		this.getMoveList().add("Pushups");
		this.getMoveList().add("Dips");
		this.getMoveList().add("Widegrip Pushups");
		this.getMoveList().add("Straight Bar Dips");
		this.getMoveList().add("Closegrip Pushups");

		this.getDefinitionList().add("40 reps");
		this.getDefinitionList().add("20 reps");
		this.getDefinitionList().add("30 reps");
		this.getDefinitionList().add("20 reps");
		this.getDefinitionList().add("30 reps");

		while (this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
}
