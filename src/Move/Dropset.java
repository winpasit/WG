package Move;

public class Dropset extends Exercise{
	/* 1)muscleups (5,10,15)
	 * 2)pendLay (5,10,15)
	 * 3)pullups (4,6,8)
	 * 4)deadLift (5,10,15)
	 * 5)invertedRows (5,10,15)
	 */
	 public Dropset() {
		 this.getExerciseList().add("muscleups");
		 this.getExerciseList().add("pendLay");
		 this.getExerciseList().add("pullups");
		 this.getExerciseList().add("deadLift");
		 this.getExerciseList().add("invertedRows");
		 
		 this.getDefinitionList().add("(5,10,15) reps");
		 this.getDefinitionList().add("(5,10,15) reps");
		 this.getDefinitionList().add("(4,6,8) reps");
		 this.getDefinitionList().add("(5,10,15) reps");
		 this.getDefinitionList().add("(5,10,15) reps");
		 
	 }
	
}
