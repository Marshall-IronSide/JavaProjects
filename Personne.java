public class Personne {
    private String nom;
    private int age;
    private char sexe;
    public void initialiser(String n, int a, char s){
        nom = n;
        age = a;
        sexe = s;
    }
    public void affiche(){
        System.out.println(nom+" a "+age+" ans et de sexe "+sexe);
    
    }
    public int donnerAge(){
        return age;
    }
}
