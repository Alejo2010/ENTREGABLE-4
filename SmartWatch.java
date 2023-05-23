public class SmartWatch extends SmartDevice{
    double pulgadas;
    String color;
    Boolean poner;

    public SmartWatch() {
    }

    public SmartWatch(String marca, int año, boolean encendido, int bateria, double pulgadas, String color, Boolean poner) {
        super(marca, año, encendido, bateria);
        this.pulgadas = pulgadas;
        this.color = color;
        this.poner = poner;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pulgadas=" + pulgadas +
                ", color='" + color + '\'' +
                ", poner=" + poner +
                ", bateria=" + bateria +
                ", marca='" + marca + '\'' +
                ", año=" + año +
                ", encendido=" + encendido +
                '}';
    }
}
