package com.ejemplo.ejercicios.problemaF;

import java.util.ArrayList;
import java.util.List;

public class multiplosRecursiva {
    public static  List<Integer> multiploRecursivo(int[] arre, int n, int index){// recursiva
        if(index == arre.length){
            return  new ArrayList<>();
        }
        List<Integer> resto  = multiploRecursivo(arre, n, index +1);

        if(arre[index]% n==0 ){
            resto.add(0, arre[index]);
        } 
        return  resto;
    }
}
