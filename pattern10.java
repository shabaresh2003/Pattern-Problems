public class pattern10 {
    public static void main(String[] args) {
        int n = 8;
        for( int i = 1 ;i <=n/2;i++)
        {
            for(int j = 1 ; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for( int i = n/2 ;i>=1 ;i--)
        {
            for(int j = 1 ; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for( int i =n/2 ; i<= n ; i++)
        {
            for( int j =1; j <=n-i ;j++ )
            {
                System.out.print(" ");
            }
            for( int k = 1; k <=i ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
        
        
    }

