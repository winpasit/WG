package Move;
import major.*;
import Interface. *;

public class Cardio extends Exercise implements BurnFatable {
	int calories;
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
	
	public void burnFat(){ 
		
	       calories += 500; 
	       
	    } 
	
	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Cardio(Training t) {
		if(t instanceof WeightTraining) {
			this.getMoveList().add("run");
			this.getDefinitionList().add("40 min");
		}else if(t instanceof Calisthenics) {
			this.getMoveList().add("burpees");
			this.getMoveList().add("jumpingJacks");
			this.getMoveList().add("inAndOuts");
			this.getMoveList().add("kneesTaps");
			this.getMoveList().add("jumpSquats");
			
			this.getDefinitionList().add("20 reps");
			this.getDefinitionList().add("50 reps");
			this.getDefinitionList().add("20 reps");
			this.getDefinitionList().add("50 reps");
			this.getDefinitionList().add("20 reps");
		}
		while(this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
}
