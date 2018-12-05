package Move;

public class Rest extends Exercise{
		
	public Rest() {
		this.getMoveList().add("rest");
	
		this.getDefinitionList().add("All day");
		
		while(this.getMoveList().size() != 15) {
			this.getMoveList().add("");
			this.getDefinitionList().add("");
		}
	}
}
