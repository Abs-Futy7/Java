package properties.abstraction;

abstract class Animal {
    // Abstract method (no implementation)
    public abstract void makeSound();

    // Regular method with implementation
    public void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dog extends Animal {
    // Implementing the abstract method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

/*
 * In this example, the Animal class provides an abstract method makeSound()
 * that doesn't define how an animal sounds. The Dog class implements the method according
 * to its specific behavior.
 * The user doesn't need to know how the sound is made internally, just that the dog can bark.
 */
