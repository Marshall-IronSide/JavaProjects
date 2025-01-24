public class ExampleKeyboardInput {
    public static void main(String[] args) {
        System.out.println("Entrez un nombre");
        int a = Keyboard.readInt();
        System.out.println("Entrez un 2nd nombre");
        int b = Keyboard.readInt();
        System.out.println("Entrez un troisième nombre");
        int c = Keyboard.readInt();
        System.out.println("The avarage is "+(a+b+c)/3);
    }
}
