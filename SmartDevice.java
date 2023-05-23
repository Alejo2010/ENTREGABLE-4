public class SmartDevice {
    int bateria;
    String marca;
    int año;
    boolean encendido;
    public SmartDevice(){

    }
    public SmartDevice(String marca, int año, boolean encendido, int bateria){
        this.marca = marca;
        this.año = año;
        this.bateria = bateria;
        this.encendido = encendido;
    }
    public void Encender(boolean prender){
        if(prender){
            this.encendido = true;
        }else{
            this.encendido = false;
        }
    }
}
