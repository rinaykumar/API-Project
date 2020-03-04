import java.util.List;
import java.util.Stack;

public class TransactionDAO {

    private static TransactionDAO Instance;

    public static TransactionDAO getInstance(){
        if(Instance == null){
            Instance = new TransactionDAO();
        }
        return Instance;
    }

    public static List listTransaction() {
        List<Integer> transactionList = new Stack<Integer>();
        return transactionList;
    }

    public static boolean isTransactionValid(TransactionDAO Instance) {
        return true;
    }

    private TransactionDAO() {
        // constructor
    }
}