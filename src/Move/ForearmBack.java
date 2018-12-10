package Move;

public class ForearmBack extends Exercise {
	/*
	 * 1.1)fingerWristsCurls 1.2)frontedRearRotations 1.3)speed180SideRotations
	 * 1.4)sideReverseWristsCurls 1.5)rearedFrontRotations 2.1)overheadShrugs
	 * 2.2)bentOverRow 2.3)yBacks 2.4)straightArmPullover 2.5)weightedSuperman
	 */

	public ForearmBack() {
		this.getMoveList().add("Finger Wrists Curls");
		this.getMoveList().add("Fronted Rear Rotations");
		this.getMoveList().add("Speed 180 Side Rotations");
		this.getMoveList().add("Side Reverse Wrists Curls");
		this.getMoveList().add("Reared Front Rotations");
		this.getMoveList().add("Overheaded Shrugs");
		this.getMoveList().add("Bent Over Row");
		this.getMoveList().add("Y Backs");
		this.getMoveList().add("Straight Arm Pullover");
		this.getMoveList().add("Weighted Superman");

		for (int i = 0; i < this.getMoveList().size(); i++) {
			this.getDefinitionList().add("1 min");
		}

		while (this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}

	}
}
