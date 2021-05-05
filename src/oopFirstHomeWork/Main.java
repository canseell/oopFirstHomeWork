package oopFirstHomeWork;
public class Main {

	public static void main(String[] args) {
		
	Category category1 = new Category(100 , "Programming" , 5);
	
	System.out.println("You chosed " + category1.categoryName);
	System.out.println("This category have " +  category1.categoryContentNumber + " content...");
	 
	
	Lesson lesson1 = new Lesson(200 , "C#" , "Thirty hours");
	Lesson lesson2 = new Lesson(201 , "Java" , "Twenty two hours");
	Lesson lesson3 = new Lesson(202 , "C" , "Thirty five hours");
	Lesson lesson4 = new Lesson(203 , "C++" , "Fourty hours " );
	Lesson lesson5 = new Lesson(204 , "Python" , "Thirty three hours");
	
	System.out.println("You can choose one of them: " + lesson1.lessonName + " , " + lesson2.lessonName +  " , "  + lesson3.lessonName +  " ,  " + lesson4.lessonName + " ,  " + lesson5.lessonName + " , "  +  "..." );
    
	
	LessonsManager lessonsManager = new LessonsManager();
	
    lessonsManager.chooseLesson(lesson2);
    
    Tranier tranier1 = new Tranier(300 , "Engin Demiroð" , 2 , "One hundred hours");
    Tranier tranier2 = new Tranier(301,  "Cansel Cömertpay" , 1, "Twenty hours");
    
    System.out.println("You can choose one of them :" + tranier1.tranierName + " , "  + tranier2.tranierName );
    
    lessonsManager.chooseTrainer(tranier1);
    
    Student student1 = new Student(400 , "Nihal" , 75);
    
    System.out.println("Welcome " + student1.studentName + "...");
    
    lessonsManager.startTheLessons(lesson1);
    
    if (student1.percentageLesson > 70) {
    	
    	lessonsManager.finishTheLessons(lesson1);
    	
    }
    
    else{
    	
    	System.out.println("Ohh..I am sorry .. You don't pass this course");
    }
    
    Student student2 = new Student(401 , "Busra" , 60);
    
    System.out.println("Welcome " + student2.studentName + "...");
    
    lessonsManager.startTheLessons(lesson1);
    
    if (student2.percentageLesson > 70) {
    	
    	lessonsManager.finishTheLessons(lesson1);
    	
    }
    
    else{
    	
    	System.out.println("Ohh..I am sorry .. You don't pass this course");
    }
    
	}
	

}
