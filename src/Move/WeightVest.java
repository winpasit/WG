package Move;
public class WeightVest extends Exercise{
	/* 1)pullUps (10 reps)
	 * 2)ringsDips (10 reps)
	 * 3)pushUps (10 reps)
	 * 4)fullPlanche (10 secs)
	 * 5)frontLever (10 secs)
	 */
	public WeightVest() {
		this.getExerciseList().add("pullUps");
		this.getExerciseList().add("ringsDips");
		this.getExerciseList().add("pushups");
		this.getExerciseList().add("fullPlanche");
		this.getExerciseList().add("frontLever");
		
		for(int  i = 0 ; i < this.getExerciseList().size() ; i++) {
			this.getDefinitionList().add("10 secs");
		}
	}
}
