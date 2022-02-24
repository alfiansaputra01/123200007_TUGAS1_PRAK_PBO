/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123200007_alfian_saputra_tugaskonversisuhu;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float suhu;
        int pilih;
        
        System.out.println("+--------------------+");
        System.out.println("|    MENU KONVERSI   |");
        System.out.println("+--------------------+");
        System.out.println("| input data         |");
        System.out.println("+--------------------+");
        
        System.out.print("suhu dalam celcius : ");
        suhu = input.nextFloat();
        
        do{
            konversi hasil = new konversi(suhu);
            System.out.println("opsi");
            System.out.println("------\n");
            
            System.out.println("1. lihat data konversi");
            System.out.println("2. edit data konversi");
            System.out.println("3. exit");
            System.out.print("masukkan pilihan : ");
            
            pilih = input.nextInt();
            
            if (pilih == 1){
                System.out.println("farenheit : " + hasil.farenheit());
                System.out.println("reamur    : " + hasil.reamur());
                System.out.println("kelvin    : " + hasil.kelvin() + "\n");
                
                System.out.println(hasil.keterangan());
            } else if (pilih == 2){
                System.out.println("+--------------------+");
                System.out.println("| input data         |");
                System.out.println("+--------------------+");
        
                System.out.print("suhu dalam celcius : ");
                suhu = input.nextFloat();
            } else if (pilih != 3){
                System.out.println("opsi tidak ada, silahkan coba lagi!");
            }
        }while (pilih != 3 );
        
    }
    
}
