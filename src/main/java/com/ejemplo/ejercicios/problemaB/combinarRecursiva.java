package com.ejemplo.ejercicios.problemaB;

public class combinarRecursiva {
    public static String combinar2(String s1, String s2){//recursiva
        if(s1.isEmpty() && s2.isEmpty()){
            return "";
        }

        StringBuilder resultado = new StringBuilder();
        
        if(!s1.isEmpty()){resultado.append(s1.charAt(0));}
        if(!s2.isEmpty()){resultado.append(s2.charAt(0));}

        return  resultado + combinar2(s1.isEmpty() ? "": s1.substring(1), s2.isEmpty() ? "" : s2.substring(1));
    }
}
