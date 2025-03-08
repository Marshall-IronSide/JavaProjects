public class Main {
    public static void main(String[] args) {
        Entreprise E1 = new Entreprise();
        E1.afficher();
        Entreprise E2 = new Entreprise("Fidélia",18,"96 46 29 56", 5000,50);
        E2.afficher();
        Entreprise E3 = new Entreprise();
        E3.afficher();
    }
}