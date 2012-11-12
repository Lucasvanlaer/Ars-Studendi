package Controllers;

import DomainModel.StudyProgram;
import com.googlecode.objectify.Key;
import Controllers.Objectifiable;

public class StudyProgramFinder extends Objectifiable{
		
	/**
	 * 
	 */
	public StudyProgram getCourse(Key<StudyProgram> studyProgramKey){
		return getObjectify().get(studyProgramKey);
	}
		
	public StudyProgram getStudyProgram(Long studyProgramID){
		return getObjectify().get(StudyProgram.class, studyProgramID);
	}
		
}
