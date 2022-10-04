package vehiculos;

public class Automovil extends Vehiculo{
    int puestos;
    private static int cantidadAutomovil;

    public Automovil(String placa,int puertas, int velocidadMaxima,String nombre,int precio, int peso,String traccion,Fabricante fabricante,int puestos){
        super(placa,puertas,velocidadMaxima,nombre,precio,peso,traccion,fabricante);
        this.puestos=puestos;
        cantidadAutomovil++;
    }

    public Automovil(String placa,String nombre,int precio, int peso,Fabricante fabricante,int puestos){
        super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
        this.puestos=puestos;
        cantidadAutomovil++;
    }
    
    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public static int getCantidadAutomoviles() {
        return cantidadAutomovil;
    }

    public static void setCantidadAutomovil(int cantidadAutomovil) {
        Automovil.cantidadAutomovil = cantidadAutomovil;
    }
}
