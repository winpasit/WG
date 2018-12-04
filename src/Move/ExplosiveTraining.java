package Move;
public class ExplosiveTraining extends Exercise{
	/* 1)pullups (10 reps)
	 * 2)pushups (10 reps)
	 * 3)dips (10 reps)
	 * 4)jumpSquats (10 reps)
	 * 5)burpees (20 reps)
	 */
	
	public ExplosiveTraining() {
		this.getExerciseList().add("pullups");
		this.getExerciseList().add("pushups");
		this.getExerciseList().add("dips");
		this.getExerciseList().add("jumpSquats");
		this.getExerciseList().add("burpees");
		 
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("20 reps");
	}

}
