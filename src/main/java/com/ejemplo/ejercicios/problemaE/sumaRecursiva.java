package com.ejemplo.ejercicios.problemaE;

public class sumaRecursiva {
    public static int sumaRecursiva(int[] arre, int indice){ // recursiva 
        if(indice == arre.length){
            return 0;
        }

        return arre[indice] + sumaRecursiva(arre, indice +1);
    }
}
