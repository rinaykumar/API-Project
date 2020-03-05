import java.util.ArrayList;
import java.util.List;
public class PaymentDAO {
    private static PaymentDAO Instance;

    private List<PaymentDTO> database = new ArrayList<>();

    public List<PaymentDTO> getInstance(){
        if(Instance == null){
            Instance = new PaymentDAO();
        }
        return database;
    }

    public void save(PaymentDTO data){
        database.add(data);
    }

    public void delete(PaymentDTO data){
        database.remove(data);
    }
}
