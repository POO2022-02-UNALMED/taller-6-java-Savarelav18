package vehiculos;

public class Camioneta extends Vehiculo{
    boolean volco;
    private static int cantidadCamionetas;

    public Camioneta(String placa,int puertas, int velocidadMaxima,String nombre,int precio, int peso,String traccion,Fabricante fabricante,boolean volco){
        super(placa,puertas,velocidadMaxima,nombre,precio,peso,traccion,fabricante);
        this.volco=volco;
        Camioneta.cantidadCamionetas++;
    }

    public static Camioneta crearCamioneta(String placa,int puertas,String nombre,int precio,int peso,Fabricante fabricante,boolean volco){
        return new Camioneta(placa,puertas,90,nombre,precio,peso,"4X4",fabricante,volco);
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static int getCantidadCamionetas() {
        return cantidadCamionetas;
    }

    public static void setCantidadCamionetas(int cantidadCamionetas) {
        Camioneta.cantidadCamionetas = cantidadCamionetas;
    }
}
