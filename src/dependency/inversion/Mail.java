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
public class Mail implements Iletisim{
    public void mailGonder(String mail,String mesaj){
        System.out.println(mail +" adresine"+mesaj+" gönderildi");
    }

    @Override
    public void bilgiGonder(Kullanici kullanici, String mesaj) {
      mailGonder(kullanici.getMail(),mesaj);
    }
}
