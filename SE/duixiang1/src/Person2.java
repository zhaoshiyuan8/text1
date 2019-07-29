public class Person2 {
    /**
     * 属性赋值：
     * 1.直接赋值
     * 2.通过构造块
     * 3.通过构造块（传入参数，执行方法）
     *
     * 4.通过对象访问修改属性的方法进行赋值
     *
     *
     * 1.构造块在构造方法之前执行
     * 2.每次创建对象，构造块都要执行
     * */
    static {
        /**
         *1.执行一次，
         * 2.在构造块，构造方法前执行
         * */
        System.out.println("静态代码块执行");
    }
    private int num;
    {
        System.out.println("构造块执行");
    }
    public Person2(){
        System.out.println("构造方法执行");
    }

    public static void main(String[] args) {
       new Person2();
    }
}
