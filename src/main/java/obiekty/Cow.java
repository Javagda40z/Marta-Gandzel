package obiekty;

public class Cow implements Animal {

    public void dajMleko() {
        // krowa daje mleko
    }

    @Override
    public void makeSound() {
        System.out.println("Mooo!");
    }

    @Override
    public void move() {
        System.out.println("Idę!");
    }
}
