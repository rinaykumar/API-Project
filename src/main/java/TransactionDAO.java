import java.util.List;
import java.util.ArrayList;
import builder.ResponseDTO;

public class TransactionDAO {

    private static TransactionDAO Instance;
    private List<TransactionDTO> database = new ArrayList<>();
    public static TransactionDAO getInstance(){
        if(Instance == null){
            Instance = new TransactionDAO();
        }
        return Instance;
    }

    public static List listTransaction() {
        List<Integer> transactionList = new ArrayList<>();
        return transactionList;
    }

    public static boolean isTransactionValid(TransactionDAO Instance) {
        return true;
    }

    private TransactionDAO() {
        // constructor
    }
}