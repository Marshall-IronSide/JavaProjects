

public class Logictable {
    public static void main(String[] args) {
        boolean p,q;
        System.out.println("P\tQ\tPandQ\tPorQ\tPxorQ\tNot p");
        p = true; q = true;
        System.out.print(p+"\t"+q+"\t");
        System.out.println((p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));
        p = true; q = false;
        System.out.print(p+"\t"+q+"\t");
        System.out.println((p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));
        p = false; q = true;
        System.out.print(p+"\t"+q+"\t");
        System.out.println((p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));
        p = false; q = true;
        System.out.print(p+"\t"+q+"\t");
        System.out.println((p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));

    }
}
/*print = print without adding a new line
println = add a new line after printing*/