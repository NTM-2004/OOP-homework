package ex2_order;

import java.util.Currency;
import java.util.Scanner;

public class Ex2_order {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Customer customer1 = new Customer("Ha Noi", "0001", "Nguyen Tuan Minh");
        Customer customer2 = new Customer("Quat Lam", "0002", "Nguyen Quang Thang");
        Customer customer3 = new Customer("Pleiku", "0003", "Hoang Duc Man");
        
        Currency usd = Currency.getInstance("USD");
        Currency jpy = Currency.getInstance("JPY");
        Currency eur = Currency.getInstance("EUR");
        
        OrderLine line1  = new OrderLine(usd);
        OrderLine line2 = new OrderLine(jpy);
        OrderLine line3 = new OrderLine(eur);
        
        Order order1 = new Order(customer1, usd);
        order1.addLine(line1);
        order1.addLine(line3);
        Order order2 = new Order(customer2, usd);
        order2.addLine(line2);
        Order order3 = new Order(customer3, usd);
        order3.addLine(line3);
        
        OrderList orderList = new OrderList();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        System.out.println("Tong so don: " + orderList.getCount());
        System.out.println("");
        
        for(Order order: orderList.getOrders()){
            System.out.printf("Don hang cho khach co ma: %s \n" , order.getCustomer().getCode());
            System.out.println(order);
            System.out.println("Dong lenh:");
            for (OrderLine line : order.getOrderLines()) {
                System.out.println(" - " + line.getValue());
            }
            System.out.println("");
        }
        orderList.remove(order2);
        orderList.remove(order1);
        orderList.remove(order2);
        
        System.out.println("Tong so don: " + orderList.getCount());
        System.out.println("");
        for(Order order: orderList.getOrders()){
            System.out.printf("Don hang cho khach co ma: %s \n" , order.getCustomer().getCode());
            System.out.println(order);
            System.out.println("Dong lenh:");
            for (OrderLine line : order.getOrderLines()) {
                System.out.println(" - " + line.getValue());
            }
            System.out.println("");
            System.out.println("");
        }
    }
}
