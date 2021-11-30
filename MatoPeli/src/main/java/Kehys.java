
import javax.swing.JFrame;

public class Kehys extends JFrame {
    
    Kehys() {
        Paneeli p = new Paneeli();
        this.add(p);
        this.setTitle("Matopeli");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
}
