package oraimunka;

public class Koordinata {
    private int x, y;
    
    public Koordinata(int x, int y){
        this.x = setX(x);
        this.y = setY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int setX(int x) {
        return x;
    }

    public int setY(int y) {
        return y;
    }
}
