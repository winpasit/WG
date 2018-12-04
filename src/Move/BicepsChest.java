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
		this.getMoveList().add("wideCurl");
		this.getMoveList().add("hammerCurl");
		this.getMoveList().add("dragCurl");
		this.getMoveList().add("reverseCurl");
		this.getMoveList().add("straightCurl");
		this.getMoveList().add("valleyPress");
		this.getMoveList().add("standingValleyPress");
		this.getMoveList().add("reverseWideBenchPress");
		this.getMoveList().add("lyingRegularFly");
		this.getMoveList().add("regularWideBenchPress");
		
		for(int  i = 0 ; i < this.getMoveList().size() ; i++) {
			this.getDefinitionList().add("1 min");
		}
	}
}
