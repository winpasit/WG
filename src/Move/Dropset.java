package Move;

public class Dropset extends Exercise{
	/* 1)muscleups (5,10,15)
	 * 2)pendLay (5,10,15)
	 * 3)pullups (4,6,8)
	 * 4)deadLift (5,10,15)
	 * 5)invertedRows (5,10,15)
	 */
	 public Dropset() {
		 this.getMoveList().add("muscleups");
		 this.getMoveList().add("pendLay");
		 this.getMoveList().add("pullups");
		 this.getMoveList().add("deadLift");
		 this.getMoveList().add("invertedRows");
		 
		 this.getDefinitionList().add("(5,10,15) reps");
		 this.getDefinitionList().add("(5,10,15) reps");
		 this.getDefinitionList().add("(4,6,8) reps");
		 this.getDefinitionList().add("(5,10,15) reps");
		 this.getDefinitionList().add("(5,10,15) reps");
		 
		 while(this.getMoveList().size() != 15) {
				this.getMoveList().add("");
				this.getDefinitionList().add("");
			}
	 }
	
}
