package major;

import Move.*;

public class Calisthenics extends Training {
	public Calisthenics() {
		this.getWeekExerciseList().add(new PullingStrength());
		this.getWeekExerciseList().add(new Core(this, 2));
		this.getWeekExerciseList().add(new PushingStrength());
		this.getWeekExerciseList().add(new Cardio(this));
		this.getWeekExerciseList().add(new Core(this, 5));
		this.getWeekExerciseList().add(new Techniques());
		this.getWeekExerciseList().add(new Rest());
	}
}
