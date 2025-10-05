package com.ejemplo.ejercicios.problemaF;

import java.util.ArrayList;
import java.util.List;

public class MultiplosIterativos {
    public static int[] multiploIterativos(int[] arre, int n){//ITERATIVO
        List<Integer> lista = new ArrayList<>();

        for(int num: arre){
            if(num % n == 0){
                lista.add(num);
            }
        }
        int[] resultado = new int[lista.size()];
        for (int i = 0; i< lista.size(); i++) {
            resultado[i] = lista.get(i);
        }
        return resultado;
    }
}
