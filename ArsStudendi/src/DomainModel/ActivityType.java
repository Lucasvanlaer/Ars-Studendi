package DomainModel;

public enum ActivityType {
	STUDY{
		public StudyType type;
	
		public setStudyType(StudyType newType){
			this.type = newType;
		}
		
		public StudyType getStudyType(){
			return type;
		}
	},SLEEP, SPORT, HOBBY, SOCIAL, OTHER;
	
	//HOORCOLLEGE{}, OEFENZITTING, TEAMWORK,
}
