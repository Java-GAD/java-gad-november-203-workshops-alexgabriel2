package exemplu;


abstract class Car {
    String marca;
    public Car(String marca) {
        this.marca = marca;
    }
    //abstract method
    abstract void afiseazaMarca();
    public void merge() {
        System.out.println("merge");
    }
}

