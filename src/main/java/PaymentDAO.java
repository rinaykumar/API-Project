public class PaymentDAO {
    private static PaymentDAO Instance;

    public static PaymentDAO getInstance(){
        if(Instance == null){
            Instance = new PaymentDAO();
        }
        return Instance;
    }

    private PaymentDAO(){

    }
}
