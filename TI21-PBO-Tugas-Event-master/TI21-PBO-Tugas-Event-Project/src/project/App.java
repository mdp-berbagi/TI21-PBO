package project;

import view.Auth;
import view.FrameMahasiswa;

/**
 *
 * @author Abdul Aziz Al Basyir
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Auth windowAuth = new Auth();
        windowAuth.login();
        
        FrameMahasiswa fMahasiswa = new FrameMahasiswa(windowAuth.session);
    }
    
}
