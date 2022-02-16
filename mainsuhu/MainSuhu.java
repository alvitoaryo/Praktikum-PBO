/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainsuhu;

import java.util.Scanner;

public class MainSuhu {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int pilih;
int sh ,number;
for(String ulang="y";ulang.equals("y")||ulang.equals("Y");){
        KonversiSuhu konversiSuhu = new KonversiSuhu();

        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        do{
        System.out.print("Masukan Suhu Dalam Celcius\t: ");
        float suhu = scan.nextFloat();
        do{
        System.out.println("\n Opsi");
        System.out.println("----");
        System.out.println("1. Lihat Data Konversi");
        System.out.println("2. edit Data Konversi");
        System.out.println("3. exit");
        System.out.print("pilih\t: ");
        pilih=scan.nextInt();
        if(pilih==1){
        Float suhu1 = konversiSuhu.CelciusFahrenheit(suhu);
        System.out.println("Celcius Ke Fahrenheit\t: " + suhu1);

  
        Float suhu2 = konversiSuhu.FahrenheitKelvin(suhu1);
        System.out.println("Fahrenheit Ke Kelvin\t: " + suhu2);

        
        Float suhu3 = konversiSuhu.KelvinReamur(suhu2);
        System.out.println("Kelvin Ke Reamur\t: " + suhu3);

       
        Float suhu4 = konversiSuhu.RearmurCelcius(suhu3);
        System.out.println("Reamur Ke Celcius\t: " + suhu4);
        
       
        if(suhu<=0){
            System.out.println("Air membeku");
        }else if(suhu>=1 && suhu<=99){
            System.out.println("Air normal");
        }else if(suhu>=100){
            System.out.println("Air Mendidih");
        }
        }else if(pilih==2){
        }else if(pilih==3){
        scan.close();
        }else if(pilih==4){
            System.out.println("Tidak ada dalam menu");
        }
        }while(pilih==4);
        }while(pilih==2);
       
         System.out.println("ulangi??");
         ulang=scan.next();   
    }
}

        }
        