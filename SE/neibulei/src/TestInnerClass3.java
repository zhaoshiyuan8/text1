public class TestInnerClass3 {
    /**
     * 方法内部类---局部内部类
     *JDK8之前，JDK8 隐式添加final
     *
     *  */
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.display(100);
    }
}
class Outer2{
    private static int num;
    public void display(int args){
        int a = 10;
        int b = a;
        class Inner{
            public void print(){
                num++;
                System.out.println("Outer的成员属性num="+num);
                System.out.println("Outer的成员方法args="+args);
                System.out.println("局部变量b="+b);
            }
        }
        a = 100;
        new Inner().print();
    }
}