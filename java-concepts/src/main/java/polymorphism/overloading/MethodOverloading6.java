package polymorphism.overloading;

import acccessModifiers.privateModifier.A;

public class MethodOverloading6 {
    public static void main(String[] args) {
        MethodOverloading6 methodOverloading6 = new MethodOverloading6();
        Animal animal = new Animal();
        methodOverloading6.m1(animal);

        Dog dog = new Dog();
        methodOverloading6.m1(dog);

        Animal animalDog = new Dog();
        methodOverloading6.m1(animalDog);  // method resolution(means which method needs to be execution) is taken care
                                            // by the compiler based on Reference type
    }

    public void m1(Animal animal){
        System.out.println("Animal version");
    }

    public void m1(Dog dog){
        System.out.println("Dog version");
    }
}

class Animal{

}

class Dog extends Animal{

}