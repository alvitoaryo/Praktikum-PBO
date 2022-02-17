/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainsuhu;

/**
 *
 * @author Aluito Aryo Prabowo
 */
public class KonversiSuhu {
    public double CelciusFahrenheit(double suhu){
        double hasil = (suhu * 9)/5 + 32;
        return hasil;
    }
    public double celciusKelvin(double suhu) {
        double hasil = (suhu + 273.15);
        return hasil;
    }
    public double celciusReamur(double suhu) {
        double hasil = (4*suhu)/5;
        return hasil;
    }     
   
   
    
}

   

