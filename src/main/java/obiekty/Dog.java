package obiekty;

public class Dog implements Animal {

    public Dog() {

    }

    private String imie;

    public Dog(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void aportuj() {
        // pies aportuje
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }

    @Override
    public void move() {
        System.out.println("Idę!");
    }
}
