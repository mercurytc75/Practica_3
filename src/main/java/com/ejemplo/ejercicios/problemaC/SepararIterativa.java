package com.ejemplo.ejercicios.problemaC;

public class SepararIterativa {
    public static String separar( int n ){ // iterativa
        String numStr = String.valueOf(n);
        StringBuilder part1 = new StringBuilder();
        StringBuilder part2 = new StringBuilder();

        for(int i = 0; i < numStr.length(); i++){
            if(i % 2 == 0){
                part1.append(numStr.charAt(i));
            }else{
                part2.append(numStr.charAt(i));
            }
        }
        return part1.toString() + " y " +part2.toString();
    }
}
