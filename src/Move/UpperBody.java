package Move;

public class UpperBody extends Exercise{
	/* 1)barCurl (10 reps)
	 * 2)diamondPushUps (12 reps)
	 * 3)australianPullUps (Max)
	 * 4)pikePushUps (10 reps)
	 * 5)Dips (10 reps)
	 */
	public UpperBody() {
		this.getExerciseList().add("barCurl");
		this.getExerciseList().add("diamondPushups");
		this.getExerciseList().add("australianPullups");
		this.getExerciseList().add("pikePushups");
		this.getExerciseList().add("frontLever");
		
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("12 reps");
		this.getDefinitionList().add("max");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		
	}
		
}
