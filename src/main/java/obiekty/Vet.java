package obiekty;

public class Vet {

    public static void main(String[] args) {

        Cat cat = new Cat("Filemon");
        Dog dog = new Dog("Burek");

        Vet weterynarz = new Vet();

        weterynarz.sayHallo(cat);
        weterynarz.sayHallo(dog);


    }

    public void sayHallo(Cat cat) {
        System.out.println("Witaj " + cat.getImie() + "!");
    }

    public void sayHallo(Dog dog) {
        System.out.println("Witaj " + dog.getImie() + "!");
    }
}
