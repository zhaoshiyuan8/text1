import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Order order = new Order();

        Goods[] goodsArray = new Goods[3];
        order.setGoodsArray(goodsArray);
        System.out.println("请输入商品信息，格式如下：");
        System.out.println("商品名称 商品价格 商品数量");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < goodsArray.length; i++) {
            String line = scanner.nextLine();
            String [] segments =line.split(" ");
            goodsArray[i] = new Goods(segments[0],
                    Double.parseDouble(segments[1]),
                            Integer.parseInt(segments[2]));
        }
        System.out.println("请输入折扣 1-9的整数：");
            String discountstr = scanner.nextLine();
            order.setDiscount(Integer.parseInt(discountstr));
            Double totalPrice = order.getTotalPrice();
        System.out.println("总金额为："+totalPrice);
        System.out.println("请输入支付金额：");
        String paystr = scanner.nextLine();
        order.setPay(Double.parseDouble(paystr));
        System.out.println(order);
    }
}
class Order{
    private Integer discount = 10;
    private Double pay;
    private Goods[] goodsArray;

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    public void setGoodsArray(Goods[] goodsArray) {
        this.goodsArray = goodsArray;
    }

    public Double getTotalPrice(){
        Double total = 0.0;
        for (int i = 0; i <goodsArray.length ; i++) {
            total+=goodsArray[i].getTotalPrice();
        }
        return total*discount*0.1D;
    }
    public Double getGiveChange(){
        return this.pay-this.getTotalPrice();
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("***************消费单*************").append("\n")
                .append("名称\t单价\t数量\t金额").append("\n");
        for (int i = 0; i < goodsArray.length; i++) {
            sb.append(this.goodsArray[i].toString()).append("\n");
        }
        sb.append("\n")
                .append("----------------------").append("\n")
                .append("折扣：").append(this.discount).append("折").append("\n")
                .append("消费总金额：").append(this.getTotalPrice()).append("\n")
                .append("实际支付金额：").append(this.pay).append("\n")
                .append("找零：").append(this.getGiveChange()).append("\n")
                .append("本次消费积分：").append(this.getTotalPrice().intValue()).append("\n");
                return sb.toString();
    }
}
class Goods{
    private String name;
    private Double price;
    private Integer number;
    public Goods(String name,Double price,Integer number){
        this.name = name;
        this.price = price;
        this.number = number;
    }
    public Double getTotalPrice(){
        return this.price*this.number;
    }

    public String toString() {
        return this.name+"\t"+"￥"+this.price+"\t"
                +this.number+"\t"+this.getTotalPrice();
    }
}