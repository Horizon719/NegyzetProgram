package oraimunka;

public class OraiMunka {

    public static void main(String[] args) {
        new OraiMunka().program();
    }
    
    private void program(){
        Negyzet n1 = new Negyzet(6, 2, 3);
        Negyzet n2 = new Negyzet(9, 1, 1);
        
        System.out.printf("n1 és n2 négyzetek %s\n", n1.egyformakE(n2));
        System.out.println("n1 és n2 négyzetek egyformák--->" + n1.equals(n2));
        System.out.println(n1);
        
    }



    
}
