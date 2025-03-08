package Devoir;

public class A {
    private int i;
    private int k = 0;
    private static int j = 0;

    // Constructeur de la classe
    public A(int i) {
        this.i = i; // Initialisation de l'attribut i
        j++;         // Incrémentation de j
        k = j;       // Affectation
         }

    // Méthode pour afficher les valeurs des attributs
    public void print() {
        System.out.println("i=" + i + ", j=" + j + ", k=" + k);
    }

    public static void main(String[] argv) {
        new A(3);          // Création d'un premier objet A, j passe à 1, k devient 1
        A a1 = new A(2);    // Création de a1, j passe à 2, k devient 2
        A a2 = new A(4);    // Création de a2, j passe à 3, k devient 3

        a1.print();         // Affiche les valeurs de a1: i=2, j=3, k=3
        a2.print();         // Affiche les valeurs de a2: i=4, j=3, k=3

        A a3 = new A(1);    // Création de a3, j passe à 4, k devient 4

        a1.print();
        a3.print();
    }


}
