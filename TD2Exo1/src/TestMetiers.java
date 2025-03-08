public class TestMetiers {
    public static void main(String[] argv) {
        personne[ ] personnes = new personne[3] ;
        personnes [ 0 ] = new Menuisier( "Paul" ) ;
        personnes [ 1 ] = new Plombier( "Jean" ) ;
        personnes [ 2 ] = new Menuisier( "Adrien" ) ;
        for( int i=0 ; i< personnes.length ; i++ ) personnes[i].affiche() ;
    }
}
