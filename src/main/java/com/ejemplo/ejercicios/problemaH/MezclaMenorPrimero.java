package com.ejemplo.ejercicios.problemaH;

public class MezclaMenorPrimero {
    public static int[] mezclaMenorPrimero(int[] a, int[] b){
        int n = Math.min(a.length, b.length);
        int[] resultado = new int[n*2];
        int k =0;

        for(int i =0; i< n; i++){
            if(a[i] < b[i]){
                resultado[k++] = a[i];
                resultado[k++] = b[i];
            }else{
                resultado[k++] = b[i];
                resultado[k++] = a[i];
            }
        }
       return resultado;
       
    }
}
