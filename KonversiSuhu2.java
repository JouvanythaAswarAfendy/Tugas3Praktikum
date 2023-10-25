/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum3;

/**
 *
 * @author HP
 */
public class KonversiSuhu2 extends KonversiSuhu{
    double fr;
    double fahrenheitToReamur(double f){
        fr = 0.4444444444444444 * (f - 32);
        System.out.println("Fahrenheit ke Reamur (27°F)      = " + fr + " R");
        return fr;
    }
}
