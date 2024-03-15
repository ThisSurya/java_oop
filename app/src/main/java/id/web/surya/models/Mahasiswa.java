/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.web.surya.models;

/**
 *
 * @author ceplo
 */
public class Mahasiswa {
    public String nim, nama;
    public int jmlSks;
    public double ipk;
    private String [] noHp = new String[10];
    
    private int jmlHp = 0;
    
    public void addHP(String hp){
        if(this.jmlHp < 10){
            this.noHp[jmlHp] = hp;
            this.jmlHp++;
        }else{
            System.out.println("Dah penuh ngab!");
        }
    }
    
    public void cetakLap(){
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Jml Sks: " + this.jmlSks);
        System.out.println("kontak");
        
        for(int i = 0; i < jmlHp; i++){
            System.out.println(" -" + this.noHp[i]);
        }
        
    }
}
