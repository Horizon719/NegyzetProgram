package oraimunka;

public class Negyzet {
    private int oldal, x, y;
    
    public int getOldal(){
        return this.oldal;
    }

    public void setX(int x) {
        if(x == 0){
            this.x = 1;
        } else{
            this.x = x;
        }
    }

    public void setY(int y) {
        if(y == 0){
            this.y = 1;
        } else{
            this.y = y;
        }
    }
    
    
    
    public void setOldal(int oldal){
        if(oldal == 0){
            this.oldal = 1;
        } else{
            this.oldal = oldal;
        }
    }
    
    public double terulet(){
        double terulet = Math.pow(oldal, 2);
        return terulet;
    }
    
    public void allapot() {
        System.out.printf("A négyzet állapota:\n\toldala: %d\n\t"
                + "koordináta: %d, %d\n\tterület: %.0f\n", oldal, x,y, this.terulet());
    }
}
