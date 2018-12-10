package Move;

public class ResistanceBand extends Exercise {
	/*
	 * 1)pushUps (10 reps) 2)squats (10 reps) 3)pullUps (10 reps)
	 * 4)tricepsExtensions (10 reps) 5)handStandPushUps (5 reps)
	 */

	public ResistanceBand() {
		this.getMoveList().add("Pushups");
		this.getMoveList().add("Squats");
		this.getMoveList().add("PullUps");
		this.getMoveList().add("Triceps Extensions");
		this.getMoveList().add("Handstand PushUps");

		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("5 reps");

		while (this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
}
