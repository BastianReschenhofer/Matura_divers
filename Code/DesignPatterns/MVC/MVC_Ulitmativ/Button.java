public class Button {
    private final int x, y;

    public Button(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {return x;}
    public int getY() {return y;}

    public boolean inside(int cx, int cy) {
        return cx > x && cx < (x + 50) && cy > y && cy < (y + 50);
    }
}