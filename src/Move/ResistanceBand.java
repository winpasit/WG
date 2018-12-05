package Move;

public class ResistanceBand extends Exercise{
	/* 1)pushUps (10 reps)
	 * 2)squats (10 reps)
	 * 3)pullUps (10 reps)
	 * 4)tricepsExtensions (10 reps)
	 * 5)handStandPushUps (5 reps)
	 */
	
	public ResistanceBand(){
		this.getMoveList().add("pushups");
		this.getMoveList().add("squats");
		this.getMoveList().add("pullUps");
		this.getMoveList().add("tricepsExtensions");
		this.getMoveList().add("handStandPushUps");
		
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("5 reps");
		
		while(this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
}
