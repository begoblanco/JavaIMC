package dev.bego;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your weight in Kg: "); //using comma!!!
        double weight = scanner.nextDouble();

        System.out.print("Your height in meters: "); //using comma!!!
        double height = scanner.nextDouble();

        // double peso = 46; 
        // double estatura = 1,58; 
        
        CalculatorIMC calculator = new CalculatorIMC();
        
    
        double imc = calculator.calculateIMC(weight, height);
        String result = calculator.tableIMC(imc);

        System.out.println("IMC: " + imc);
        System.out.println();      
        System.out.println("Result: " + result);

        scanner.close();
    }
}
