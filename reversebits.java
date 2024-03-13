public class reversebits {
    public static boolean findithbit(int k , int a)
    {
        if((1<<(k-1) & a) != 0)
        return true;
        return false;

    }
    public static void main(String[] args) {
        int n = 4;
        int ans =0;
        for( int i = 1 ; i<= 32 ;i++)
        {
            if(findithbit(i, n))
            ans = 1 <<(32-i) | ans ;
        }
        System.out.println(ans);
    }
    
}
