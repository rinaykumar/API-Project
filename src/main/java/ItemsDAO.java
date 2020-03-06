public class ItemsDAO {

    private static ItemsDAO Instance;

    public static ItemsDAO getInstance(){
        if(Instance == null){
            Instance = new ItemsDAO();
        }
        return Instance;
    }

    public ItemsDTO addItems(String name, String price, String machineCode) {
        return new ItemsDTO(name, price, machineCode);
    }
}