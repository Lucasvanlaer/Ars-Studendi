package Controllers;

import DomainModel.Student;

public class ProfileController {

	// we veronderstellen dat we het Studentobject vanuit de servlet krijgen
	
	public boolean changePassword(Student student, String newPassword){
		boolean succeed = false;
		if(newPassword != null){
		student.setPassword(newPassword);
		succeed=true;
		}
		return succeed;
	}
	public boolean changName(Student student, String firstName, String lastName){
	boolean succeed = false;
	if (firstName!= null && lastName!= null){
		succeed = true;
		student.setStudentLastName(lastName)	;
		student.setStudentFirstName(firstName);
	}
	return succeed;
	}
	
	
}
