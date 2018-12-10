package Move;

import java.util.ArrayList;
import major.*;

public class Exercise {
	private ArrayList<String> moveList;
	private ArrayList<String> definitionList;

	public Exercise() {
		this.moveList = new ArrayList<String>();
		this.definitionList = new ArrayList<String>();
	}

	// getter of Array list
	public ArrayList<String> getMoveList() {
		return moveList;
	}

	public ArrayList<String> getDefinitionList() {
		return definitionList;
	}

	// get excerciseName,definition by index
	public String getMoveName(int index) {
		return this.moveList.get(index);
	}

	public String getDefinition(int index) {
		return this.definitionList.get(index);
	}

}