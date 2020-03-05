public class PaymentDTO {
    public final String method;
    public final String code;

    public PaymentDTO(String method, String code) {
        this.method = method;
        this.code = code;
    }
}
