import java.util.Scanner;

public class TestScanner {
    //Scanner的使用
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的名字：");
        String name = scanner.nextLine();
        System.out.println("请输入您的年龄：");
        int age = scanner.nextInt();
        System.out.println("要不要给您介绍个对象（yes/no）");
        String re = scanner.next();
        if (re.equals("yes")){
            System.out.println("您的信息：");
            System.out.println("您的姓名："+name);
            System.out.println("您的年龄："+age);
        }else {
            System.out.println("好");
        }
    }
}
