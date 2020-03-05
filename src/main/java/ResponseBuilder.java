
import java.util.Date;
import java.util.Map;

public class ResponseBuilder {
    private String responseCode;
    private Map<String,String> params;
    private String response;
    private Date date;



    public ResponseBuilder setDate(Date date) {
        this.date = date;
        return this;
    }

    public ResponseBuilder setResponse(String response){
        this.response = response;
        return this;
    }

    public ResponseBuilder setPara(Map<String,String> params){
        this.params = params;
        return this;
    }

    public ResponseBuilder setResCode(String responseCode){
        this.responseCode = responseCode;
        return this;
    }

    public ResponseDTO build(){
        return new ResponseDTO( this.date, this.response, this.responseCode, this.params);
    }
}
