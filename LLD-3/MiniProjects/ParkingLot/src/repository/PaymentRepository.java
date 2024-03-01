package repository;

import exception.PaymentNotFoundException;
import models.Payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentRepository {
     private final Map<Integer, Payment> paymentMap;
    private static int counter = 0;

     public PaymentRepository(){
         this.paymentMap = new HashMap<>();
     }

     public Payment get(int paymentId){
         Payment payment = paymentMap.get(paymentId);
         if (payment == null){
             throw new PaymentNotFoundException("Payment not found for id " + paymentId);
         }
         return payment;
     }

     public void put(Payment payment){
         payment.setId(++counter);
         paymentMap.put(payment.getId(), payment);
         System.out.println("Payment has been added successfully");
     }
}
