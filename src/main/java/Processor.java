/**
 Has a process() method that returns a ResponseDto object //done
Each endpoint is a subclass of Processor //done
Takes a hashmap of key value args //done
Use a factory to create these, based on the endpoint //done
Every processor uses a builder and returns the output of builder.build()
**/

import java.util.*;
public class Processor {


    public static ResponseDTO makeProcess(String input){
        int firstSlashIndex,
                firstQuestIndex,
                httpIndex,
                firstEqualIndex,
                firstAndIndex = 0;
        String method = ""; // Stores the process
        Map<String, String> args = new HashMap<String, String>(); // Stores the params and values

        // Parse the input to get process and params/values
        firstSlashIndex = input.indexOf('/');
        firstQuestIndex = input.indexOf('?');
        httpIndex = input.indexOf("HTTP");
        firstEqualIndex = input.indexOf('=');
        firstAndIndex = input.indexOf('&');

        if (firstQuestIndex != -1) {
            method = input.substring(firstSlashIndex+1, firstQuestIndex);
        } else {
            method = input.substring(firstSlashIndex+1, httpIndex-1);
        }

        // Add endpoint name to map
        args.put("endpoint", method);

        if (firstEqualIndex != -1) {
            String param = input.substring(firstQuestIndex+1, firstEqualIndex);
            String value = "";
            if (firstAndIndex != -1) {
                value = input.substring(firstEqualIndex+1, firstAndIndex);
            } else {
                value = input.substring(firstEqualIndex+1, httpIndex-1);
            }
            args.put(param, value);
        }

        if (firstEqualIndex != input.lastIndexOf('=')) {
            String param = input.substring(firstAndIndex+1, input.indexOf('=', firstEqualIndex+1));
            String value = input.substring(input.indexOf('=', firstEqualIndex+1)+1, httpIndex-1);
            args.put(param, value);
        }

        // Testing parsing by printing out
        for (Map.Entry<String, String> entry : args.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
       // System.out.println("----------------TEST--------------");
        //System.out.println(args);

        switch(method){
            case "addPaymentMethod":
            case "getAllPaymentMethods":
                //System.out.println("FACTORY");
                PaymentMethods PaymentMethods = new PaymentMethods();
                return PaymentMethods.process(args);

               // ResponseBuilder builder = new ResponseBuilder()
               //         .setDate(new Date())
               //         .setResCode("OK")
               //         .setResponse("To be updated. . . ")
                 //       .setPara(args);
                 //      builder.build();



              //  ResponseBuilder builder2 = new ResponseBuilder()
                //        .setDate(new Date())
                  //      .setResCode("OK")
                    //    .setResponse("To be updated. . . ")
                      //  .setPara(args);
                        //builder2.build();
        }

        return null;
    }


}
