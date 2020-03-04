import builder.ResponseDTO;

import java.util.*;

public class ItemsProcessor extends Factory {

    public ResponseDTO process(Map<String, String> args) {

        String endpoint = args.get("endpoint");

        // After getting endpoint, either addItem or listItems method is called
        if (endpoint.equals("addItem")) {
            return addItems(args);
        }

        if (endpoint.equals("listItems")) {
            listItems();
        }
        return null;
    }

    public ResponseDTO addItems(Map<String, String> args) {
        // For testing
        System.out.println("From ItemsProcessor");
        System.out.println("Add Item");
        // To do: add name, price, machineCode via DAO? Then send where?

        Date date = new Date();
        UUID uuid = UUID.randomUUID();
        String machineCode = uuid.toString();

        //ItemsDTO addItemsDTO = new ItemsDTO(args.get("name"), args.get("price"), machineCode);

        args.put("machineCode", machineCode);

        ResponseDTO addItemsResponseDTO = new ResponseDTO(date, args, "OK", "Item Added");

        //ItemsDAO addItemsResponseDAO = new ItemsDAO(addItemsResponseDTO);

        //return addItemsResponseDAO;

        return addItemsResponseDTO;
    }

    public void listItems() {
        // For testing
        System.out.println("From ItemsProcessor");
        System.out.println("List Items");
        // To do: list all items, as in list DAO objects?
    }
}
