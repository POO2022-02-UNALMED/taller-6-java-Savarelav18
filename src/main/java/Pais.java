package vehiculos;

import java.util.ArrayList;

public class Pais {
    String nombre;
    static ArrayList<String> listaPaises = new ArrayList<String>();
    static ArrayList<Integer> repeticion = new ArrayList<Integer>();
    int count=0;
    int indexList=0;

    public Pais(String nombre){
        this.nombre=nombre;
        listaPaises.add(nombre);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String paisMasVendedor(){
        int iterator=repeticion.get(0);

        for(String i : listaPaises)
            for(String j:listaPaises)
                if(j.equals(i)){
                    repeticion.add(count++);
                }
                else {
                    repeticion.add(count);
                }
        for(int i=0;i<repeticion.size();i++)

            if (iterator < repeticion.get(i)){
                iterator=repeticion.get(i);
                indexList=i;
            }
        return listaPaises.get(indexList);
    }
}
