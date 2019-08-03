public class Person {
    private  String name;
    private boolean gender;
    public Person(){
        System.out.println("这是Person的无参构造方法");

    }
    public Person(boolean gender,String name){
        this.name = name;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void info(){
        System.out.println("这是父类的info方法");
    }

    public static void main(String[] args) {
       /**Student student = new Student("张三",true);
        Person person = new Person(true,"张三");
        向上转型 子类对象 转换为父类对象
        Person person = new Student("张三",true);
        person.info();*/
       /** student.setName("丁成");
        student.setSchool("西安工程大学");
        student.setNumber("41608010116");
        System.out.println("姓名："+student.getName());
        student.info();*/
        /**向下转型  父类对象转换为 子类对象
         *出现ClassCastException异常
         * Student student = (Student) new Person(true,"李四");
         * student.info();
         */
        /**Person person = new Student("王八",true);
        Student student =(Student) person;
       */

        Student student = new Student("王八",true);
         Person person = new Student("李四",false);
         if (person instanceof Student){
             Student student1 = (Student)person;
             System.out.println("person可以转化为Student对象");
         }else {
             System.out.println("person对象无法转化为Student对象");
         }


    }
}
/**
 * 1.extends 继承关键字   entends +父类名称
 * 2.单继承  extends只能有一个父类
 * 3.父类无默认构造方法，子类必须提供有参数构造方法
 * 4.子类无参数构造方法调用
 * 5.super是调用父类的构造方法，super（参数列表）
 * 6.子类访问父类的成员属性，需要具备访问权限getter setter
 * 7.子类继承父类的所有结构
 * 8.类被final修饰，不能被继承
 * 覆写：
 * 1.继承关系中
 * 2.子类定义和父类相同的属性和方法
 * 3.方法名，参数列表相同，访问权限>=父类的访问权限
 * 4.子类覆写父类方法，如果要继续保留弗雷德方法的功能 super.方法名（参数列表）
 * 5.父类方法被final修饰，不能腹泻
 * */
class Student extends Person{
    private String number;
    private String school;
    public Student(){
        super();
    }

    public Student(String name,boolean gender){

        System.out.println("这是Student的有参构造方法");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void info(){
        super.info();
        System.out.println("这是子类的info");
    }
}

