public class testPersonne {
    public static void main(String[] args) {
        Personne P;
        P = new Personne();
        P.initialiser("Koffi", 20, 'M');
        P.affiche();
        int age = P.donnerAge();
        System.out.println("age = "+ age);

    }
}
