package oraimunka;

public class Negyzet {
    private int oldal;
    private Koordinata k1;
    
    public Negyzet(int oldal, int x, int y){
        setOldal(oldal);
        k1 = new Koordinata(x, y);
    }
    
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
    
    public String egyformakE(Negyzet uj){
        if (uj.oldal == this.oldal) {
            return "egyformák";
        } else {
            return "nem egyformák";
        }
    }

    @Override
    public String toString() {
        String txt = "A négyzet állapota:\n\toldala: %d\n\t"
                + "koordináta: %d, %d\n\tterület: %.0f\n".formatted(oldal, k1.getX(), k1.getY(), this.terulet());
        return txt;
    }

    
}
