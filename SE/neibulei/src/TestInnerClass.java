public class TestInnerClass {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        outer.print(inner);
    }
}
class Outer{
    private String message = "msg";
    private  static final int VALUE = 2;
    class Inner{
        public  void  print(){
            /**
             * 1.成员内部类：可以直接访问外部类的成员属性
             *      Outer.this.外部类的成员属性
             * 2.内部类实例化：准备外部类的对象
             * 内部类  对象名称 =  外部类对象。new 内部类（）
             * 3.不能有静态属性和方法
             * */
            System.out.println("Inner print :"+message);
        }
    }
    public void print(Inner inner){
        System.out.println("Outter print: ");
        inner.print();
    }
        }