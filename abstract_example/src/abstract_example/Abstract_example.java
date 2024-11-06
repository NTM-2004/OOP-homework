package abstract_example;

public class Abstract_example {

    public static void main(String[] args) {
        Person p = new Employee(3000, "Nguyen Minh", "Ha Noi");
        p.display();
        
        p = new Customer(5000, "Nang Sang", "Hai Phong");
        p.display();
    }
    
}
