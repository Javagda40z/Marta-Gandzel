package obiekty;

public class Cat implements Animal {

    public Cat() {

    }

    private String imie;

    public Cat(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void drap() {
        // kot drapie
    }

    private int licznik = 0;

    public void eatMice() {

        licznik++; // licznik = licznik + 1

        System.out.println("I ate " + licznik + " mice.");
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
