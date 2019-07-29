public class TestPerson1 {
    public static void main1(String[] args) {
        /*Person1 person = new Person1();
        person.name = "张三";
        person.age = 18;
        person.setName("张三");
        String info = person.getPersonInFo();
        System.out.println(info);*/
    }

    public static void main2(String[] args) {
        Person1 person = new Person1(199,"丁成");
        String info = person.getPersonInFo();
        System.out.println(info);
        System.out.println("[1,2,3]数组长度："+new int[]{1,2,3}.length);
        System.out.println(new Person1(18,"李四").getPersonInFo());

    }

    public static void main3(String[] args) {
        Person1 person = new Person1();
        String x =person.getPersonInFo();
        System.out.println(x);
        person.print();
        System.out.println(person);
        Person1 person1 = new Person1();
        person1.print();
        System.out.println(person1);
        Person1 p1 = new Person1(18);
        System.out.println(p1.getPersonInFo());
        Person1 p2 = new Person1(19);
        System.out.println(p2.getPersonInFo());
        System.out.println("----------------");
        p1.setCountry("美国");
        System.out.println(p1.getPersonInFo());
        System.out.println(p2.getPersonInFo());
    }

    public static void main(String[] args) {
        Person1.staticMethod();
    }
}
