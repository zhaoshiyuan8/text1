public class Person {
    private String name;
    private int age;
    //false:女  true：男
    private boolean gender;
    //身高
    private int height;
    public Person(boolean gender,String name){
        this.gender = gender;
        this.name = name;
    }

    public void eat(){
        System.out.println("吃  食物链顶端");
    }
    public void think(){
        System.out.println("人，是有思考力的");
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
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {

    }

    public static void main1(String[] args) {
        Person zhangsan= new Person(true,"张三");
        Person lisi = new Person(false,"李四");
        lisi.setAge(20);
        zhangsan.setAge(19);
        System.out.println(zhangsan.getName());
        System.out.println(zhangsan.getAge());
        System.out.println(lisi.getAge());
        zhangsan.eat();
        zhangsan.think();
        System.out.println(lisi.getName());
        System.out.println(lisi.gender);
        lisi.eat();
        lisi.think();
    }
}
