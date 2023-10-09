package oraimunka;

public class Negyzet {
    private int oldal;
    private Koordinata k1 = new Koordinata();
    
    
    public int getOldal(){
        return this.oldal;
    }
    
    public void setOldal(int oldal){
        if(oldal < 0){
            this.oldal = 1;
        } else{
            this.oldal = oldal;
        }
    }
    
    public double terulet(){
        double terulet = Math.pow(oldal, 2);
        return terulet;
    }
    
    public void koordAllit(){
        k1.setX(3);
        k1.setY(5);
    }
    
    public void allapot() {
        koordAllit();
        System.out.printf("A négyzet állapota:\n\toldala: %d\n\t"
                + "koordináta: %d, %d\n\tterület: %.0f\n", oldal, k1.getX(), k1.getY(), this.terulet());
    }
}
