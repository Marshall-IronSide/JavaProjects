public class  castingExample{ 
    public static void main(String[] args) {
        //long to double automatic conversion
        long l;
        double d,x,y;
        byte b;
        int i;
        char ch;
         x = 10.0;
         y = 3.0;
        l = 100123285L;
        d = l; //l = d is impossible
        System.out.println("D and L " +d+" "+l);
        i = (int)(x / y); // cast double to int 
        System.out.println("Integer outcome of x / y is "+i );
        b = (byte)i;
        System.out.println("value of b is "+b);
        b = 88; // ASCi number for x
        ch = (char)b;
        System.out.println("ch is "+ch);
        b = 10;
        i = b*b;
        b = (byte)(b*b);
        System.out.println("i and b "+i+" "+b);



    }
}