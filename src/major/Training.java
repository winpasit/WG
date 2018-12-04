package major;

import java.util.ArrayList;
import Move.*;

public class Training {
	
	private ArrayList<Exercise> weekExerciseList ;
	
	public Training() {
		this.weekExerciseList = new ArrayList<Exercise>();
	}
	
	//getter
	public ArrayList<Exercise> getWeekExerciseList(){
		return this.weekExerciseList;
	}
	
	public Exercise getDayExercise(int day) {
		return this.weekExerciseList.get(day);
	}
	

}
