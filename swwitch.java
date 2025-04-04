import java.util.Scanner;

public class swwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();
         // if we press 1 it will print namaste //
         // if 2 then bojour//
         //if 3 then gracias//
         //gg

         switch (button) {
            case 1: System.out.println("namaste");
                
                break;
         case 2: System.out.println("bonjour");

         break;
         
         case 3:System.out.println("gracias");
         break;
            default:System.out.println("invalid button");
                break;
         }
    }
}
