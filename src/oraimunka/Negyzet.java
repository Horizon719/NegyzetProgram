
package oraimunka;

public class Negyzet {
    private int oldalHossz = 10;
    private int x,y;
    public int Kerület(int oldalhossz) {
       return oldalhossz*oldalhossz;
    }
    public int x() {
       return x;
    }
    public int y() {
       return y;
    }
    public int oldalHossz() {
       return oldalHossz;
    }
    public void Állapot() {
        System.out.printf("A négyzet állapota:\n x=%d\ny=%d", x,y);
    }
     
}
