package exemplu;
//composition method
public class Motor {
    private String tip;
    private int capacitate;
    private int putere;

    public Motor(String tip, int capacitate, int putere) {
        this.tip = tip;
        this.capacitate = capacitate;
        this.putere = putere;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public String getTip() {
        return tip;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public int getPutere() {
        return putere;
    }

    public String getMotor() {
        return "tip: " + tip + " capacitate: " + capacitate + " putere: " + putere;
    }
}
