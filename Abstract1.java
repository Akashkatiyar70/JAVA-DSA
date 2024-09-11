import java.util.Scanner;
abstract class Animal{
     abstract  public void makeSound();

    }
    abstract class PetAnimal extends Animal{
        public void getType(){
        System.out.println("this is pt animal");
    }
 }
class Dog extends PetAnimal{
    public void makeSound(){
        System.out.println("Bow......Bow");
    }
}
class Cat extends PetAnimal{
    public void makeSound(){
        System.out.println("Meo......Meo");
    }
}
class Abstract1{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Plase Enter 1 to select Dog and 2 select cat");
        int choice=sc.nextInt();
        Animal a;//= new Animal();
        if (choice==1)
        a=new Dog();
        else 
        a=new Cat();
        a.makeSound();
    }
}