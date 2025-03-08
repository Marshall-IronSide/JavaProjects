public class Example17 {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++){
            int y = -1; // y is initislised each time this block is entered
            System.out.println("Y is "+y);
            y = 100;
            System.out.println("Y is now "+y);

        }
    }
}
