package Move;

public class ForearmBack extends Exercise{
	/* 1.1)fingerWristsCurls
	 * 1.2)frontedRearRotations
	 * 1.3)speed180SideRotations
	 * 1.4)sideReverseWristsCurls
	 * 1.5)rearedFrontRotations
	 * 2.1)overheadShrugs
	 * 2.2)bentOverRow
	 * 2.3)yBacks
	 * 2.4)straightArmPullover
	 * 2.5)weightedSuperman
	 */
	
	public ForearmBack() {
		this.getMoveList().add("fingerWristsCurls");
		this.getMoveList().add("frontedRearRotations");
		this.getMoveList().add("speed180SideRotations");
		this.getMoveList().add("sideReverseWristsCurls");
		this.getMoveList().add("rearedFrontRotations");
		this.getMoveList().add("overheadShrugs");
		this.getMoveList().add("bentOverRow");
		this.getMoveList().add("yBacks");
		this.getMoveList().add("straightArmPullover");
		this.getMoveList().add("weightedSuperman");
		
		 
		for(int  i = 0 ; i < this.getMoveList().size() ; i++) {
			this.getDefinitionList().add("1 min");
		}
		
		while(this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
		
	}
}
