package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    String nombre;
    Pais pais;
    private static ArrayList<Fabricante> listaFabricantes = new ArrayList<>();
    private int count=0;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante iterator=listaFabricantes.get(0);

        for(Fabricante i : listaFabricantes)
                if(i.getCount()>iterator.getCount()){
                    iterator=i;
                }

        return iterator;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
