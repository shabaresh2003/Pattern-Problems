public class setibit {
    public static void main(String[] args) {
        int n = 4;
        int i = 0 ;
        System.out.println("Original Binary: "+Integer.toBinaryString(n));
        int mask = n | (1<<i);
        System.out.println(mask +"   binary   :" + Integer.toBinaryString(mask));
    }
    
}
