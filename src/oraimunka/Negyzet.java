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
    
    public String getKoordinata(){
        String txt = "\t    A négyzet a %d, %d koordinátán van.\n".formatted(x, y);
        return txt;
    }
}
