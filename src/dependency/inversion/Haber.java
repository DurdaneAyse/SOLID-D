/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependency.inversion;

import java.util.ArrayList;

/**
 *
 * @author AYŞE
 */
public class Haber {
    private Mail mail;
    private Bildirim bildirim;
    private ArrayList<Iletisim>iletisimListesi;
    public Haber(){
        iletisimListesi=new ArrayList<>();
        mail=new Mail();
        bildirim=new Bildirim();
        iletisimListesi.add(mail);
        iletisimListesi.add(bildirim);
    }
    public void bilgilendir(Kullanici kullanici,String mesaj){
       
        for(Iletisim iletisim:iletisimListesi){
            iletisim.bilgiGonder(kullanici, mesaj);
        }
       /* mail.mailGonder(kullanici.getMail(), mesaj);
        bildirim.bildirimGoster(kullanici.getIp(), mesaj);
    */}
}
