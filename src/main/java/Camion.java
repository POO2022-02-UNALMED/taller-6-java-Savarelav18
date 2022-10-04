package vehiculos;

public class Camion extends Vehiculo{
    int ejes;
    private static int cantidadCamiones;

    public Camion(String placa,int puertas, int velocidadMaxima,String nombre,int precio, int peso,String traccion,Fabricante fabricante,int ejes){
        super(placa,puertas,velocidadMaxima,nombre,precio,peso,traccion,fabricante);
        this.ejes=ejes;
        Camion.cantidadCamiones++;
    }

    public static Camion crearCamion(String placa,String nombre,int precio,int peso,Fabricante fabricante,int ejes){
        return new Camion(placa,2,80,nombre,precio,peso,"4X2",fabricante,ejes);
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public static int getCantidadCamiones() {
        return cantidadCamiones;
    }

    public static void setCantidadCamiones(int cantidadCamiones) {
        Camion.cantidadCamiones = cantidadCamiones;
    }
}