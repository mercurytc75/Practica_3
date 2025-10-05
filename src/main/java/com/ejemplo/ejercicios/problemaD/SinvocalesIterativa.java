package com.ejemplo.ejercicios.problemaD;

public class SinvocalesIterativa {
    public static  String sinVocales(String tex){//iterativa
        StringBuilder sb = new StringBuilder();
        String vocales = "aeiouAEIOU";

        for(char c : tex.toCharArray()){
            if(vocales.indexOf(c) == -1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
