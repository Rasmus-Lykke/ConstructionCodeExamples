package SP2_InterfacesAndGenerics;

public class Dog<T> implements AnimalSounds {
    private String name;
    private int age;
    private T type;

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

    public T getType(){
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
    // comment
}
