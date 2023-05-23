public class SmarthPhone extends SmartDevice{
    Double tamaño;
    int camaras;
    String color;

    public SmarthPhone() {
    }

    public SmarthPhone(String marca, int año, boolean encendido, int bateria, Double tamaño, int camaras, String color) {
        super(marca, año, encendido, bateria);
        this.tamaño = tamaño;
        this.camaras = camaras;
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmarthPhone{" +
                "tamaño=" + tamaño +
                ", camaras=" + camaras +
                ", color='" + color + '\'' +
                ", bateria=" + bateria +
                ", marca='" + marca + '\'' +
                ", año=" + año +
                ", encendido=" + encendido +
                '}';
    }
}
