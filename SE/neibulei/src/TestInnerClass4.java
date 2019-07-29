public class TestInnerClass4 {
    public static void main(String[] args) {
     /*Chat chat = new Chat(){
            //没有class 类名
         //没有构造方法
         public void sendMessage(){
                System.out.println("匿名内部类的方法执行");
            }
        };
     chat.sendMessage();*/
     new Chat(){
         public int val = 10;
         int a = 10;
         public void  sendMessage(){
             System.out.println("匿名内部类的方法执行");
             System.out.println(a);
         }
     }.sendMessage();
    }
}
/**
 * 匿名内部类：除了方法内部的特点外
 * 必须继承一个抽象类或者实现一个接口
 * 没构造方法
 * */
interface Chat{
    //接口里的访问修饰符为public
    void sendMessage();
}
