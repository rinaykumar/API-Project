public class TransactionDAO {

    private static TransactionDAO Instance;

    public static TransactionDAO getInstance(){
        if(Instance == null){
            Instance = new TransactionDAO();
        }
        return Instance;
    }

    private TransactionDAO() {
        // constructor
    }
}