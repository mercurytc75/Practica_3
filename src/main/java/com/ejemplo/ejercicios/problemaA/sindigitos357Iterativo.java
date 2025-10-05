package com.ejemplo.ejercicios.problemaA;

public class sindigitos357Iterativo {
        public static int sinDigitos57(int n){// forma iterativa 
        String numStr = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        for (char c : numStr.toCharArray()){
            if (c !='3'&& c != 5 && c !=7 ){
                sb.append(c);
            }

            if(sb.length() == 0){
                return 0;
            }
            return  Integer.parseInt(sb.toString());
        }
        return n;
    }
}
