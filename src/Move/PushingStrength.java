package Move;

public class PushingStrength extends Exercise{
	
	public PushingStrength() {
		this.getMoveList().add("pushups");
		this.getMoveList().add("dips");
		this.getMoveList().add("wideGripPushups");
		this.getMoveList().add("straightBarDips");
		this.getMoveList().add("closeGripPushups");
		
		this.getDefinitionList().add("40 reps");
		this.getDefinitionList().add("20 reps");
		this.getDefinitionList().add("30 reps");
		this.getDefinitionList().add("20 reps");
		this.getDefinitionList().add("30 reps");
		
		while(this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
}
