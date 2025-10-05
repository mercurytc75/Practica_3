package com.ejemplo.ejercicios.problemaE;

public class SumaIterativa {
    public static int sumaIterativa(int [] arre){//iterativa
        int suma = 0;
        for(int num :arre){
            suma+= num;
        }
        return suma;
    }

}
