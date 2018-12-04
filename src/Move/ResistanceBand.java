package Move;

public class ResistanceBand extends Exercise{
	/* 1)pushUps (10 reps)
	 * 2)squats (10 reps)
	 * 3)pullUps (10 reps)
	 * 4)tricepsExtensions (10 reps)
	 * 5)handStandPushUps (5 reps)
	 */
	
	public ResistanceBand(){
		this.getExerciseList().add("pushups");
		this.getExerciseList().add("squats");
		this.getExerciseList().add("pullUps");
		this.getExerciseList().add("tricepsExtensions");
		this.getExerciseList().add("handStandPushUps");
		
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("5 reps");
		
	}
}
