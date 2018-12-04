package Move;
public class WeightVest extends Exercise{
	/* 1)pullUps (10 reps)
	 * 2)ringsDips (10 reps)
	 * 3)pushUps (10 reps)
	 * 4)fullPlanche (10 secs)
	 * 5)frontLever (10 secs)
	 */
	public WeightVest() {
		this.getMoveList().add("pullUps");
		this.getMoveList().add("ringsDips");
		this.getMoveList().add("pushups");
		this.getMoveList().add("fullPlanche");
		this.getMoveList().add("frontLever");
		
		for(int  i = 0 ; i < this.getMoveList().size() ; i++) {
			this.getDefinitionList().add("10 secs");
		}
	}
}
