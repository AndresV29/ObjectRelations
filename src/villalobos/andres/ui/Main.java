package villalobos.andres.ui;

import villalobos.andres.bl.Client;
import villalobos.andres.bl.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the Calculator!");
            System.out.println("Please select an operation:");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");

            int operation = input.nextInt();
            if (operation == 5) {
                System.out.println("Thank you for using the Calculator!");
                return;
            }

            System.out.println("Please enter the first number:");
            double num1 = input.nextDouble();
            System.out.println("Please enter the second number:");
            double num2 = input.nextDouble();

            double result = 0;
            switch (operation) {
                case 1:
                    registrarPersona();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid operation selected.");
                    break;
            }

            System.out.println("The result is: " + result);
            System.out.println("Do you want to continue using the program (y/n)?");
            String choice = input.next();
            if(choice.equals("y")){
                main(args);
            }else {
                System.out.println("Thank you for using the Calculator!");
            }
        }

    private static void registrarPersona() {
        Person myPersona = new Person("Mario Bros", 190245);
        Client myClient = new Client();
    }


    int contador = 0;
}//end of main class
