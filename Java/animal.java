class Animal
{  
	int a=10;
	void eat()
	{
		System.out.println("eating..."+a);
	}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class TestInheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
}}  