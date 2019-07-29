public class Person1 {
    /**
     * static
     * 1.修饰属性：静态属性（类属性）
     * 2.访问方式：类名.属性名    this.属性名（不建议）
     * 3.修饰方法：静态方法（类方法）
     * 4.访问方式：类名.方法名
     * 5.静态属性，静态方法，如果在同一个类中访问 可以省去类名
     * 6.静态方法中不能访问非静态属性（变量）和方法=>成员属性，成员方法 this
     * */
    private static String country = "中国";
    private String name;
    private int age;
/**构造方法：
 * 1.方法名和类名相同，没有返回值
 * 2.如果没有定义构造方法，自动生成一个默认构造方法（无参）
 *   如果用户定义了构造方法，就不会提供默认构造方法
 * 3.调用本类构造方法调用this
 * */
public  Person1(){

}
     public Person1(int age){
         this.age = age;
     }
     public Person1(int age,String name){
         this(age);
         this.name = name;

     }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0||age>120){
            this.age = -1;
        }else {
            this.age = age;
        }
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPersonInFo(){
        return "姓名 : "+ this.getName()+"  " +
                "年龄 : "+this.getAge()+"国籍是："+Person1.country;//this.country;
    }
    public void print(){
        System.out.println("打印this："+this);
    }
    public static void staticMethod(){
        Person1 p3 = new Person1();
        System.out.println("这是person1的静态方法");
    }
}
