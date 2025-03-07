//Mairon Omar Licona Duarte
//201810010200
/*Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación de estas expresiones daría como resultado verdadero o falso:
M > T
T / K == -5
(M+T == 7) || (M-T == 5)*/

package com.mycompany.ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
    
        int M =6;
        int T=1;
         int K = -10;

         //Utilizaremos boolean para representar si las expresiones son verdaderas o falsas
        boolean primer = M > T;
        boolean segundo = (T / K) == -5;
        boolean tercero = (M + T == 7) || (M - T == 5);

        System.out.println("Evaluacion del resultado de las expresiones:");
        System.out.println("M > T: " + primer);
        System.out.println("T / K == -5: " + segundo);
        System.out.println("(M+T == 7) || (M-T == 5): " + tercero);
    }
}