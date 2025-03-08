public class VariableScopeNdLifetime {
    public static void main(String[] args) {
        int x; //known to all code within main
        x = 10;
        if(x == 10){ //start new scope
            int y = 20;//known only in this block (x and y are both known here)
            System.out.println("X and y "+x+" "+y);
            x = y*2;
        }
        //y = 100; //Error cause y isn't known her
        //x is still known her
        System.out.println("X is "+x);
    }
    
}
