/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

import java.util.Scanner;

/**
 *
 * @author EC1826148
 */

public class Assessment {

   
    public static void main(String[] args) {
        // Calling object to scan user's name
        Scanner ac = new Scanner(System.in);
        // Printing instruction to enter full name
        System.out.println("Please enter your administrator name:");
        // Taking input and storing it in variable user
        String admin = ac.next();
        //passing variable to menu1 method
        
        menu1(admin);
    }
    public static void menu1(String admin){
        // Initializing variable user_input for later use in options
        String user_input = "";
        // Initializing variable option for later use in menu options
        int option = 0;
        // Initializng boolean variable for later use in menu options
        boolean success = true;
        
        //Initializing object sc to take inputs and store them into user_input
        Scanner sc = new Scanner(System.in);
        
        //Creating exceptions to avoid user from inputing invalid options
        do{
            // Calling the menu
            menu(admin);
            // Getting the input from the user
            user_input = sc.nextLine();

            //Converting the user input into an intvalue
            try {
                option = Integer.parseInt(user_input);
                if (option > 3 || option < 1){
                    System.out.println("Sorry, please enter a different option");
                    menu1(admin);
                }
                success = true;
            } catch (Exception e){
                // If we catched an exception while converting the value
                System.out.println("Invalid Menu Option!");
                success = false;
            } 
        }while(!success);
        //creting menu logic    
        switch (option) {
            //initializing option_1
            case 1:
                //passing string variable user from main method to option_1
                option_1();
                menu1(admin);
                break;
            //initializing option_2    
            case 2:
                option_2();
                menu1(admin);
                break;
            //initializing option_3    
            case 3:
                option_3();
                break;
        }
        
    }
   // Creating display of meny options 
    public static void menu(String user){
        System.out.println("Welcome:" + user);
        System.out.println(" Please select a number from 1 to 3 to perform an action");
        System.out.println("1. Username Generator");
        System.out.println("2. Factorial Calculator");
        System.out.println("3. Exit");
        System.out.println("Option:");
    }
    //Creating logic of option_1 : Username generator
    public static void option_1(){
        //Creating object to scan for user's name
        Scanner os = new Scanner(System.in);
        //Prompt user to insert full name
        //Printing title
      
        System.out.println("Please insert your full name");
        //Taking input from user
        String un = os.nextLine();
        boolean success = false;
       
            if(un.contains(" ")||!un.matches(".*\\d+.*")){
                System.out.println("Username:");
                UsernameGenerator.parser(un);
            }
            else{          
                System.out.println("invalid option try again");
                option_1();
              
            }
        }
            

      
        // Using Username generator class on the variable user that we passed from main method. 
        
    
    //Creating logic of option_2 : Factorial calculator
    public static void option_2(){
        


       boolean success = false; 
       //Printing out instructions
       System.out.println("Please insert a number between 1 and 10 that you want to calculate:");
       //Creating object to fetch input
       Scanner num = new Scanner(System.in);
       //Creating factorial calculator object
       FactorialCalculator result = new FactorialCalculator();
       int fact = 0;
       // Initializing int variable to store input value 
       do{
       
            String factLn = num.nextLine();
       // Initializing long variable to use factorial calculator object
            try{
            fact = Integer.parseInt(factLn);
            success = true;
            }catch (Exception e){
            System.out.println("Invalid input, please try again");
            success = false;
       }
            
            if (fact > 0){ 
                success = true;
                        }else {
                success = false;
                System.out.println("Invalid input, enter a number above 0");
            }
            
            if (fact < 11) {
                success = true;
            } else {
                success = false;
                System.out.println("Invalid input, enter a number below 10");
            }
            
       }while (success != true);
       
       long endRes = result.factCalc(fact);
       // Prints result of factorial 
       System.out.println(endRes);
     
    }
    // Creating logic for option_3
    public static void option_3(){
        //Prints out exiting
        System.out.println("Exiting...");
       
    } 
  
}
//End of code