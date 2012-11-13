package arsstudendi;

import DomainModel.StudyProgram;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import Controllers.Objectifiable;

public class StudyProgramRegistry extends Objectifiable {
	private static StudyProgramRegistry _singletonObject;
	
	private StudyProgramRegistry(){
	ObjectifyService.register(StudyProgram.class);
	}

	/**
	 * Dit is eigenlijk de getInstance() methode
	 * @return
	 */
	public static synchronized StudyProgramRegistry getSingletonObject(){
		if( _singletonObject == null){
			_singletonObject = new StudyProgramRegistry();
		}
		return _singletonObject;
	}
	public boolean putStudent(StudyProgram studyProgram){
		if(studyProgram != null){
		getObjectify().put(studyProgram);
		return true;
		}
		else{
			return false;
		}
	}
	
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
