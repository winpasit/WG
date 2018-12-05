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
		this.getMoveList().add("alternatingLunge");
		this.getMoveList().add("jumpSquat");
		this.getMoveList().add("straightLeggedDeadlift");
		this.getMoveList().add("gobletSquat");
		this.getMoveList().add("pileSquatHoldCalfRaises");
		this.getMoveList().add("tripleThreats");
		this.getMoveList().add("jumpRaises");
		this.getMoveList().add("downwardOuterCalfRaises");
		this.getMoveList().add("squatCalfLift");
		this.getMoveList().add("tipToePulses");
		this.getMoveList().add("explosiveSquatJump");
		this.getMoveList().add("closeToWideSquatJump");
		this.getMoveList().add("speedSquat");
		this.getMoveList().add("squatPulses");
		this.getMoveList().add("squatHold");
		
		for(int  i = 0 ; i < this.getMoveList().size() ; i++) {
			this.getDefinitionList().add("1 min");
		}
		
		while(this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
		
	}
}
