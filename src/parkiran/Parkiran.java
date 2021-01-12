package parkiran;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import javax.swing.UIManager;



public class Parkiran {

    
    public static void main(String[] args) {
        koneksiDB konek = new koneksiDB();
        konek.koneksiDB();
        try 
        {
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        } 
        catch (Exception e) 
        {
          e.printStackTrace();
        }
        new MainMenu().setVisible(true);
    }
    
}
