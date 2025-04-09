public class Invhalfpyd {
       
     public static void main(String[] args) {
        
    int n = 4;
    // outer loop
    for(int i = n; i>=1; i--) {
        // inner loop
        for(int j = 1; j <=i; j++){
            System.err.print("*");
        }
        System.out.println();
    }
    }
}

