import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows ,cols ,sp;
        for( rows = 1 ; rows  <= n ; rows ++)
        {
            for(sp = 1 ; sp <= n-rows ; sp++)
            {
                System.out.print(" ");
            }
            for(cols = 1 ; cols <= rows ; cols++)
            {
                if(cols == 1 || cols == rows)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        for( rows = 1 ; rows  < n ; rows ++)
        {
            for(sp = 1 ; sp <=rows ; sp++)
            {
                System.out.print(" ");
            }
            for(cols = 1 ; cols <= n-rows  ; cols++)
            {
                if(cols == 1 || cols ==n-rows)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }

    }
    
}
