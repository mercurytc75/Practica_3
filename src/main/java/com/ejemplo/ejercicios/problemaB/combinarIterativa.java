package com.ejemplo.ejercicios.problemaB;

public class combinarIterativa {
       public static  long combinar (int a, int b){// iterativa
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);

        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;

        while(i < s1.length() || j < s1.length()){
            if(i<s1.length()){
                sb.append(s1.charAt(i));
                i++;
            }
            if(j < s1.length()){
                sb.append(s2.charAt(j));
                j++;
            }
        }
        return Long.parseLong(sb.toString());
    }
}
