package vehiculos;

import java.util.ArrayList;

public class Pais {
    private static String nombre;
    static ArrayList<String> listaPaises = new ArrayList<String>();
    static ArrayList<Integer> repeticion = new ArrayList<Integer>();
    static int count=0;
    static int indexList=0;

    public Pais(String nombre){
        Pais.nombre=nombre;
        listaPaises.add(nombre);

    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Pais.nombre = nombre;
    }

    public static String paisMasVendedor(){

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
