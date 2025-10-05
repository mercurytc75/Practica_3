package com.ejemplo.ejercicios.problemaA;
public class sindigitos357Recursiva{
        public static int eliminar357(int n){// recursiva 
        if(n == 0) return 0 ;

        int digito = n % 10;
        int resto = eliminar357(n/10);

        if (digito == 3 || digito == 5 || digito == 7){
            return resto;
        }else{
            return resto * 10 + digito;
        }
    }
}