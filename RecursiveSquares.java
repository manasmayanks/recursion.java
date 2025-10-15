public class RecursiveSquares {
    public static void drawSquares(double x, double y, double size) {
        if (size < 0.01) return;

        StdDraw.square(x, y, size);
        drawSquares(x - size, y - size, size / 2);
        drawSquares(x + size, y - size, size / 2);
        drawSquares(x - size, y + size, size / 2);
        drawSquares(x + size, y + size, size / 2);
    }

    public static void main(String[] args) {
        StdDraw.setScale(-1.0, 1.0);
        drawSquares(0.0, 0.0, 0.5);
    }
}



