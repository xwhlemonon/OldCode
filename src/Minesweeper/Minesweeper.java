package Minesweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Minesweeper extends JFrame {
    private static final int GRID_SIZE = 10;
    private static final int NUM_MINES = 10;
    private static final int CELL_SIZE = 30;

    private final Cell[][] cells = new Cell[GRID_SIZE][GRID_SIZE];

    public Minesweeper() {
        setTitle("Minesweeper");
        setSize(GRID_SIZE * CELL_SIZE, GRID_SIZE * CELL_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));

        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                cells[row][col] = new Cell(row, col);
                cells[row][col].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        Cell cell = (Cell) e.getSource();
                        if (SwingUtilities.isLeftMouseButton(e)) {
                            reveal(cell);
                        } else if (SwingUtilities.isRightMouseButton(e)) {
                            toggleFlag(cell);
                        }
                    }
                });
                add(cells[row][col]);
            }
        }

        placeMines();
        calculateAdjacentMines();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Minesweeper game = new Minesweeper();
            game.setVisible(true);
        });
    }

    private void placeMines() {
        Random random = new Random();
        int placedMines = 0;
        while (placedMines < NUM_MINES) {
            int row = random.nextInt(GRID_SIZE);
            int col = random.nextInt(GRID_SIZE);
            if (!cells[row][col].isMine()) {
                cells[row][col].setMine(true);
                placedMines++;
            }
        }
    }

    private void calculateAdjacentMines() {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (!cells[row][col].isMine()) {
                    int adjacentMines = 0;
                    for (int r = -1; r <= 1; r++) {
                        for (int c = -1; c <= 1; c++) {
                            if (isValid(row + r, col + c) && cells[row + r][col + c].isMine()) {
                                adjacentMines++;
                            }
                        }
                    }
                    cells[row][col].setAdjacentMines(adjacentMines);
                }
            }
        }
    }

    private boolean isValid(int row, int col) {
        return row >= 0 && row < GRID_SIZE && col >= 0 && col < GRID_SIZE;
    }

    private void reveal(Cell cell) {
        if (cell.isRevealed() || cell.isFlagged()) {
            return;
        }

        cell.reveal();
        if (cell.isMine()) {
            gameOver();
        } else if (cell.getAdjacentMines() == 0) {
            for (int r = -1; r <= 1; r++) {
                for (int c = -1; c <= 1; c++) {
                    if (isValid(cell.getRow() + r, cell.getCol() + c)) {
                        reveal(cells[cell.getRow() + r][cell.getCol() + c]);
                    }
                }
            }
        }

        if (checkWin()) {
            JOptionPane.showMessageDialog(this, "You Win!");
            System.exit(0);
        }
    }

    private void toggleFlag(Cell cell) {
        if (!cell.isRevealed()) {
            cell.toggleFlag();
        }
    }

    private void gameOver() {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (cells[row][col].isMine()) {
                    cells[row][col].reveal();
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Game Over!");
        System.exit(0);
    }

    private boolean checkWin() {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (!cells[row][col].isMine() && !cells[row][col].isRevealed()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static class Cell extends JPanel {
        private final int row;
        private final int col;
        private boolean isMine, isRevealed, isFlagged;
        private int adjacentMines;

        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
            this.isMine = false;
            this.isRevealed = false;
            this.isFlagged = false;
            this.adjacentMines = 0;
            setPreferredSize(new Dimension(CELL_SIZE, CELL_SIZE));
            setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }

        public boolean isMine() {
            return isMine;
        }

        public void setMine(boolean isMine) {
            this.isMine = isMine;
        }

        public boolean isRevealed() {
            return isRevealed;
        }

        public void reveal() {
            this.isRevealed = true;
            repaint();
        }

        public boolean isFlagged() {
            return isFlagged;
        }

        public void toggleFlag() {
            this.isFlagged = !this.isFlagged;
            repaint();
        }

        public int getAdjacentMines() {
            return adjacentMines;
        }

        public void setAdjacentMines(int adjacentMines) {
            this.adjacentMines = adjacentMines;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (isRevealed) {
                if (isMine) {
                    g.setColor(Color.RED);
                    g.fillOval(5, 5, getWidth() - 10, getHeight() - 10);
                } else {
                    g.setColor(Color.WHITE);
                    g.fillRect(0, 0, getWidth(), getHeight());
                    if (adjacentMines > 0) {
                        g.setColor(Color.BLACK);
                        g.drawString(String.valueOf(adjacentMines), getWidth() / 2 - 4, getHeight() / 2 + 4);
                    }
                }
            } else {
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(0, 0, getWidth(), getHeight());
                if (isFlagged) {
                    g.setColor(Color.RED);
                    g.drawString("F", getWidth() / 2 - 4, getHeight() / 2 + 4);
                }
            }
        }
    }
}
