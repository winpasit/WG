package Move;

public class Legs extends Exercise {
	/*
	 * 1.1)alternatingLunge 1.2)jumpSquat 1.3)straightLeggedDeadlift 1.4)gobletSquat
	 * 1.5)pileSquatHoldCalfRaises 2.1)tripleThreats 2.2)jumpRaises
	 * 2.3)downwardOuterCalfRaises 2.4)squatCalfLift 2.5)tipToePulses
	 * 3.1)explosiveSquatJump 3.2)closeToWideSquatJump 3.3)speedSquat
	 * 3.4)squatPulses 3.5)squatHold
	 */

	public Legs() {
		this.getMoveList().add("Alternating Lunge");
		this.getMoveList().add("Jump Squat");
		this.getMoveList().add("Straight Legged Deadlift");
		this.getMoveList().add("Goblet Squat");
		this.getMoveList().add("Pile Squat Hold Calf Raises");
		this.getMoveList().add("Triple Threats");
		this.getMoveList().add("Jump Raises");
		this.getMoveList().add("Downward Outer Calf Raises");
		this.getMoveList().add("Squat Calf Lift");
		this.getMoveList().add("Tip Toe Pulses");
		this.getMoveList().add("Explosive Squat Jump");
		this.getMoveList().add("Close to Wide Squat Jump");
		this.getMoveList().add("Speed Squat");
		this.getMoveList().add("Squat Pulses");
		this.getMoveList().add("Squat Hold");

		for (int i = 0; i < this.getMoveList().size(); i++) {
			this.getDefinitionList().add("1 min");
		}

		while (this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}

	}
}
