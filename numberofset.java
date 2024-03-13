public class numberofset {
    public static void main(String[] args) {
        int n = 5;
        int d = n;
        int count = 0;
        while(d > 0){
            if((d & 1) == 1)
            {
                count++;
            }
            d=d>>1;
        }
        System.out.println(count);
}
}
