public class App {
    public static void main(String[] args) {
        long sum=0;
        for (long i=1;i<=2147483647;i++){
            if (i%2==1){
                sum+=i;
            }
            i++;
        }
        System.out.println("1到2147483647区间内所有奇数的和为："+sum);
    }
}
