package oops;

abstract class AnimalDemo {
        // Abstract method (does not have a body)
        public abstract void animalSound();
        // Regular method
        public void sleep() {
            System.out.println("Zzz");
        }
    }
    // Subclass (inherit from Animal)
    class Pigs extends AnimalDemo {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }

}
