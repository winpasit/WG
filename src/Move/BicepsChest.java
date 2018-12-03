package Move;
import major.*;

public class BicepsChest extends Exercise {
	/* 1.1)wideCurl (1min)
	 * 1.2)hammerCurl (1min)
	 * 1.3)dragCurl (1min)
	 * 1.4)reverseCurl (1min)
	 * 1.5)straightCurl (1min)
	 * 2.1)valleyPress (1min)
	 * 2.2)standingValleyPress (1min)
	 * 2.3)reverseWideBenchPress (1min)
	 * 2.4)lyingRegularFly (1min)
	 * 2.5)regularWideBenchPress (1min)
	 */
	public BicepsChest(Training t) {
		super(t);
		this.getExerciseList().add("wideCurl");
		this.getExerciseList().add("hammerCurl");
		this.getExerciseList().add("dragCurl");
		this.getExerciseList().add("reverseCurl");
		this.getExerciseList().add("straightCurl");
		this.getExerciseList().add("valleyPress");
		this.getExerciseList().add("standingValleyPress");
		this.getExerciseList().add("reverseWideBenchPress");
		this.getExerciseList().add("lyingRegularFly");
		this.getExerciseList().add("regularWideBenchPress");
		
		for(int  i = 0 ; i < this.getExerciseList().size() ; i++) {
			this.getDefinitionList().add("1 min");
		}
	}
}
