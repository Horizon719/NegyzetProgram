package oraimunka;

public class OraiMunka {

    public static void main(String[] args) {
        new OraiMunka().program();
    }
    
    private void program(){
        Negyzet n1 = new Negyzet();
        n1.setOldal(5);
        n1.setX(3);
        n1.setY(5);
        System.out.printf("A négyzet adatai:\n%s"
                + "\tAz oldala %d egység hosszú.\n"
                + "\tA területe: %.0f egység.\n", n1.getKoordinata(), n1.getOldal(), n1.terulet());
    }
    
}
