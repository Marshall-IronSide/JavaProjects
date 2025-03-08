import java.util.InputMismatchException;
import java.util.Scanner;
public class EssaiException {
    public static void main(String[] args) {
        int a, b, res;
        Scanner clavier = new Scanner(System.in);

        try {
            System.out.println("Donner la valeur de a");
            a = clavier.nextInt();
            System.out.println("Donner la valeur de b");
            b = clavier.nextInt();
            res = a / b;
            System.out.println("le résultat de " + a + " divisé par " + b + " est " + res);
        }
        catch (ArithmeticException e) {
            System.out.println("Erreur arithmétique b ne peut pas être nulle "+e);
        }
        catch (InputMismatchException e){
            System.out.println("Erreur de saisie a et b ne peuvent être que des entiers "+e);
        }
        finally {
            System.out.println ("Fin du programme");
        }
    }
}