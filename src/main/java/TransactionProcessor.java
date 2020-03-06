
import java.util.*;

public class TransactionProcessor extends Factory {
    public void process(Map<String, String> args) {
        String endpoint = args.get("endpoint");
        if (endpoint.equals("createTransaction")) {
            createTransaction(args);
        }

        if (endpoint.equals("listTransactions")) {
            listTransactions();
        }
        return;
    }

    private void listTransactions() {
        // list transactions
    }

    private void createTransaction(Map<String, String> args) {
        // create transactions
    }
}