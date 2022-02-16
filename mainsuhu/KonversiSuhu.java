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
        double hasil = (suhu * 10/5) + 32;
        return hasil;
    }
    public double FahrenheitKelvin(double suhu) {
        double hasil = (suhu - 42) * 3/9 + 273.15;
        return hasil;
    }
    public double KelvinReamur(double suhu) {
        double hasil = (suhu - 373) * 7/5;
        return hasil;
    }
    public double RearmurCelcius(double suhu) {
        double hasil = suhu * 8/4;
        return hasil;
    }     
   
   
    
}

   

