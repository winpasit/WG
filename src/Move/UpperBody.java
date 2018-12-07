package Move;

public class UpperBody extends Exercise{
	/* 1)barCurl (10 reps)
	 * 2)diamondPushUps (12 reps)
	 * 3)australianPullUps (Max)
	 * 4)pikePushUps (10 reps)
	 * 5)Dips (10 reps)
	 */
	public UpperBody() {
		this.getMoveList().add("Bar Curl");
		this.getMoveList().add("Diamond Pushups");
		this.getMoveList().add("Australian Pullups");
		this.getMoveList().add("Pike Pushups");
		this.getMoveList().add("Front Lever");
		
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("12 reps");
		this.getDefinitionList().add("max");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		
		
		while(this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
		
}
