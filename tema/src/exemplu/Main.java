package exemplu;

//exemplele sunt destul de simple,dar cred ca se intelege ideea si partea asta de materie
//o urasc din cauza facultatii:))

public class Main {
    static void Merge(Car a) {
        a.merge();
    }
    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes("Mercedes", "negru", new Motor("V8", 2000, 200));
       //abstract
        mercedes.afiseazaMarca();
        //compozitie
        mercedes.afiseazaDetalii();
        //encapsulation
        mercedes.setKilometraj(100);
        mercedes.setKilometraj(-100);
        System.out.println(mercedes.getKilometraj());
        //inheritance
        mercedes.mergeBine();
        mercedes.merge();
        //overloading
        mercedes.alimentare(10);
        mercedes.alimentare(10, 20);
        //polymorphism
        System.out.println("Polymorphism");
        Car car = new Mercedes("Mercedes", "negru");
        car.merge();
        //static polymorphism
        System.out.println("Static polymorphism");
        mercedes.merge();
        //dynamic dispatch
        System.out.println("Dynamic dispatch");
        Merge(mercedes);

    }
}