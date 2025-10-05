package com.ejemplo.ejercicios.problemaC;

public class SepararRecursiva {
    public static String[] separar2 (String num, int index){ // recursiva 
        if (index >= num.length()){
            return new String[]{"", ""};
        }

        String[] resto = separar2(num, index +1);
        if(index % 2== 0){
            resto[0] = num.charAt(index) + resto[0];
        }else{
            resto[1] = num.charAt(index) + resto[1];
        }
        return resto;
    }
}
