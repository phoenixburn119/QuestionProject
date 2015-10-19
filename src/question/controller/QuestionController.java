package question.controller;

import question.view.QuestionView;
import question.model.Question;

public class QuestionController
{
	private QuestionView popupDisplay;
	private Question myQuestion;
	
	public QuestionController()
	{
		popupDisplay = new QuestionView();
	}
	
	public void start()
	{
		String name = popupDisplay.getAnswer("Type in your dog's name");
		
		int age;
		String tempAge = popupDisplay.getAnswer("Type in its age.");
		age = Integer.parseInt(tempAge);
		
		boolean alive;
		String tempAlive = popupDisplay.getAnswer("Type in if its happy. True or false plz.");
		alive = Boolean.parseBoolean(tempAlive);
		
		int random;
		String tempRandom = popupDisplay.getAnswer("Type in a random number.");
		random = Integer.parseInt(tempRandom);
		random = (random * 10);
		
		myQuestion = new Question(name, age, alive, random);
		popupDisplay.displayResponse(myQuestion.toString());
	}
}

