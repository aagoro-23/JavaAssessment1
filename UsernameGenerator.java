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
public class UsernameGenerator {
    //method of the username generator
    public static void parser (String str){
    //prompting user to get input 
    String str1[] = str.split(" ");
    //assigns the value of the first letter of the input to the character variable f
    char f = str1[0].charAt(0);
    //assigns the value of the second part of the array (i.e the second word)to the variable x
    String x = str1[1];
    //prints the first letter of the first word + the second word (i.e. if input given Aaron Gonzales, output is AGonzalez)
    System.out.println(f+x);
             
   }
}
