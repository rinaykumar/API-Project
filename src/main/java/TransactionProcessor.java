import builder.ResponseDTO;
import java.util.*;

public class TransactionProcessor extends Factory {

    public static List<TransactionDTO> transactionList = new ArrayList<TransactionDTO>();
    Date date = new Date();

    public ResponseDTO process(Map<String, String> args) {

        String endpoint = args.get("endpoint");

        if (endpoint.equals("createTransaction")) {
            System.out.println("Inside Create Transactions");
            return createTransaction(args);
        }

        if (endpoint.equals("listTransactions")) {
            System.out.println("Inside Listing Transactions");
            return listTransactions(args);
        }
        return null;
    }

    private ResponseDTO listTransactions(Map<String, String> args) {
        return new ResponseDTO(date, args, "OK", "List of Transactions");
        // list transactions
    }

    private ResponseDTO createTransaction(Map<String, String> args) {
        // create transactions

        TransactionDTO createTransactionDTO = new TransactionDTO(args.get("paymentMethod"),args.get("itemCode"));
        ResponseDTO createTransactionResponseDTO = new ResponseDTO(date, args, "OK", "Item Added");

        transactionList.add(createTransactionDTO);
        return createTransactionResponseDTO;
    }
}