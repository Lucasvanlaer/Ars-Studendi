package DomainModel;
import java.util.*;

public class StudyProgram {
private List<Course> courseList;
private String name;
private Long studyProgramID;


public StudyProgram(List<Course> courseList, String name, Long studyProgramID)
{
	this.courseList = courseList;
	this.name=name;
	this.studyProgramID = studyProgramID;
}
public void addCourse(Course newCourse){
	if (courseList.contains(newCourse)==false){
		courseList.add(newCourse);
	}

}
public void removeCourse(Course oldCourse){
	int i=0;
	boolean found = false;
	while(found==false && i<=courseList.size()-1 ){
		if (courseList.get(i)==oldCourse){
			courseList.remove(i);
			found = true;
		}
		else{
			i++;
		}
}
}
public Long getStudyProgramID(){
	return studyProgramID;
}

}
