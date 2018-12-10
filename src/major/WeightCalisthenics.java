package major;

import Move.*;

public class WeightCalisthenics extends Training {

	public WeightCalisthenics() {
		this.getWeekExerciseList().add(new UpperBody());
		this.getWeekExerciseList().add(new LowerBody());
		this.getWeekExerciseList().add(new ResistanceBand());
		this.getWeekExerciseList().add(new WeightVest());
		this.getWeekExerciseList().add(new ExplosiveTraining());
		this.getWeekExerciseList().add(new Dropset());
		this.getWeekExerciseList().add(new Rest());

	}
}
