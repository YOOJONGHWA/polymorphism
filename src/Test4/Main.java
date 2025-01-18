package Test4;

public class Main {

    public static void main(String[] args) {

        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // 고객 객체 생성
        Customer normalCustomer = new NormalCustomer("노말", "노말", 10000, 0.0);
        Customer vipCustomer = new VipCustomer("VIP", "VIP", 20000, 0.5);

        normalCustomer.displayInfo();
        normalCustomer.paid();

        vipCustomer.displayInfo();
        vipCustomer.paid();

        customerRepository.addCustomer(normalCustomer);
        customerRepository.addCustomer(vipCustomer);

        // 저장된 고객 정보 출력
        System.out.println("저장된 고객 정보:");
        customerRepository.getAllCustomers();

    }

}
