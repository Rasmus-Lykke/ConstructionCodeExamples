package OOP.Polymorphism;

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        myAnimal.animalSound();
        //myAnimal.animalSound("Fish", "Ssshhhh");

        System.out.println(Math.Multiply(2, 4));
        System.out.println(Math.Multiply(5.5, 6.3));

        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();


    }
}
