/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

/**
 *
 * @author EC1826148
 */
public class FactorialCalculator {
        //Method for the Factorial calculator
        public long factCalc (int n){
        //transforms int input to long in order to give a long output (i.e be able to use larger numbers)    
        long x = n; 
        //for loop to complete the formula for a factorial
        for (; n>1; n--){
            x = x * (n - 1);
            int p = n - 1;
            int r = n;
            System.out.print(n + "x");
            if (n == 2){
                System.out.print(1+"=");
            }
            System.out.println("");
        }
     //returns result    
     return x;
    }
}


