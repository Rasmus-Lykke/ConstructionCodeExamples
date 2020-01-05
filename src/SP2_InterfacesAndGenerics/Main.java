package SP2_InterfacesAndGenerics;

public class Main {

    public static void main(String[] args) {
        Dog stringDog = new Dog("Fido", 12);
        Dog intDog = new Dog("Charles", 8);

        stringDog.setType("My type is a String");
        intDog.setType(10);

        System.out.println(stringDog.getType());
        System.out.println(intDog.getType());
    }

}


