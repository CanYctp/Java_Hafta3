public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager =new CustomerManager(new OracleCustomerDal());
       // Son düzenlemelerden sonra gerek yok
        // customerManager.customerDal =new MySqlCustomerDal();
        customerManager.add();

    }
}