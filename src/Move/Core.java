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
			this.getMoveList().add("fullSitUpToToes");
			this.getMoveList().add("90DegreeSitUpToToes");
			this.getMoveList().add("toeTouches");
			this.getMoveList().add("rowBoats");
			this.getMoveList().add("speedCrunches");
			this.getMoveList().add("cSitHold");
			this.getMoveList().add("suitcase");
			this.getMoveList().add("midCrunchers");
			this.getMoveList().add("touchAndGos");
			this.getMoveList().add("busters");
			this.getMoveList().add("legCrunches");
			this.getMoveList().add("reverseHipThrust");
			this.getMoveList().add("seatedBikes");
			this.getMoveList().add("psychoCrunches");
			this.getMoveList().add("scissorKicks");
			
			for(int  i = 0 ; i < this.getMoveList().size() ; i++) {
				this.getDefinitionList().add("1 min");
			}
		}
		
		if(t instanceof Calisthenics) {
			if(day == 2) {
				this.getMoveList().add("crucitix");
				this.getMoveList().add("seatedInAndOuts");
				this.getMoveList().add("legFlutters");
				this.getMoveList().add("russianTwists");
				this.getMoveList().add("crunches");
				
				for(int  i = 0 ; i < this.getMoveList().size() ; i++) {
					this.getDefinitionList().add("40 reps");
				}
			}
			if(day == 5) {
				this.getMoveList().add("c-SitHold");
				this.getMoveList().add("hangingl-Sit");
				this.getMoveList().add("plank");
				this.getMoveList().add("l-Sit");
				this.getMoveList().add("mountainCimblers");
				
				for(int  i = 0 ; i < this.getMoveList().size() ; i++) {
					this.getDefinitionList().add("1 min");
				}
			}
		}
		
		while(this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
}
