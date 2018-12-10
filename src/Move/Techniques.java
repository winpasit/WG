package Move;

public class Techniques extends Exercise {
	public Techniques() {
		this.getMoveList().add("Muscleups");
		this.getMoveList().add("Handstand");
		this.getMoveList().add("Full Planche");
		this.getMoveList().add("Human Flag");
		this.getMoveList().add("Front Lever");

		for (int i = 0; i < this.getMoveList().size(); i++) {
			this.getDefinitionList().add("10 mins");
		}

		while (this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
}
