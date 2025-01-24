public class Guess {
    public static void main(String[] args)
    throws java.io.IOException{
        char ch, ansewr = 'k';
        System.out.println("I'm thinking between A and Z");
        System.out.println("can u guess it ? :");
        ch = (char) System.in.read();
        if (ch == ansewr) System.out.println("**Right**");
        else{ 
        System.out.println("**..Sorry! u're wrong**");
        if(ch < ansewr) System.err.println("**Too low**");
        else System.out.println("**too high**");
        }
    }
}