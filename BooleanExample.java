public class BooleanExample{
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b is : "+b);
        if(b)
    {
        System.out.println("This is not executed");
    }
    b = true;
    System.out.println("b is : "+b);
    if(b)
    {
        System.out.println("This is executed");
    }
        System.out.println("10 > 9 is : "+ (10>9));
        System.out.println("10 < 9 is : "+ (10<9));
    }
}