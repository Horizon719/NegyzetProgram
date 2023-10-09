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
        n1.allapot();
    }



    
}
