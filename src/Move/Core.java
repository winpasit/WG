package Move;
import major.*;

public class Core extends Exercise{
	/* WeightTraining
	 * 1.1)fullSitUpToToes (1min)
	 * 1.2)90DegreeSitUpToToes (1min)
	 * 1.3)toeTouches (1min)
	 * 1.4)rowBoats (1min)
	 * 1.5)speedCrunches (1min)
	 * 2.1)cSitHold (1min)
	 * 2.2)suitcase (1min)
	 * 2.3)midCrunchers (1min)
	 * 2.4)touchAndGos (1min)
	 * 2.5)busters (1min)
	 * 3.1)legCrunches (1min)
	 * 3.2)reverseHipThrust (1min)
	 * 3.3)seatedBikes (1min)
	 * 3.4)psychoCrunches (1min)
	 * 3.5)scissorKicks (1min)
	 */
	
	/* Calisthenics
	 * day2
	 * 1.1)crucitix (40 reps)
	 * 1.2)seatedInAndOuts (40 reps)
	 * 1.3)legFlutters (40 reps)
	 * 1.4)russianTwists (40 reps)
	 * 1.5)crunches (40 reps)
	 * day5
	 * 1.1)c-SitHold (1 min)
	 * 1.2)hangingl-Sit (1 min)
	 * 1.3)plank (1 min)
	 * 1.4)l-Sit (1 min)
	 * 1.5)mountainCimblers (1 min)
	 */
	
	public Core(Training t,int day) {
		if(t instanceof WeightTraining) {
			this.getExerciseList().add("fullSitUpToToes");
			this.getExerciseList().add("90DegreeSitUpToToes");
			this.getExerciseList().add("toeTouches");
			this.getExerciseList().add("rowBoats");
			this.getExerciseList().add("speedCrunches");
			this.getExerciseList().add("cSitHold");
			this.getExerciseList().add("suitcase");
			this.getExerciseList().add("midCrunchers");
			this.getExerciseList().add("touchAndGos");
			this.getExerciseList().add("busters");
			this.getExerciseList().add("legCrunches");
			this.getExerciseList().add("reverseHipThrust");
			this.getExerciseList().add("seatedBikes");
			this.getExerciseList().add("psychoCrunches");
			this.getExerciseList().add("scissorKicks");
			
			for(int  i = 0 ; i < this.getExerciseList().size() ; i++) {
				this.getDefinitionList().add("1 min");
			}
		}
		
		if(t instanceof Calisthenics) {
			if(day == 2) {
				this.getExerciseList().add("crucitix");
				this.getExerciseList().add("seatedInAndOuts");
				this.getExerciseList().add("legFlutters");
				this.getExerciseList().add("russianTwists");
				this.getExerciseList().add("crunches");
				
				for(int  i = 0 ; i < this.getExerciseList().size() ; i++) {
					this.getDefinitionList().add("40 reps");
				}
			}
			if(day == 5) {
				this.getExerciseList().add("c-SitHold");
				this.getExerciseList().add("hangingl-Sit");
				this.getExerciseList().add("plank");
				this.getExerciseList().add("l-Sit");
				this.getExerciseList().add("mountainCimblers");
				
				for(int  i = 0 ; i < this.getExerciseList().size() ; i++) {
					this.getDefinitionList().add("1 min");
				}
			}
		}
	}
}
