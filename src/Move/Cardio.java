package Move;
import major.*;

public class Cardio extends Exercise{
	/* WeightTraining
	 * run (40 min)
	 */
	
	/* Calisthenics
	 * 1.1)burpees (20 reps)
	 * 1.2)jumpingJacks (50 reps)
	 * 1.3)inAndOuts (20 reps)
	 * 1.4)kneesTaps (50 reps)
	 * 1.5)jumpSquats (20 reps)
	 */
	
	
	public Cardio(Training t) {
		if(t instanceof WeightTraining) {
			this.getExerciseList().add("run");
			this.getDefinitionList().add("40 min");
		}else if(t instanceof Calisthenics) {
			this.getExerciseList().add("burpees");
			this.getExerciseList().add("jumpingJacks");
			this.getExerciseList().add("inAndOuts");
			this.getExerciseList().add("kneesTaps");
			this.getExerciseList().add("jumpSquats");
			
			this.getDefinitionList().add("20 reps");
			this.getDefinitionList().add("50 reps");
			this.getDefinitionList().add("20 reps");
			this.getDefinitionList().add("50 reps");
			this.getDefinitionList().add("20 reps");
		}
	}
}
