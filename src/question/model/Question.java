package question.model;

public class Question
{
	private String name;
	private int age;
	private boolean alive;
	private int random;
	
	public Question()
	{
		name = "";
		age = 0;
		alive = false;
		random = 38;
	}
	
	public Question(String name, int age, boolean alive, int random)
	{
		this.name = name;
		this.age = age;
		this.alive = alive;
		this.random = random;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public boolean getAlive()
	{
		return alive;
	}
	public int getRandom()
	{
		return random;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setAlive(boolean alive)
	{
		this.alive = alive;
	}
	public void setRandom(int random)
	{
		this.random = random;
	}
	
	public String toString()
	{
		String thingInfo = "Your dogs name is " + name + ". It's age is " + age + ". Is he happy? " + alive + ". Also your fun random number is " + random;
		return thingInfo;
	}
}
