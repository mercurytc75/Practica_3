package com.ejemplo.ejercicios.problemaG;

import java.util.ArrayList;
import java.util.List;

public class MezclarRecurivo {
    public static List<Integer> mezclarRecursivo(int[] arr, int[] arr2, int i, int j){
        if (i>= arr.length && j >= arr2.length){
            return  new ArrayList<>();
        }

        List<Integer> resultado = new ArrayList<>();

        if(i>= arr.length){resultado.add(arr[i]);}
        if(j>= arr2.length){resultado.add(arr2[j]);}

        resultado.addAll(mezclarRecursivo(arr, arr2, i +1, j +1));
        return  resultado;
    }
}
