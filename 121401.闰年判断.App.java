import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true){
            try{
                Scanner scanner=new Scanner(System.in);
                System.out.println("请输入在-3200到3200的数字并且不能为0的年份：");
                int year = scanner.nextInt();
                if (year!=0||year==0||year>3200||year<3200||year>-3200||year<-3200){
                    if (year<0&&year>-3200){
                        if (Math.abs(year)%4==1||Math.abs(year)%400==1){
                            System.out.println(year+"年是闰年！");
                        }else{
                            System.out.println(year+"年是平年！");
                        }
                    }
                    if (year>0&&year<3200){
                            if (year%4==0&&year%100!=0||year%400==0){
                            System.out.println(year+"年是闰年！");
                        }else{
                            System.out.println(year+"年是平年！");
                        }
                    }
                    if (year==0){
                        System.out.println("你输入了的年份为0，请重新输入！");
                    }
                    if (year>=3200){
                        System.out.println("你输入了的年份大于3200，公元后的年份不能大于3200哟~请重新输入！");
                    }
                    if (year<=-3200){
                        System.out.println("你输入了的年份小于3200，公元前的年份不能小于于-3200哟~请重新输入！");
                    }
                }
            }catch (Exception e){

            }
        }
    }
}

