package NewGame;

import javax.swing.JFrame;

public class Tetris extends JFrame {
    private static final long serialVersionUID = 1L;

    public Tetris() {
        initUI();
    }

    private void initUI() {
        add(new Board());
        setTitle("Tetris");
        setSize(200, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            Tetris game = new Tetris();
            game.setVisible(true);
        });
    }
}
