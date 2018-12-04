package Move;

public class UpperBody extends Exercise{
	/* 1)barCurl (10 reps)
	 * 2)diamondPushUps (12 reps)
	 * 3)australianPullUps (Max)
	 * 4)pikePushUps (10 reps)
	 * 5)Dips (10 reps)
	 */
	public UpperBody() {
		this.getMoveList().add("barCurl");
		this.getMoveList().add("diamondPushups");
		this.getMoveList().add("australianPullups");
		this.getMoveList().add("pikePushups");
		this.getMoveList().add("frontLever");
		
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("12 reps");
		this.getDefinitionList().add("max");
		this.getDefinitionList().add("10 reps");
		this.getDefinitionList().add("10 reps");
		
	}
		
}
