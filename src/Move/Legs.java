package Move;

public class Legs extends Exercise{
	/* 1.1)alternatingLunge
	 * 1.2)jumpSquat
	 * 1.3)straightLeggedDeadlift
	 * 1.4)gobletSquat
	 * 1.5)pileSquatHoldCalfRaises
	 * 2.1)tripleThreats
	 * 2.2)jumpRaises
	 * 2.3)downwardOuterCalfRaises
	 * 2.4)squatCalfLift
	 * 2.5)tipToePulses
	 * 3.1)explosiveSquatJump
	 * 3.2)closeToWideSquatJump
	 * 3.3)speedSquat
	 * 3.4)squatPulses
	 * 3.5)squatHold
	 */
	
	public Legs() {
		this.getExerciseList().add("alternatingLunge");
		this.getExerciseList().add("jumpSquat");
		this.getExerciseList().add("straightLeggedDeadlift");
		this.getExerciseList().add("gobletSquat");
		this.getExerciseList().add("pileSquatHoldCalfRaises");
		this.getExerciseList().add("tripleThreats");
		this.getExerciseList().add("jumpRaises");
		this.getExerciseList().add("downwardOuterCalfRaises");
		this.getExerciseList().add("squatCalfLift");
		this.getExerciseList().add("tipToePulses");
		this.getExerciseList().add("explosiveSquatJump");
		this.getExerciseList().add("closeToWideSquatJump");
		this.getExerciseList().add("speedSquat");
		this.getExerciseList().add("squatPulses");
		this.getExerciseList().add("squatHold");
		
		for(int  i = 0 ; i < this.getExerciseList().size() ; i++) {
			this.getDefinitionList().add("1 min");
		}
		
	}
}
