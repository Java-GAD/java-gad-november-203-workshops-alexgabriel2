package exemplu;

public class Mercedes extends Car {
    String color;
    private Motor motor;
    //encapsulation
    int kilometraj;
    //overloading
    double benzina;
    public void setKilometraj(int kilometraj) {
        if(kilometraj < 0) {
            System.out.println("Kilometrajul nu poate fi negativ");
            return;
        }
        this.kilometraj = kilometraj;
    }
    public int getKilometraj() {
        return kilometraj;
    }
    @Override
    public void merge() {
        System.out.println("Masina merge ");
    }
    public void mergeBine() {
        System.out.println("merge bine");
    }

    public Mercedes(String marca, String color) {
        super(marca);
        this.color = color;
    }
    //composition method
    public Mercedes(String marca,String color, Motor motor) {
        super(marca);
        this.color = color;
        this.motor = motor;
    }
    //abstract method
    public void afiseazaMarca() {
        System.out.println("Marca masinii este " + marca);
    }
    //composition method
    public void afiseazaDetalii() {
        System.out.println("Marca masinii este " + marca + " si culoarea este " + color + motor.getMotor());
    }
    //overloading
    public void alimentare(double benzina) {
        this.benzina = benzina;
    }
    public void alimentare(double benzina, double alimentare) {
        this.benzina = benzina+alimentare;
    }
}