public class findbit {
    public static void main(String[] args) {
        int n = 8;
        int i = 3;
        
        int mask = n & (1<<i) ;
        if(mask!=0)
        {
            System.out.println(mask+"Bit is set");
        }
        else{
            System.out.println( mask+"Bit is not set" );
        }

    }
}
