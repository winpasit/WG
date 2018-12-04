package Move;

public class ShouldersTriceps extends Exercise {
	/* 1.1)reverseFly
	 * 1.2)sideLateralRaise
	 * 1.3)frontRaise
	 * 1.4)uprightRow
	 * 1.5)arnoldPress
	 * 2.1)tricepPress
	 * 2.2)kickbacks
	 * 2.3)skullCrushers
	 * 2.4)tatePress
	 * 2.5)closeGripBenchPress
	 */
	
	public ShouldersTriceps() {
		this.getExerciseList().add("reverseFly");
		this.getExerciseList().add("sideLateralRaise");
		this.getExerciseList().add("frontRaise");
		this.getExerciseList().add("uprightRow");
		this.getExerciseList().add("arnoldPress");
		this.getExerciseList().add("tricepPress");
		this.getExerciseList().add("kickbacks");
		this.getExerciseList().add("skullCrushers");
		this.getExerciseList().add("tatePress");
		this.getExerciseList().add("closeGripBenchPress");
		
		
		for(int  i = 0 ; i < this.getExerciseList().size() ; i++) {
			this.getDefinitionList().add("1 min");
		}
	}
}
