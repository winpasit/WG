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
		this.getExerciseList().add("fingerWristsCurls");
		this.getExerciseList().add("frontedRearRotations");
		this.getExerciseList().add("speed180SideRotations");
		this.getExerciseList().add("sideReverseWristsCurls");
		this.getExerciseList().add("rearedFrontRotations");
		this.getExerciseList().add("overheadShrugs");
		this.getExerciseList().add("bentOverRow");
		this.getExerciseList().add("yBacks");
		this.getExerciseList().add("straightArmPullover");
		this.getExerciseList().add("weightedSuperman");
		
		 
		for(int  i = 0 ; i < this.getExerciseList().size() ; i++) {
			this.getDefinitionList().add("1 min");
		}
		
	}
}
