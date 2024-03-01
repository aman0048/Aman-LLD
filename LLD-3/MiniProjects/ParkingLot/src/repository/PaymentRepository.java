package repository;

import exception.PaymentNotFoundException;
import models.Payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentRepository {
     private final Map<Integer, Payment> paymentMap;

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
         paymentMap.put(payment.getId(), payment);
         System.out.println("Payment has been added successfully");
     }
}
