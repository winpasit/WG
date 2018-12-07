package Move;
public class WeightVest extends Exercise{
	/* 1)pullUps (10 reps)
	 * 2)ringsDips (10 reps)
	 * 3)pushUps (10 reps)
	 * 4)fullPlanche (10 secs)
	 * 5)frontLever (10 secs)
	 */
	public WeightVest() {
		this.getMoveList().add("Pullups");
		this.getMoveList().add("Ring Dips");
		this.getMoveList().add("Pushups");
		this.getMoveList().add("Full Planche");
		this.getMoveList().add("Front Lever");
		
		for(int  i = 0 ; i < this.getMoveList().size() ; i++) {
			this.getDefinitionList().add("10 secs");
		}
		
		while(this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
}
