package Move;

public class Techniques extends Exercise{
	public Techniques() {
		this.getExerciseList().add("muscleups");
		this.getExerciseList().add("handStand");
		this.getExerciseList().add("fullPlanche");
		this.getExerciseList().add("humanFlag");
		this.getExerciseList().add("frontLever");
		
		for(int  i = 0 ; i < this.getExerciseList().size() ; i++) {
			this.getDefinitionList().add("10 mins");
		}
	}
}
