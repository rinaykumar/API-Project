
import java.util.Date;
import java.util.Map;

public class ResponseDTO {

    public final String responseCode;
    public Map<String,String> params = null;
    public final String response;
    public final Date date;

    public ResponseDTO( Date date, String responseCode, String response, Map<String,String>params) {

        this.date = date;
        this.params = params;
        this.response = response;
        this.responseCode = responseCode;
    }

    public ResponseDTO( Date date, String responseCode, String response) {

        this.date = date;
        this.response = response;
        this.responseCode = responseCode;
    }
}
