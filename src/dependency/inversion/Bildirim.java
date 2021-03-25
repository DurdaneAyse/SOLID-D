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
public class Bildirim implements Iletisim{
    public void bildirimGoster(String ip,String mesaj,String baslik){
        System.out.println(ip + " adresine"+mesaj+" gönderildi");
    }

    @Override
    public void bilgiGonder(Kullanici kullanici, String mesaj) {
      bildirimGoster(kullanici.getIp(),mesaj," Deneme Başlık");
    }
    
}
