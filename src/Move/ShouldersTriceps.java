package Move;

public class ShouldersTriceps extends Exercise {
	/* 1.1)reverseFly
	 * 1.2)sideLateralRaise
	 * 1.3)frontRaise
	 * 1.4)uprightRow
	 * 1.5)arnoldPress
	 * 2.1)tricepPress
	 * 2.2)kickbacks
	 * 2.3)skullCrushers
	 * 2.4)tatePress
	 * 2.5)closeGripBenchPress
	 */
	
	public ShouldersTriceps() {
		this.getMoveList().add("reverseFly");
		this.getMoveList().add("sideLateralRaise");
		this.getMoveList().add("frontRaise");
		this.getMoveList().add("uprightRow");
		this.getMoveList().add("arnoldPress");
		this.getMoveList().add("tricepPress");
		this.getMoveList().add("kickbacks");
		this.getMoveList().add("skullCrushers");
		this.getMoveList().add("tatePress");
		this.getMoveList().add("closeGripBenchPress");
		
		
		for(int  i = 0 ; i < this.getMoveList().size() ; i++) {
			this.getDefinitionList().add("1 min");
		}
	}
}
