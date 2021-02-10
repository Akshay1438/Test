package task;


class animal
{
	void sound()
	{
		System.out.println("sound");
	}
}
class Dog extends animal
{
	void sound()
	{
		System.out.println("bow bow");
	}
}

class Horse extends animal
{
	void sound()
	{
		System.out.println("neigh");
	}
}

class Cat extends animal
{
	void sound()
	{
		System.out.println("meow");
	}
}



public class OverRiding {

	public static void main(String[] args)
	{
		animal CAT=new Cat();
		animal DOG=new Dog();
		animal HORSE=new Horse();
		
		CAT.sound();
		DOG.sound();
		HORSE.sound();
	}

}
