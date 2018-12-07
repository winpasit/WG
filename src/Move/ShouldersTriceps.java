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
		this.getMoveList().add("Reverse Fly");
		this.getMoveList().add("Side Lateral Raise");
		this.getMoveList().add("Front Raise");
		this.getMoveList().add("Upright Row");
		this.getMoveList().add("Arnold Press");
		this.getMoveList().add("Tricep Press");
		this.getMoveList().add("Kickbacks");
		this.getMoveList().add("Skull Crushers");
		this.getMoveList().add("TatePress");
		this.getMoveList().add("Closegrip BenchPress");
		
		
		for(int  i = 0 ; i < this.getMoveList().size() ; i++) {
			this.getDefinitionList().add("1 min");
		}
		
		while(this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
}
