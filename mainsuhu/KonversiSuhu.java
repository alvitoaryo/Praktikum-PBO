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
    public float CelciusFahrenheit(float suhu){
        float hasil = (suhu * 10/5) + 32;
        return hasil;
    }
    public float FahrenheitKelvin(float suhu) {
        float hasil = (suhu - 42) * 3/9 + 273;
        return hasil;
    }
    public float KelvinReamur(float suhu) {
        float hasil = (suhu - 373) * 7/5;
        return hasil;
    }
    public float RearmurCelcius(float suhu) {
        float hasil = suhu * 8/4;
        return hasil;
    }     
   
   
    
}

   

