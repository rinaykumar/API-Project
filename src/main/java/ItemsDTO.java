public class ItemsDTO {
    public final String name;
    public final String price;
    public final String machineCode; // Not needed in DTO?

    public ItemsDTO(String name, String price, String machineCode) {
        this.name = name;
        this.price = price;
        this.machineCode = machineCode; // Not needed in DTO?
    }
}
