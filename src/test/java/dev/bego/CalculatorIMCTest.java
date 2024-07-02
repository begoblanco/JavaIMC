package dev.bego;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorIMCTest {

    @Test
    void testCalculateIMC() {
        CalculatorIMC calculator = new CalculatorIMC();

        //Delgadez
        double weight1 = 40.0;
        double height1 = 1.55;
        double expected1 = 16.65;
        double imc1 = calculator.calculateIMC(weight1, height1);
        assertEquals(expected1, imc1, 0.01);

        //Peso normal
        double weight2 = 70.0;
        double height2 = 1.75;
        double expected2 = 22.86;
        double imc2 = calculator.calculateIMC(weight2, height2);
        assertEquals(expected2, imc2, 0.01);

         //Sobrepeso
         double weight3 = 100.0;
         double height3 = 1.60;
         double expected3 = 39.06;
         double imc3 = calculator.calculateIMC(weight3, height3);
         assertEquals(expected3, imc3, 0.01);
        
    }

    @Test
    void testTableIMC() {
        CalculatorIMC calculator = new CalculatorIMC();

        double imc1 = 15;
        String expected1 = "Delgadez severa";
        String result1 = calculator.tableIMC(imc1);
        assertEquals(expected1, result1);

        double imc2 = 16;
        String expected2 = "Delgadez moderada";
        String result2 = calculator.tableIMC(imc2);
        assertEquals(expected2, result2);

        double imc3 = 17;
        String expected3 = "Delgadez leve";
        String result3 = calculator.tableIMC(imc3);
        assertEquals(expected3, result3);

        double imc4 = 18.5;
        String expected4 = "Peso normal";
        String result4 = calculator.tableIMC(imc4);
        assertEquals(expected4, result4);

        double imc5 = 27.5;
        String expected5 = "Sobrepeso";
        String result5 = calculator.tableIMC(imc5);
        assertEquals(expected5, result5);

        double imc6 = 30;
        String expected6 = "Obesidad leve";
        String result6 = calculator.tableIMC(imc6);
        assertEquals(expected6, result6);

        double imc7 = 35.2;
        String expected7 = "Obesidad moderada";
        String result7 = calculator.tableIMC(imc7);
        assertEquals(expected7, result7);

        double imc8 = 42.5;
        String expected8 = "Obesidad mórbida";
        String result8 = calculator.tableIMC(imc8);
        assertEquals(expected8, result8);
    }
    
}
