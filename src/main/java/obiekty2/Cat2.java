package obiekty2;

public class Cat2 extends Animal2 {


    public Cat2(String imie) {
        super(imie);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void move() {
        System.out.println("Idę!");
    }
}
