public class Client {
    protected String nom;
    protected String tel;
    protected int age;

    public Client() {
        this.nom = "Martin";
        this.tel = "70 09 74 54";
        this.age = 25;
    };
    public Client(String nom, String tel, int age) {
        this.nom = nom;
        this.tel = tel;
        this.age = age;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {

        this.nom = nom;
    }
    public String getTel() {

        return tel;
    }
    public void setTel(String tel){

        this.tel = tel;
    }
    public int getAge() {

        return age;
    }
    public void setAge(int age) {

        this.age = age;
    }
    public void afficher(){

        System.out.println("Nom: " + nom + ", tel: " + tel + ", age: " + age);
    }
    public void ajoutAge(int age){

        this.age+= age;
    }
}
