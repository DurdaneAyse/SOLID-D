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
public interface Iletisim {
    
    void bilgiGonder(Kullanici kullanici,String mesaj);
}
