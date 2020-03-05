import java.util.*;

//I'm making the assumption of using PaymentDTO (as a cursor) to access PaymentDAO then return ResponseDTO
public class PaymentMethods extends Processor {
    public static PaymentDAO PaymentDatabase = new PaymentDAO();
    Date date = new Date();

    public ResponseDTO process(Map<String, String> args) {

        String endpoint = args.get("endpoint");

        // After getting endpoint, either addItem or listItems method is called
        if (endpoint.equals("addItem")) {
            return addPay(args);
        }

        if (endpoint.equals("listItems")) {
            return getPay();
        }
        return null;
    }

    public ResponseDTO addPay(Map<String,String> args){
        UUID uuid = UUID.randomUUID();
        String machineCode = uuid.toString();

        PaymentDTO addPayDTO = new PaymentDTO(args.get("method"), machineCode);
        args.put("machineCode", machineCode);
        PaymentDatabase.save(addPayDTO);
        return new ResponseDTO(date, "OK", "Item Added", args);
    }

    public ResponseDTO getPay(){
        PaymentDatabase.getInstance();
        return new ResponseDTO(date, "OK", "List of Items");
    }
}

