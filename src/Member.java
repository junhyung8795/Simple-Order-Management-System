import java.util.ArrayList;

public class Member {
    private String name;
    private int age;
    ArrayList<Order> orderList;
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //결제하는 주체가 Member라고 가정하고 Memeber에서 물건을 주문한다고 가정
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void orderProduct(Product product) {
        //상품을 주문하면 상품을 주문 목록 Order[] orderList에 추가한다.
        //그런데 Order[]이니까 뭔가 배열이라 유동적으로 길이가 늘어나는게 좋을 것 같으니 ArrayList<Order>로 저장
        orderList.add();//orderList에 Product를 넣어야하나 order를 넣어야하나 고민
    }

}
