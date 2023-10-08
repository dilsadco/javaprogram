class Animal{
    public void makeSound(){
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("The dog barks");
    }
}
public class Main{
    public static void main(String[] args){
        Animal animal=new Animal();
        Dog dog=new Dog();
        animal.makeSound();
        dog.makeSound();
    }
}