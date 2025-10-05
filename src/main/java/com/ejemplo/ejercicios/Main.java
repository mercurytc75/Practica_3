package com.ejemplo.ejercicios;
import com.ejemplo.ejercicios.problemaA.*;
import com.ejemplo.ejercicios.problemaB.*;
import com.ejemplo.ejercicios.problemaC.*;
import com.ejemplo.ejercicios.problemaD.*;
import com.ejemplo.ejercicios.problemaE.*;
import com.ejemplo.ejercicios.problemaF.*;
import com.ejemplo.ejercicios.problemaG.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] arr3 = {7, 19, 49, 51, 35, 77, 90};
        String numero = "8329238";
        String[] resultado = SepararRecursiva.separar2(numero, 0);
        System.out.println("C Recursivo: " + resultado[0] + " y " + resultado[1]);
        System.out.println("A Iterativo: " + sindigitos357Iterativo.sinDigitos57(732947));
        System.out.println("A Recursivo: " + sindigitos357Recursiva.eliminar357(732947));
        System.out.println("B Iterativo: " + combinarIterativa.combinar(123, 456));
        System.out.println("B Recursivo: " + combinarRecursiva.combinar2("123", "456"));
        System.out.println("C Iterativo: " + SepararIterativa.separar(123456));
        System.out.println("C Recursivo: " + resultado[0] + " y " + resultado[1]);
        System.out.println("D Iterativo: " + SinvocalesIterativa.sinVocales("Hola Mundo"));
        System.out.println("D Recursivo: " + SinvocalesRecursiva.sinVocales2("Hola Mundo"));
        System.out.println("E Iterativo: " + SumaIterativa.sumaIterativa(arr));
        System.out.println("E Recursivo: " + sumaRecursiva.sumaRecursiva(arr, 0));
        System.out.println("F Iterativo: " + java.util.Arrays.toString(MultiplosIterativos.multiploIterativos(arr, 7)));
        System.out.println("F Recursivo: " + multiplosRecursiva.multiploRecursivo(arr, 7, 0));        
        System.out.println("G Iterativo: " + java.util.Arrays.toString(MezclarIterativo.mezclarIterativo(arr, arr2)));
        System.out.println("G Recursivo: " + MezclarRecurivo.mezclarRecursivo(arr, arr2, 0, 0));


       

    }
}
