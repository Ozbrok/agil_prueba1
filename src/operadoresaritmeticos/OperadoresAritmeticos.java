/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operadoresaritmeticos;

/**
 *
 * @author avanza
 */
public class OperadoresAritmeticos {
      
   public static void main(String[] args) {
       int i,j;
    double num1,b;
    i = 7;
    j = 3;
    try{
        System.out.println(" Operador suma: i + j = " + (i+j));
        System.out.println(" Operador resta: i - j = " + (i-j));
        System.out.println(" Operador producto: i * j = " + (i*j));
        System.out.println(" Operador division: i / j = " + (i/j));
        System.out.println(" Operador resto: i % j = " + (i%j));
        num1 = 12.5;
            b = Metodo1(num1);
        System.out.println(" Operador suma: a + b = " + (num1+b));
        System.out.println(" Operador resta: a - b = " + (num1-b));
        System.out.println(" Operador producto: a * b = " + (num1*b));
        System.out.println(" Operador division: a / b = " + (num1/b));
        System.out.println(" Operador resto: a % b = " + (num1%b));
    }
    catch(Exception e){
        System.out.println("ERROR "+e);
    }
    finally{
        System.out.println("CORRECTO");
    }
    }

    private static void Metodo1(int i, int j) {
        System.out.println("* Operandos enteros: i = " + i + " ; j = " + j);
    }

    private static double Metodo1(double num1) {
        double b;
        b = 4.3;
        System.out.println("* Operandos reales: a = " + num1 + " ; b = " + b);
        return b;
    }
        
   }
    

