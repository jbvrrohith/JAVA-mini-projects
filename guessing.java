import java.util.*;
public class guessing{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        final int m = 10;
        int i =0;
        while (i<4){
            int r = generator.nextInt(1,m+1);
            int g = scan.nextInt();
            if (r==g){
                System.out.println("You are Winner");
                break;
            }
            else{
                System.out.println("try again");
                System.out.println("random number"+r);
                i=i+1;
            }
        }
    }
}
