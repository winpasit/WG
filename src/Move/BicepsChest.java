package Move;
import major.*;

public class BicepsChest extends Exercise {
	/* 1.1)wideCurl (1min)
	 * 1.2)hammerCurl (1min)
	 * 1.3)dragCurl (1min)
	 * 1.4)reverseCurl (1min)
	 * 1.5)straightCurl (1min)
	 * 2.1)valleyPress (1min)
	 * 2.2)standingValleyPress (1min)
	 * 2.3)reverseWideBenchPress (1min)
	 * 2.4)lyingRegularFly (1min)
	 * 2.5)regularWideBenchPress (1min)
	 */
	public BicepsChest() {
		//super(t);
		this.getMoveList().add("Wide Curl");
		this.getMoveList().add("Hammer Curl");
		this.getMoveList().add("Drag Curl");
		this.getMoveList().add("Reverse Curl");
		this.getMoveList().add("Straight Curl");
		this.getMoveList().add("Valley Press");
		this.getMoveList().add("Standing Valley Press");
		this.getMoveList().add("Reverse Wide BenchPress");
		this.getMoveList().add("Lying Regular Fly");
		this.getMoveList().add("Regular Wide BenchPress");
		
		for(int  i = 0 ; i < this.getMoveList().size() ; i++) {
			this.getDefinitionList().add("1 min");
		}
		
		while(this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
}
