package oopFirstHomeWork;

public class LessonsManager {
	
	public void chooseLesson(Lesson lesson) {
		
		System.out.println("You chosed " + lesson.lessonName + "...");
	}
	
	public void chooseTrainer(Tranier tranier) {
		
		System.out.println("You chosed " + tranier.tranierName + "...");
	}
	
	public void startTheLessons (Lesson lesson) {
		
		System.out.println("You started lessons of  " + lesson.lessonName + "...");
	}
	
	public void finishTheLessons (Lesson lesson ) {
		
		System.out.println("Congurulations..");
		System.out.println("You finished total "+ lesson.lessonsTime +  " lessons of  " + lesson.lessonName + "..." );

	}

}
