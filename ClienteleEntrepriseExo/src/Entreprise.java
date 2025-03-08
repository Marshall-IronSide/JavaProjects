public class Entreprise extends Client {
    protected int nombreSalaries;
    protected int tauxRabais;
    public Entreprise() {
        this.nombreSalaries = 4000;
        this.tauxRabais = 20;
    }
    public Entreprise(String nom, int age,String tel,int nbreSalarie, int tauxRabais ) {
        this.tauxRabais = tauxRabais;
        this.nombreSalaries = nbreSalarie;
        super.nom = nom;
        super.age = age;
        super.tel = tel;
    }
    public void afficher() {
        System.out.println("Nom: " + nom+ "\nAge: " + age+"\nTel: "+ tel+ "\nNombre de salaries: "+ nombreSalaries+"\nTaux Rabais: " + tauxRabais+"\n");
    }
}
