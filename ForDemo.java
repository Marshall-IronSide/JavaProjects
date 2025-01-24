public class ForDemo {
        public static void main(String[] var0) {
            int a,b,c;
            a = 2;
            b = 3;
           for(int var1 = 0; var1 < 5; var1++) {
              System.out.println("This is count: " + var1);
           }
           System.out.println ("Done!");
           System.out.println();

           c = a - b;
           System.out.println("c is : "+c);
           if(c >= 0)
           {
            System.out.println("c is a postive number");
           }
           if(c<0)
           {
            System.out.println("c is a negative number");
            System.out.println();

           }
           c = b - a;
           System.out.println("c is : "+c);
           if(c >= 0)
           {
            System.out.println("c is a postive number");
           }
           if(c<0)
           {
            System.out.println("c is a negative number");
            }
        }
}

