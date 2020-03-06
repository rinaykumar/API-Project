import builder.ResponseBuilder;
import builder.ResponseDTO;
import java.util.*;

public class TransactionProcessor extends Factory {

    public static List<TransactionDTO> transactionList = new ArrayList<TransactionDTO>();
    Date date = new Date();

    public ResponseDTO process(Map<String, String> args) {

        String endpoint = args.get("endpoint");

        if (endpoint.equals("createTransaction")) {
            return createTransaction(args);
        }

        if (endpoint.equals("listTransactions")) {
            return listTransactions(args);
        }
        return null;
    }

    private ResponseDTO listTransactions(Map<String, String> args) {

        // Use response builder to build response
        ResponseBuilder buildResponse = new ResponseBuilder();
        buildResponse.setDate(date);
        buildResponse.setParams(args);
        buildResponse.setResponseCode("OK");
        buildResponse.setResponse("List of Items");

        return buildResponse.build();
    }

    private ResponseDTO createTransaction(Map<String, String> args) {
        TransactionDAO createTransactionDAO = new TransactionDAO();
        TransactionDTO createTransactionDTO =  createTransactionDAO.createTransaction(args.get("paymentMethod"),args.get("itemCode"));

        transactionList.add(createTransactionDTO);

        // Use response builder to build response
        ResponseBuilder buildResponse = new ResponseBuilder();
        buildResponse.setDate(date);
        buildResponse.setParams(args);
        buildResponse.setResponseCode("OK");
        buildResponse.setResponse("Item Added");

        return buildResponse.build();
    }
}