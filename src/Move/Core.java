package Move;

import major.*;

public class Core extends Exercise {
	/*
	 * WeightTraining 1.1)fullSitUpToToes (1min) 1.2)90DegreeSitUpToToes (1min)
	 * 1.3)toeTouches (1min) 1.4)rowBoats (1min) 1.5)speedCrunches (1min)
	 * 2.1)cSitHold (1min) 2.2)suitcase (1min) 2.3)midCrunchers (1min)
	 * 2.4)touchAndGos (1min) 2.5)busters (1min) 3.1)legCrunches (1min)
	 * 3.2)reverseHipThrust (1min) 3.3)seatedBikes (1min) 3.4)psychoCrunches (1min)
	 * 3.5)scissorKicks (1min)
	 */

	/*
	 * Calisthenics day2 1.1)crucifix (40 reps) 1.2)seatedInAndOuts (40 reps)
	 * 1.3)legFlutters (40 reps) 1.4)russianTwists (40 reps) 1.5)crunches (40 reps)
	 * day5 1.1)c-SitHold (1 min) 1.2)hangingl-Sit (1 min) 1.3)plank (1 min)
	 * 1.4)l-Sit (1 min) 1.5)mountainCimblers (1 min)
	 */

	public Core(Training t, int day) {
		if (t instanceof WeightTraining) {
			this.getMoveList().add("Full SitUp to Toes");
			this.getMoveList().add("90 Degree SitUp to Toes");
			this.getMoveList().add("Toe Touches");
			this.getMoveList().add("Row Boats");
			this.getMoveList().add("Speed Crunches");
			this.getMoveList().add("C-Sit Hold");
			this.getMoveList().add("Suitcase");
			this.getMoveList().add("Mid Crunchers");
			this.getMoveList().add("Touch and Gos");
			this.getMoveList().add("Busters");
			this.getMoveList().add("Leg Crunches");
			this.getMoveList().add("Reverse Hip Thrusts");
			this.getMoveList().add("Seated Bikes");
			this.getMoveList().add("Psycho Crunches");
			this.getMoveList().add("Scissor Kicks");

			for (int i = 0; i < this.getMoveList().size(); i++) {
				this.getDefinitionList().add("1 min");
			}
		}

		if (t instanceof Calisthenics) {
			if (day == 2) {
				this.getMoveList().add("Crucifix");
				this.getMoveList().add("Seated in and outs");
				this.getMoveList().add("Leg Flutters");
				this.getMoveList().add("Russian Twists");
				this.getMoveList().add("Crunches");

				for (int i = 0; i < this.getMoveList().size(); i++) {
					this.getDefinitionList().add("40 reps");
				}
			}
			if (day == 5) {
				this.getMoveList().add("C-Sit Hold");
				this.getMoveList().add("Hanging L-Sit");
				this.getMoveList().add("Plank");
				this.getMoveList().add("L-Sit");
				this.getMoveList().add("Mountain Climbers");

				for (int i = 0; i < this.getMoveList().size(); i++) {
					this.getDefinitionList().add("1 min");
				}
			}
		}

		while (this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
}
