package com.ejemplo.ejercicios.problemaD;

public class SinvocalesRecursiva {
    public static String sinVocales2(String tex){// recursiva
        if(tex.isEmpty()){
            return "";
        }
        char c = tex.charAt(0);
        String resto =sinVocales2(tex.substring(1));

        if("aeiouAEIOU".indexOf(c) == -1){
            return c + resto;
        }else {
            return resto;
        }
    }
}
