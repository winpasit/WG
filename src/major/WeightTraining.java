package major;

import Move.*;

public class WeightTraining extends Training {

	public WeightTraining() {
		this.getWeekExerciseList().add(new BicepsChest());
		this.getWeekExerciseList().add(new ShouldersTriceps());
		this.getWeekExerciseList().add(new Core(this, 4));
		this.getWeekExerciseList().add(new Legs());
		this.getWeekExerciseList().add(new Cardio(this));
		this.getWeekExerciseList().add(new ForearmBack());
		this.getWeekExerciseList().add(new Rest());
	}
}
