public class TestPersonnage {
    public static void main(String[] args) {
        guerrier guerrier1 = new guerrier("Aragorn", 10, 100, "Épée", true);
        guerrier guerrier2 = new guerrier("Legolas", 9, 80, "Arc", false);

        // Affichage de l'état des guerriers
        guerrier1.afficheGuerrier();
        guerrier2.afficheGuerrier();

        // Exemple d'ajout et de retrait de points de vie
        guerrier1.ajoutVie(20);
        guerrier2.retirerVie(30);

        // Affichage des nouveaux états après modification des points de vie
        System.out.println("\nAprès modification des points de vie:");
        guerrier1.afficheGuerrier();
        guerrier2.afficheGuerrier();

    }
}
