package com.ejemplo.ejercicios.problemaG;

import java.util.ArrayList;
import java.util.List;

public class MezclarIterativo {
    public static int[] mezclarIterativo(int[] arr, int [] arr2){// iterativa
        List<Integer> lista = new ArrayList<>();
        int i =0 , j=0;

        while(i< arr.length || j < arr2.length){
            if(i < arr.length){
                lista.add(arr[i]);
                i++;
            }
            if(j < arr2.length){
                lista.add(arr2[j]);
                j++;
            }
        }
        int[] resultado = new int[lista.size()];
        for(int k = 0; k< lista.size(); k++){
            resultado[k] = lista.get(k);
        }
        return resultado;
    }
}
