package Move;
public class LowerBody extends Exercise {
	/* 1)moutainClimbers (30 secs)
	 * 2)plank (45 secs)
	 * 3)squats (30 reps)
	 * 4)jumpingJacks (30 reps)
	 * 5)boatHold (10 reps)
	 */
	
	public LowerBody() {
		this.getMoveList().add("Mountain Climbers");
		this.getMoveList().add("Plank");
		this.getMoveList().add("Squats");
		this.getMoveList().add("Jumping Jacks");
		this.getMoveList().add("Plank");
		
		this.getDefinitionList().add("30 secs");
		this.getDefinitionList().add("45 secs");
		this.getDefinitionList().add("30 reps");
		this.getDefinitionList().add("30 reps");
		this.getDefinitionList().add("10 reps");
		
		while(this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
}
