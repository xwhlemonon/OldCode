package NewGame;

import java.util.Random;

public class Shape {
    private Tearooms pieceShape;
    private final int[][] cords;

    public Shape() {
        cords = new int[4][2];
        setShape(Tearooms.NoShape);
    }

    public void setShape(Tearooms shape) {
        int[][][] cordsTable = new int[][][]{
                {{0, 0}, {0, 0}, {0, 0}, {0, 0}},
                {{0, -1}, {0, 0}, {-1, 0}, {-1, 1}},
                {{0, -1}, {0, 0}, {1, 0}, {1, 1}},
                {{0, -1}, {0, 0}, {0, 1}, {0, 2}},
                {{-1, 0}, {0, 0}, {1, 0}, {0, 1}},
                {{0, 0}, {1, 0}, {0, 1}, {1, 1}},
                {{-1, -1}, {0, -1}, {0, 0}, {0, 1}},
                {{1, -1}, {0, -1}, {0, 0}, {0, 1}}
        };
        for (int i = 0; i < 4; i++) {
            System.arraycopy(cordsTable[shape.ordinal()][i], 0, cords[i], 0, 2);
        }
        pieceShape = shape;
    }

    private void setX(int index, int x) {
        cords[index][0] = x;
    }

    private void setY(int index, int y) {
        cords[index][1] = y;
    }

    public int x(int index) {
        return cords[index][0];
    }

    public int y(int index) {
        return cords[index][1];
    }

    public Tearooms getShape() {
        return pieceShape;
    }

    public void setRandomShape() {
        Random r = new Random();
        int x = Math.abs(r.nextInt()) % 7 + 1;
        Tearooms[] values = Tearooms.values();
        setShape(values[x]);
    }

    public int minY() {
        int m = cords[0][1];
        for (int i = 0; i < 4; i++) {
            m = Math.min(m, cords[i][1]);
        }
        return m;
    }

    public Shape rotateLeft() {
        if (pieceShape == Tearooms.SquareShape)
            return this;
        Shape result = new Shape();
        result.pieceShape = pieceShape;
        for (int i = 0; i < 4; i++) {
            result.setX(i, y(i));
            result.setY(i, -x(i));
        }
        return result;
    }

    public Shape rotateRight() {
        if (pieceShape == Tearooms.SquareShape)
            return this;
        Shape result = new Shape();
        result.pieceShape = pieceShape;
        for (int i = 0; i < 4; i++) {
            result.setX(i, -y(i));
            result.setY(i, x(i));
        }
        return result;
    }
}
