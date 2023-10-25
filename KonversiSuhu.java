/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum3;

/**
 *
 * @author HP
 */
public class KonversiSuhu {
    double cf;
    double cr;
    
    double celciusToFahrenheit(double c){
       cf = (1.8 * c) + 32;
       System.out.println("Celcius ke Fahrenheit (40°C)     = " + cf + " F");
       return cf;
    }
    
    double celciusToReamur(double c){
       cr = 0.8 * c;
       System.out.println("Celcius ke Reamur (77°C)         = " + cr + " R");
       return cr;
    }
}
