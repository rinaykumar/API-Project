import java.util.*;

public class ItemsProcessor extends Factory {

    public void process(Map<String, String> args) {

        String endpoint = args.get("endpoint");

        // After getting endpoint, either addItem or listItems method is called
        if (endpoint.equals("addItem")) {
            addItems(args);
        }

        if (endpoint.equals("listItems")) {
            listItems();
        }
    }

    public void addItems(Map<String, String> args) {
        // For testing
        System.out.println("From ItemsProcessor");
        System.out.println("Add Item");
        // To do: add name, price, machineCode via DAO? Then send where?
    }

    public void listItems() {
        // For testing
        System.out.println("From ItemsProcessor");
        System.out.println("List Items");
        // To do: list all items, as in list DAO objects?
    }
}
