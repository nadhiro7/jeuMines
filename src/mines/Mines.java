package mines;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

// Source: http://zetcode.com/tutorials/javagamestutorial/minesweeper/

public class Mines extends JFrame {
	private static final long serialVersionUID = 4772165125287256837L;
	
	private static final int WIDTH = 250;
    private static final int HEIGHT = 290;

    
    public Mines() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Minesweeper");
        JLabel statusbar;
        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);

        add(new Board(statusbar));

        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Mines();
    }
}