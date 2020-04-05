package obiekty2;

import obiekty.Animal;
import obiekty.Cat;
import obiekty.Dog;
import obiekty.Vet;

public class Vet2 {

    public void sayHallo(Animal2 zwierze) {

        System.out.println("Witaj " + zwierze.getImie() + "!");
    }

    public static void main(String[] args) {

        Animal2 kot = new Cat2("Bonifacy");
        Animal2 pies = new Dog2("Aros");

        Vet2 weterynarz = new Vet2();

        weterynarz.sayHallo(kot);
        weterynarz.sayHallo(pies);

        Animal2 chomik = new Hamster("Chomik");

        weterynarz.sayHallo(chomik);
    }

}
