/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum3;

/**
 *
 * @author HP
 */
public class Matematika{
    public int pertambahan(int a, int b){
        int tambah = a + b;
        System.out.println("Hasil Pertambahan 20 + 10  : " + tambah);
        return tambah;
    }
    
    public int pengurangan(int a, int b){
        int kurang = a - b;
        System.out.println("Hasil Pengurangan 10 - 5   : " + kurang);
        return kurang;
    }
    
    public int perkalian(int a, int b){
        int kali = a * b;
        System.out.println("Hasil Perkalian 10 * 3     : " + kali);
        return kali;
    }
    
    public int pembagian(int a, int b){
        int bagi = a / b;
        System.out.println("Hasil Pembagian 21 / 2     : " + bagi);
        return bagi;
    }
}
