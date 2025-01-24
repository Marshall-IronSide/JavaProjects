public class EuroConv {
    public static void main(String[] args) {
        int euro;
        double cfa;
        System.out.println();
        System.out.println("conversion table Euros to CFA");
        System.out.println("_______________________________________________________________");
        System.out.println();
        for( euro = 1; euro <= 100; euro++)
        {
            cfa = euro*655;
            System.out.println(euro+" euro equal: "+ cfa +" CFA");
        }

    }
}
