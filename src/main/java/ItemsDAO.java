import builder.ResponseDTO;

public class ItemsDAO {

    private static ItemsDAO Instance;
    private static ResponseDTO response;

    public static ItemsDAO getInstance(){
        if(Instance == null){
            Instance = new ItemsDAO(response);
        }
        return Instance;
    }

    ItemsDAO(ResponseDTO response){

    }
}