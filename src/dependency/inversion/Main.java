/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependency.inversion;

/**
 *
 * @author AYŞE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kullanici kullanici=new Kullanici("sefa aras","sefaaras@ktu.edu.tr","05537032598","192.1.1.1");
         Haber haber=new Haber();
         haber.bilgilendir(kullanici, " Deneme Mesajı");
    }
    
}
