
/*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.JPanel;

public class Paneeli extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];

    int osat = 6;
    int montaSyoty;
    int namiX;
    int namiY;
    char suunta = 'R';
    boolean liikkuu = false;
    Timer t;
    Random r;

    Paneeli() {
        r = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        aloitaPeli();
    }

    public void aloitaPeli() {
        uusiNami();
        liikkuu = true;
        t = new Timer(DELAY, this);
        t.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        piirra(g);
    }

    public void piirra(Graphics g) {
        if (liikkuu) {

            g.setColor(Color.red);
            g.fillOval(namiX, namiY, UNIT_SIZE, UNIT_SIZE);

            for (int i = 0; i < osat; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    g.setColor(new Color(45, 180, 0));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
            g.setColor(Color.white);
            g.setFont(new Font("Ink Free", Font.BOLD, 40));
            FontMetrics m = getFontMetrics(g.getFont());
            g.drawString("Pisteet: " + montaSyoty, (SCREEN_WIDTH - m.stringWidth("Pisteet: " + montaSyoty)) / 2, g.getFont().getSize());
        } else {
            gameOver(g);
        }
    }

    public void uusiNami() {
        namiX = r.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        namiY = r.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
    }

    public void liiku() {
        for (int i = osat; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];

        }

        switch (suunta) {
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;
        }

    }

    public void nappaaNami() {
        if ((x[0] == namiX) && (y[0] == namiY)) {
            osat++;
            montaSyoty++;
            uusiNami();
        }
    }

    public void onkoTormays() {
        //Osuuko pää kehoon
        for (int i = osat; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                liikkuu = false;
            }
        }

        //Osuuko pää vasempaan seinään
        if (x[0] < 0) {
            liikkuu = false;
        }
        //Osuuko pää oikeaan seinään
        if (x[0] > SCREEN_WIDTH) {
            liikkuu = false;
        }
        //Osuuko pää yläseinään
        if (y[0] < 0) {
            liikkuu = false;
        }
        //Osuuko pää alaseinään
        if (y[0] > SCREEN_HEIGHT) {
            liikkuu = false;
        }

        if (!liikkuu) {
            t.stop();
        }

    }

    public void gameOver(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Ink Free", Font.BOLD, 40));
        FontMetrics m1 = getFontMetrics(g.getFont());
        g.drawString("Pisteet: " + montaSyoty, (SCREEN_WIDTH - m1.stringWidth("Pisteet: " + montaSyoty)) / 2, g.getFont().getSize());

        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics m2 = getFontMetrics(g.getFont());
        g.drawString("Game Over", (SCREEN_WIDTH - m2.stringWidth("Game Over")) / 2, SCREEN_HEIGHT / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (liikkuu) {
            liiku();
            nappaaNami();
            onkoTormays();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (suunta != 'R') {
                        suunta = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (suunta != 'L') {
                        suunta = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (suunta != 'D') {
                        suunta = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (suunta != 'U') {
                        suunta = 'D';
                    }
                    break;
                case KeyEvent.VK_R:
                    aloitaPeli();
                    break;
            }
        }
    }

}*/
