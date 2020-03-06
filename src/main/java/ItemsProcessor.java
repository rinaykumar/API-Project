import builder.ResponseDTO;

import java.util.*;

public class ItemsProcessor extends Factory {

    public static List<ItemsDTO> itemsList = new ArrayList<ItemsDTO>();
    Date date = new Date();

    public ResponseDTO process(Map<String, String> args) {

        String endpoint = args.get("endpoint");

        // After getting endpoint, either addItem or listItems method is called
        if (endpoint.equals("addItem")) {
            return addItems(args);
        }

        if (endpoint.equals("listItems")) {
            return listItems(args);
        }
        return null;
    }

    public ResponseDTO addItems(Map<String, String> args) {
        // For testing
        System.out.println("From ItemsProcessor");
        System.out.println("Add Item");

        UUID uuid = UUID.randomUUID();
        String machineCode = uuid.toString();

        ItemsDAO addItemsDAO = new ItemsDAO();
        ItemsDTO addItemsDTO = addItemsDAO.addItems(args.get("name"), args.get("price"), machineCode);
        args.put("machineCode", machineCode);
        ResponseDTO addItemsResponseDTO = new ResponseDTO(date, args, "OK", "Item Added");
        itemsList.add(addItemsDTO);

        return addItemsResponseDTO;
    }

    public ResponseDTO listItems(Map<String, String> args) {
        // For testing
        System.out.println("From ItemsProcessor");
        System.out.println("List Items");

        return new ResponseDTO(date, args, "OK", "List of Items");
    }
}
