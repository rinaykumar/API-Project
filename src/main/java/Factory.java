import java.util.*;

public class Factory {

    private String input;

    public void factory(String input) {
        int firstSlashIndex,
                firstQuestIndex,
                httpIndex,
                firstEqualIndex,
                firstAndIndex = 0;
        String process = ""; // Stores the process
        Map<String, String> args = new HashMap<String, String>(); // Stores the params and values

        // Parse the input to get process and params/values
        firstSlashIndex = input.indexOf('/');
        firstQuestIndex = input.indexOf('?');
        httpIndex = input.indexOf("HTTP");
        firstEqualIndex = input.indexOf('=');
        firstAndIndex = input.indexOf('&');

        if (firstQuestIndex != -1) {
            process = input.substring(firstSlashIndex+1, firstQuestIndex);
        } else {
            process = input.substring(firstSlashIndex+1, httpIndex-1);
        }

        if (firstEqualIndex != -1) {
            String param = input.substring(firstQuestIndex+1, firstEqualIndex);
            String value = "";
            if (firstAndIndex != -1) {
                value = input.substring(firstEqualIndex+1, firstAndIndex);
            } else {
                value = input.substring(firstEqualIndex+1, httpIndex-1);
            }
            args.put(param, value);
        }

        if (firstEqualIndex != input.lastIndexOf('=')) {
            String param = input.substring(firstAndIndex+1, input.indexOf('=', firstEqualIndex+1));
            String value = input.substring(input.indexOf('=', firstEqualIndex+1)+1, httpIndex-1);
            args.put(param, value);
        }

        // Testing parsing by printing out
        System.out.println("process: " + process);

        for (Map.Entry<String, String> entry : args.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Instantiate correct processor subclass based on value stored in process
        switch(process) {
            case "addPaymentMethod":
            case "getAllPaymentMethods":
                // Send to PaymentProcessor
                break;
            case "addItems":
            case "listItems":
                // Send to ItemsProcessor
                break;
            case "createTransaction":
            case "listTransactions":
                // Send to TransactionsProcessor
                break;
            default:
                // Not valid, print error code?
        }
    }

}
