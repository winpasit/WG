package Move;

public class ExplosiveTraining extends Exercise {
	/*
	 * 1)pullups (10 reps) 2)pushups (10 reps) 3)dips (10 reps) 4)jumpSquats (10
	 * reps) 5)burpees (20 reps)
	 */

	public ExplosiveTraining() {
		this.getMoveList().add("Pullups");
		this.getMoveList().add("Pushups");
		this.getMoveList().add("Dips");
		this.getMoveList().add("Jump Squats");
		this.getMoveList().add("Burpees");

		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("20 reps");

		while (this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}

}
