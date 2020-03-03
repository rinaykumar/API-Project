
import java.util.Date;

public class ResponseBuilder {
    private String name;
    private Date date;

    public ResponseBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ResponseBuilder setDate(Date date) {
        this.date = date;
        return this;
    }

    public ResponseDTO build(){
        return new ResponseDTO(this.name, this.date);
    }
}
