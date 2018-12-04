package Move;

import java.util.ArrayList;
import major.*;

public class Exercise {
	private ArrayList<String> exerciseList;
	private ArrayList<String> definitionList;
	//private Training t;
	
	public Exercise() {
		//this.t= t;
		this.exerciseList = new ArrayList<String>();
		this.definitionList = new ArrayList<String>();
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