public class Processor {
    public static Processor makeProcess(String request, String[] args){
        switch(request){
            case "/addPaymentMethod":
                return new PaymentMethods().addPay(args);

            case "/getAllPaymentMethods":
                return new PaymentMethods().getPay();
        }

        return null;
    }


}
