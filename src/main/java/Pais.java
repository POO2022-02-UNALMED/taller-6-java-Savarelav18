package vehiculos;

import java.util.ArrayList;

public class Pais {
    public static String nombre;


    public Pais(String nombre){
        Pais.nombre=nombre;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Pais.nombre = nombre;
    }

    public static String paisMasVendedor(){

        Fabricante fabricanteMayorVentas = new Fabricante();
        return fabricanteMayorVentas.getNombre();

    }

}
