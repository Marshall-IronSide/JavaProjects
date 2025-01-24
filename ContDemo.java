// Demonstrate the continue.
public class ContDemo {
    public static void main(String args[]) {
    int i;
    float k;
    for(i = 1; i<10; i++) {
    if(i==2) continue;
    k = (float)1/(i-2); 
    System.out.println(k);
    }
    }
   }