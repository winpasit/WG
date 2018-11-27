package Move;

import java.util.ArrayList;

public class Exercise {
	private ArrayList<String> exerciseList;
	private ArrayList<String> definitionList;
	public Exercise() {
		exerciseList = new ArrayList<String>();
		definitionList = new ArrayList<String>();
	}
	
	//getter of Array list
	public ArrayList<String> getExerciseList() {
		return exerciseList;
	}
	public ArrayList<String> getDefinitionList() {
		return definitionList;
	}
	
	//get excerciseName,definition by index
	public String getExerciseName(int index) {
		return this.exerciseList.get(index);
	}
	
	public String getDefinition(int index) {
		return this.definitionList.get(index);
	}
	
	
} 