interface Animal{
	
	public abstract String getName();
	public abstract String makeSound();
	public abstract String describe();
	public abstract void show();
}

class Dog implements Animal{
	String name, sound, describe;
	
	public String getName(){
		return name = "Buddy";
	}
	
	public String makeSound(){
		return sound = "Woof!";
	}
	
	public String describe(){
		return describe = "This is a dog.";
	}
	
	public void show(){
		System.out.printf("%s Name: %s. I make sound %s \n",describe(), getName(), makeSound() );
	}

}

class Cat implements Animal{
	String name, sound, describe;
	
	public String getName(){
		return name = "Angel";
	}
	
	public String makeSound(){
		return sound = "Meow!";
	}
	
	public String describe(){
		return describe = "This is a cat.";
	}
	
	public void show(){
		System.out.printf("%s Name: %s. I make sound %s \n",describe(), getName(), makeSound() );
	}

}

class Bird implements Animal{
	
	String name, sound, describe;
	
	public String getName(){
		return name = "Beauty";
	}
	
	public String makeSound(){
		return sound = "Tweet!";
	}
	
	public String describe(){
		return describe = "This is a bird.";
	}
	
	public void show(){
		System.out.printf("%s Name: %s. I make sound %s \n",describe(), getName(), makeSound() );
	}

}

public class handOnTest_12_17_2024 {
	public static void main(String[] args){
		Dog dog = new Dog();
		dog = new Dog();
		
		Cat cat = new Cat();
		cat = new Cat();
		
		Bird bird = new Bird();
		bird = new Bird();
		
		dog.show();
		cat.show();
		bird.show();
	}
}