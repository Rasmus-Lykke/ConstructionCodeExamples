package SP2_InterfacesAndGenerics;

public class Dog implements AnimalSounds {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void bark(){
        System.out.println("Woof woof");
    }

    public void rawr(){
        System.out.println("Grrawrrr");
    }
}
